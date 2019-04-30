package com.dianping.cat.home.dal.report;

public class _INDEX {
   public static Class<?>[] getEntityClasses() {
      return new Class<?>[] { AlertSummaryEntity.class, AlterationEntity.class, BaselineEntity.class, ConfigModificationEntity.class, MetricGraphEntity.class, MetricScreenEntity.class, OverloadEntity.class, TopologyGraphEntity.class };
   }

   public static Class<?>[] getDaoClasses() {
      return new Class<?>[] { AlertSummaryDao.class, AlterationDao.class, BaselineDao.class, ConfigModificationDao.class, MetricGraphDao.class, MetricScreenDao.class, OverloadDao.class, TopologyGraphDao.class };
   }

   public static Class<?>[] getDoClasses() {
      return new Class<?>[] { AlertSummary.class, Alteration.class, Baseline.class, ConfigModification.class, MetricGraph.class, MetricScreen.class, Overload.class, TopologyGraph.class };
   }

}
