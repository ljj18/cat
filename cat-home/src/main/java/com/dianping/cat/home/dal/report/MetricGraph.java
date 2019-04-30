package com.dianping.cat.home.dal.report;

import static com.dianping.cat.home.dal.report.MetricGraphEntity.CONTENT;
import static com.dianping.cat.home.dal.report.MetricGraphEntity.CREATION_DATE;
import static com.dianping.cat.home.dal.report.MetricGraphEntity.GRAPH_ID;
import static com.dianping.cat.home.dal.report.MetricGraphEntity.ID;
import static com.dianping.cat.home.dal.report.MetricGraphEntity.KEY_ID;
import static com.dianping.cat.home.dal.report.MetricGraphEntity.NUMBER;
import static com.dianping.cat.home.dal.report.MetricGraphEntity.UPDATETIME;

import org.unidal.dal.jdbc.DataObject;

public class MetricGraph extends DataObject {
   private int m_id;

   private long m_graphId;

   private String m_content;

   private java.util.Date m_creationDate;

   private java.util.Date m_updatetime;

   private int m_keyId;

   private int m_number;

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

   public long getGraphId() {
      return m_graphId;
   }

   public int getId() {
      return m_id;
   }

   public int getKeyId() {
      return m_keyId;
   }

   public int getNumber() {
      return m_number;
   }

   public java.util.Date getUpdatetime() {
      return m_updatetime;
   }

   public MetricGraph setContent(String content) {
      setFieldUsed(CONTENT, true);
      m_content = content;
      return this;
   }

   public MetricGraph setCreationDate(java.util.Date creationDate) {
      setFieldUsed(CREATION_DATE, true);
      m_creationDate = creationDate;
      return this;
   }

   public MetricGraph setGraphId(long graphId) {
      setFieldUsed(GRAPH_ID, true);
      m_graphId = graphId;
      return this;
   }

   public MetricGraph setId(int id) {
      setFieldUsed(ID, true);
      m_id = id;

      setFieldUsed(KEY_ID, true);
      m_keyId = id;
      return this;
   }

   public MetricGraph setKeyId(int keyId) {
      setFieldUsed(KEY_ID, true);
      m_keyId = keyId;
      return this;
   }

   public MetricGraph setNumber(int number) {
      setFieldUsed(NUMBER, true);
      m_number = number;
      return this;
   }

   public MetricGraph setUpdatetime(java.util.Date updatetime) {
      setFieldUsed(UPDATETIME, true);
      m_updatetime = updatetime;
      return this;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder(1024);

      sb.append("MetricGraph[");
      sb.append("content: ").append(m_content);
      sb.append(", creation-date: ").append(m_creationDate);
      sb.append(", graph-id: ").append(m_graphId);
      sb.append(", id: ").append(m_id);
      sb.append(", key-id: ").append(m_keyId);
      sb.append(", number: ").append(m_number);
      sb.append(", updatetime: ").append(m_updatetime);
      sb.append("]");
      return sb.toString();
   }

}
