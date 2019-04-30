package com.dianping.cat.home.dal.report;

import static com.dianping.cat.home.dal.report.MetricScreenEntity.CONTENT;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.CREATION_DATE;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.END_POINTS;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.GRAPH_NAME;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.ID;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.KEY_ID;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.MEASUREMENTS;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.NAME;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.UPDATETIME;
import static com.dianping.cat.home.dal.report.MetricScreenEntity.VIEW;

import org.unidal.dal.jdbc.DataObject;

public class MetricScreen extends DataObject {
   private int m_id;

   private String m_name;

   private String m_graphName;

   private String m_view;

   private String m_endPoints;

   private String m_measurements;

   private String m_content;

   private java.util.Date m_creationDate;

   private java.util.Date m_updatetime;

   private int m_keyId;

   @Override
   public void afterLoad() {
      m_keyId = m_id;
      super.clearUsage();
   }

   public String getContent() {
      return m_content;
   }

   public java.util.Date getCreationDate() {
      return m_creationDate;
   }

   public String getEndPoints() {
      return m_endPoints;
   }

   public String getGraphName() {
      return m_graphName;
   }

   public int getId() {
      return m_id;
   }

   public int getKeyId() {
      return m_keyId;
   }

   public String getMeasurements() {
      return m_measurements;
   }

   public String getName() {
      return m_name;
   }

   public java.util.Date getUpdatetime() {
      return m_updatetime;
   }

   public String getView() {
      return m_view;
   }

   public MetricScreen setContent(String content) {
      setFieldUsed(CONTENT, true);
      m_content = content;
      return this;
   }

   public MetricScreen setCreationDate(java.util.Date creationDate) {
      setFieldUsed(CREATION_DATE, true);
      m_creationDate = creationDate;
      return this;
   }

   public MetricScreen setEndPoints(String endPoints) {
      setFieldUsed(END_POINTS, true);
      m_endPoints = endPoints;
      return this;
   }

   public MetricScreen setGraphName(String graphName) {
      setFieldUsed(GRAPH_NAME, true);
      m_graphName = graphName;
      return this;
   }

   public MetricScreen setId(int id) {
      setFieldUsed(ID, true);
      m_id = id;

      setFieldUsed(KEY_ID, true);
      m_keyId = id;
      return this;
   }

   public MetricScreen setKeyId(int keyId) {
      setFieldUsed(KEY_ID, true);
      m_keyId = keyId;
      return this;
   }

   public MetricScreen setMeasurements(String measurements) {
      setFieldUsed(MEASUREMENTS, true);
      m_measurements = measurements;
      return this;
   }

   public MetricScreen setName(String name) {
      setFieldUsed(NAME, true);
      m_name = name;
      return this;
   }

   public MetricScreen setUpdatetime(java.util.Date updatetime) {
      setFieldUsed(UPDATETIME, true);
      m_updatetime = updatetime;
      return this;
   }

   public MetricScreen setView(String view) {
      setFieldUsed(VIEW, true);
      m_view = view;
      return this;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder(1024);

      sb.append("MetricScreen[");
      sb.append("content: ").append(m_content);
      sb.append(", creation-date: ").append(m_creationDate);
      sb.append(", end-points: ").append(m_endPoints);
      sb.append(", graph-name: ").append(m_graphName);
      sb.append(", id: ").append(m_id);
      sb.append(", key-id: ").append(m_keyId);
      sb.append(", measurements: ").append(m_measurements);
      sb.append(", name: ").append(m_name);
      sb.append(", updatetime: ").append(m_updatetime);
      sb.append(", view: ").append(m_view);
      sb.append("]");
      return sb.toString();
   }

}
