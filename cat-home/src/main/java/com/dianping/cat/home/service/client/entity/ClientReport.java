package com.dianping.cat.home.service.client.entity;

import static com.dianping.cat.home.service.client.Constants.ATTR_DOMAIN;
import static com.dianping.cat.home.service.client.Constants.ENTITY_CLIENT_REPORT;

import java.util.LinkedHashMap;
import java.util.Map;

import com.dianping.cat.home.service.client.BaseEntity;
import com.dianping.cat.home.service.client.IVisitor;

public class ClientReport extends BaseEntity<ClientReport> {
   private String m_domain;

   private java.util.Date m_startTime;

   private java.util.Date m_endTime;

   private Map<String, Domain> m_domains = new LinkedHashMap<String, Domain>();

   public ClientReport() {
   }

   public ClientReport(String domain) {
      m_domain = domain;
   }

   @Override
   public void accept(IVisitor visitor) {
      visitor.visitClientReport(this);
   }

   public ClientReport addDomain(Domain domain) {
      m_domains.put(domain.getId(), domain);
      return this;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof ClientReport) {
         ClientReport _o = (ClientReport) obj;

         if (!equals(getDomain(), _o.getDomain())) {
            return false;
         }

         return true;
      }

      return false;
   }

   public Domain findDomain(String id) {
      return m_domains.get(id);
   }

   public Domain findOrCreateDomain(String id) {
      Domain domain = m_domains.get(id);

      if (domain == null) {
         synchronized (m_domains) {
            domain = m_domains.get(id);

            if (domain == null) {
               domain = new Domain(id);
               m_domains.put(id, domain);
            }
         }
      }

      return domain;
   }

   public String getDomain() {
      return m_domain;
   }

   public Map<String, Domain> getDomains() {
      return m_domains;
   }

   public java.util.Date getEndTime() {
      return m_endTime;
   }

   public java.util.Date getStartTime() {
      return m_startTime;
   }

   @Override
   public int hashCode() {
      int hash = 0;

      hash = hash * 31 + (m_domain == null ? 0 : m_domain.hashCode());

      return hash;
   }

   @Override
   public void mergeAttributes(ClientReport other) {
      assertAttributeEquals(other, ENTITY_CLIENT_REPORT, ATTR_DOMAIN, m_domain, other.getDomain());

      if (other.getStartTime() != null) {
         m_startTime = other.getStartTime();
      }

      if (other.getEndTime() != null) {
         m_endTime = other.getEndTime();
      }
   }

   public Domain removeDomain(String id) {
      return m_domains.remove(id);
   }

   public ClientReport setDomain(String domain) {
      m_domain = domain;
      return this;
   }

   public ClientReport setEndTime(java.util.Date endTime) {
      m_endTime = endTime;
      return this;
   }

   public ClientReport setStartTime(java.util.Date startTime) {
      m_startTime = startTime;
      return this;
   }

}
