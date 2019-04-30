package com.dianping.cat.core.config;

public class _INDEX {
   public static Class<?>[] getEntityClasses() {
      return new Class<?>[] { BusinessConfigEntity.class, ConfigEntity.class };
   }

   public static Class<?>[] getDaoClasses() {
      return new Class<?>[] { BusinessConfigDao.class, ConfigDao.class };
   }

   public static Class<?>[] getDoClasses() {
      return new Class<?>[] { BusinessConfig.class, Config.class };
   }

}
