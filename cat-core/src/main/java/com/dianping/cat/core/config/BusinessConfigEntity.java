package com.dianping.cat.core.config;

import org.unidal.dal.jdbc.DataField;
import org.unidal.dal.jdbc.QueryDef;
import org.unidal.dal.jdbc.QueryType;
import org.unidal.dal.jdbc.Readset;
import org.unidal.dal.jdbc.Updateset;
import org.unidal.dal.jdbc.annotation.Attribute;
import org.unidal.dal.jdbc.annotation.Entity;
import org.unidal.dal.jdbc.annotation.Variable;

@Entity(logicalName = "business-config", physicalName = "business_config", alias = "bc")
public class BusinessConfigEntity {

   @Attribute(field = "id", nullable = false, primaryKey = true, autoIncrement = true)
   public static final DataField ID = new DataField("id");

   @Attribute(field = "name", nullable = false)
   public static final DataField NAME = new DataField("name");

   @Attribute(field = "domain", nullable = false)
   public static final DataField DOMAIN = new DataField("domain");

   @Attribute(field = "content")
   public static final DataField CONTENT = new DataField("content");

   @Attribute(field = "updatetime", nullable = false)
   public static final DataField UPDATETIME = new DataField("updatetime");

   @Variable
   public static final DataField KEY_ID = new DataField("key-id");

   public static final Readset<BusinessConfig> READSET_FULL = new Readset<BusinessConfig>(ID, NAME, DOMAIN, CONTENT, UPDATETIME);

   public static final Updateset<BusinessConfig> UPDATESET_FULL = new Updateset<BusinessConfig>(ID, NAME, DOMAIN, CONTENT, UPDATETIME);

   public static final QueryDef FIND_BY_PK = new QueryDef("findByPK", BusinessConfigEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef INSERT = new QueryDef("insert", BusinessConfigEntity.class, QueryType.INSERT, 
      "INSERT IGNORE INTO <TABLE/> (<FIELDS/>) VALUES (<VALUES/>)");

   public static final QueryDef UPDATE_BY_PK = new QueryDef("updateByPK", BusinessConfigEntity.class, QueryType.UPDATE, 
      "UPDATE <TABLE/> SET <FIELDS/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef DELETE_BY_PK = new QueryDef("deleteByPK", BusinessConfigEntity.class, QueryType.DELETE, 
      "DELETE FROM <TABLE/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef FIND_BY_NAME_DOMAIN = new QueryDef("findByNameDomain", BusinessConfigEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> WHERE <FIELD name='name'/> = ${name} AND <FIELD name='domain'/> = ${domain}");

   public static final QueryDef FIND_BY_NAME = new QueryDef("findByName", BusinessConfigEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> WHERE <FIELD name='name'/> = ${name}");

   public static final QueryDef UPDATE_BASE_CONFIG_BY_DOMAIN = new QueryDef("updateBaseConfigByDomain", BusinessConfigEntity.class, QueryType.UPDATE, 
      "UPDATE <TABLE/> SET <FIELD name='content'/>=${content}, <FIELD name='updatetime'/>=NOW() WHERE <FIELD name='domain'/> = ${domain} AND <FIELD name='name'/> = ${name};");

}
