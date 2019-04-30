package com.dianping.cat.home.dal.report;

import org.unidal.dal.jdbc.DalException;
import org.unidal.dal.jdbc.AbstractDao;
import org.unidal.dal.jdbc.Readset;
import org.unidal.dal.jdbc.Updateset;

public class MetricGraphDao extends AbstractDao {
   public MetricGraph createLocal() {
      MetricGraph proto = new MetricGraph();

      return proto;
   }

   public int deleteByPK(MetricGraph proto) throws DalException {
      return getQueryEngine().deleteSingle(
            MetricGraphEntity.DELETE_BY_PK,
            proto);
   }
   
   public int deleteBeforeDate(MetricGraph proto) throws DalException {
      return getQueryEngine().deleteSingle(
            MetricGraphEntity.DELETE_BEFORE_DATE,
            proto);
   }
   
   public MetricGraph findByPK(int keyId, Readset<MetricGraph> readset) throws DalException {
      MetricGraph proto = new MetricGraph();

      proto.setKeyId(keyId);

      MetricGraph result = getQueryEngine().querySingle(
            MetricGraphEntity.FIND_BY_PK, 
            proto,
            readset);
      
      return result;
   }
   
   public MetricGraph findByGrapId(long graphId, Readset<MetricGraph> readset) throws DalException {
      MetricGraph proto = new MetricGraph();

      proto.setGraphId(graphId);

      MetricGraph result = getQueryEngine().querySingle(
            MetricGraphEntity.FIND_BY_GRAP_ID, 
            proto,
            readset);
      
      return result;
   }
   
   public MetricGraph findLast(int number, Readset<MetricGraph> readset) throws DalException {
      MetricGraph proto = new MetricGraph();

      proto.setNumber(number);

      MetricGraph result = getQueryEngine().querySingle(
            MetricGraphEntity.FIND_LAST, 
            proto,
            readset);
      
      return result;
   }
   
   @Override
   protected Class<?>[] getEntityClasses() {
      return new Class<?>[] { MetricGraphEntity.class };
   }

   public int insert(MetricGraph proto) throws DalException {
      return getQueryEngine().insertSingle(
            MetricGraphEntity.INSERT,
            proto);
   }
   
   public int updateByPK(MetricGraph proto, Updateset<MetricGraph> updateset) throws DalException {
      return getQueryEngine().updateSingle(
            MetricGraphEntity.UPDATE_BY_PK,
            proto,
            updateset);
   }
   
}
