package com.dianping.cat.home.dal.report;

import java.util.List;
import org.unidal.dal.jdbc.DalException;
import org.unidal.dal.jdbc.AbstractDao;
import org.unidal.dal.jdbc.Readset;
import org.unidal.dal.jdbc.Updateset;

public class MetricScreenDao extends AbstractDao {
   public MetricScreen createLocal() {
      MetricScreen proto = new MetricScreen();

      return proto;
   }

   public int deleteByPK(MetricScreen proto) throws DalException {
      return getQueryEngine().deleteSingle(
            MetricScreenEntity.DELETE_BY_PK,
            proto);
   }
   
   public int deleteByName(MetricScreen proto) throws DalException {
      return getQueryEngine().deleteSingle(
            MetricScreenEntity.DELETE_BY_NAME,
            proto);
   }
   
   public int deleteByNameGraph(MetricScreen proto) throws DalException {
      return getQueryEngine().deleteSingle(
            MetricScreenEntity.DELETE_BY_NAME_GRAPH,
            proto);
   }
   
   public List<MetricScreen> findAll(Readset<MetricScreen> readset) throws DalException {
      MetricScreen proto = new MetricScreen();

      List<MetricScreen> result = getQueryEngine().queryMultiple(
            MetricScreenEntity.FIND_ALL, 
            proto,
            readset);
      
      return result;
   }
   
   public List<MetricScreen> findByName(String name, Readset<MetricScreen> readset) throws DalException {
      MetricScreen proto = new MetricScreen();

      proto.setName(name);

      List<MetricScreen> result = getQueryEngine().queryMultiple(
            MetricScreenEntity.FIND_BY_NAME, 
            proto,
            readset);
      
      return result;
   }
   
   public MetricScreen findByPK(int keyId, Readset<MetricScreen> readset) throws DalException {
      MetricScreen proto = new MetricScreen();

      proto.setKeyId(keyId);

      MetricScreen result = getQueryEngine().querySingle(
            MetricScreenEntity.FIND_BY_PK, 
            proto,
            readset);
      
      return result;
   }
   
   public MetricScreen findByNameGraph(String name, String graphName, Readset<MetricScreen> readset) throws DalException {
      MetricScreen proto = new MetricScreen();

      proto.setName(name);
      proto.setGraphName(graphName);

      MetricScreen result = getQueryEngine().querySingle(
            MetricScreenEntity.FIND_BY_NAME_GRAPH, 
            proto,
            readset);
      
      return result;
   }
   
   @Override
   protected Class<?>[] getEntityClasses() {
      return new Class<?>[] { MetricScreenEntity.class };
   }

   public int insert(MetricScreen proto) throws DalException {
      return getQueryEngine().insertSingle(
            MetricScreenEntity.INSERT,
            proto);
   }
   
   public int insertOrUpdateByNameGraph(MetricScreen proto) throws DalException {
      return getQueryEngine().insertSingle(
            MetricScreenEntity.INSERT_OR_UPDATE_BY_NAME_GRAPH,
            proto);
   }
   
   public int updateByPK(MetricScreen proto, Updateset<MetricScreen> updateset) throws DalException {
      return getQueryEngine().updateSingle(
            MetricScreenEntity.UPDATE_BY_PK,
            proto,
            updateset);
   }
   
}
