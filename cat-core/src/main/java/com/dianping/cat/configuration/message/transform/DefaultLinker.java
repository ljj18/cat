package com.dianping.cat.configuration.message.transform;

import java.util.ArrayList;
import java.util.List;
import com.dianping.cat.configuration.message.entity.AtomicMessageConfig;
import com.dianping.cat.configuration.message.entity.Domain;
import com.dianping.cat.configuration.message.entity.Property;

public class DefaultLinker implements ILinker {
   private boolean m_deferrable;

   private List<Runnable> m_deferedJobs = new ArrayList<Runnable>();

   public DefaultLinker(boolean deferrable) {
      m_deferrable = deferrable;
   }

   public void finish() {
      for (Runnable job : m_deferedJobs) {
         job.run();
      }
   }

   @Override
   public boolean onDomain(final AtomicMessageConfig parent, final Domain domain) {
      if (m_deferrable) {
         m_deferedJobs.add(new Runnable() {
            @Override
            public void run() {
               parent.addDomain(domain);
            }
         });
      } else {
         parent.addDomain(domain);
      }

      return true;
   }

   @Override
   public boolean onProperty(final Domain parent, final Property property) {
      if (m_deferrable) {
         m_deferedJobs.add(new Runnable() {
            @Override
            public void run() {
               parent.addProperty(property);
            }
         });
      } else {
         parent.addProperty(property);
      }

      return true;
   }
}
