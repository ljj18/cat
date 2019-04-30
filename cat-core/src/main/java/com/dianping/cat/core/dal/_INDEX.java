package com.dianping.cat.core.dal;

public class _INDEX {
   public static Class<?>[] getEntityClasses() {
      return new Class<?>[] { DailyReportContentEntity.class, DailyReportEntity.class, HostinfoEntity.class, MonthlyReportContentEntity.class, MonthlyReportEntity.class, ProjectEntity.class, HourlyReportEntity.class, HourlyReportContentEntity.class, TaskEntity.class, WeeklyReportContentEntity.class, WeeklyReportEntity.class };
   }

   public static Class<?>[] getDaoClasses() {
      return new Class<?>[] { DailyReportContentDao.class, DailyReportDao.class, HostinfoDao.class, MonthlyReportContentDao.class, MonthlyReportDao.class, ProjectDao.class, HourlyReportDao.class, HourlyReportContentDao.class, TaskDao.class, WeeklyReportContentDao.class, WeeklyReportDao.class };
   }

   public static Class<?>[] getDoClasses() {
      return new Class<?>[] { DailyReportContent.class, DailyReport.class, Hostinfo.class, MonthlyReportContent.class, MonthlyReport.class, Project.class, HourlyReport.class, HourlyReportContent.class, Task.class, WeeklyReportContent.class, WeeklyReport.class };
   }

}
