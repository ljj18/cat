package com.dianping.cat.core.config;

import java.util.List;
import org.unidal.dal.jdbc.DalException;
import org.unidal.dal.jdbc.AbstractDao;
import org.unidal.dal.jdbc.Readset;
import org.unidal.dal.jdbc.Updateset;

public class BusinessConfigDao extends AbstractDao {
   public BusinessConfig createLocal() {
      BusinessConfig proto = new BusinessConfig();

      return proto;
   }

   public int deleteByPK(BusinessConfig proto) throws DalException {
      return getQueryEngine().deleteSingle(
            BusinessConfigEntity.DELETE_BY_PK,
            proto);
   }
   
   public List<BusinessConfig> findByName(String name, Readset<BusinessConfig> readset) throws DalException {
      BusinessConfig proto = new BusinessConfig();

      proto.setName(name);

      List<BusinessConfig> result = getQueryEngine().queryMultiple(
            BusinessConfigEntity.FIND_BY_NAME, 
            proto,
            readset);
      
      return result;
   }
   
   public BusinessConfig findByPK(int keyId, Readset<BusinessConfig> readset) throws DalException {
      BusinessConfig proto = new BusinessConfig();

      proto.setKeyId(keyId);

      BusinessConfig result = getQueryEngine().querySingle(
            BusinessConfigEntity.FIND_BY_PK, 
            proto,
            readset);
      
      return result;
   }
   
   public BusinessConfig findByNameDomain(String name, String domain, Readset<BusinessConfig> readset) throws DalException {
      BusinessConfig proto = new BusinessConfig();

      proto.setName(name);
      proto.setDomain(domain);

      BusinessConfig result = getQueryEngine().querySingle(
            BusinessConfigEntity.FIND_BY_NAME_DOMAIN, 
            proto,
            readset);
      
      return result;
   }
   
   @Override
   protected Class<?>[] getEntityClasses() {
      return new Class<?>[] { BusinessConfigEntity.class };
   }

   public int insert(BusinessConfig proto) throws DalException {
      return getQueryEngine().insertSingle(
            BusinessConfigEntity.INSERT,
            proto);
   }
   
   public int updateByPK(BusinessConfig proto, Updateset<BusinessConfig> updateset) throws DalException {
      return getQueryEngine().updateSingle(
            BusinessConfigEntity.UPDATE_BY_PK,
            proto,
            updateset);
   }
   
   public int updateBaseConfigByDomain(BusinessConfig proto, Updateset<BusinessConfig> updateset) throws DalException {
      return getQueryEngine().updateSingle(
            BusinessConfigEntity.UPDATE_BASE_CONFIG_BY_DOMAIN,
            proto,
            updateset);
   }
   
}
