package com.dianping.cat.home.dal.report;

import org.unidal.dal.jdbc.DataField;
import org.unidal.dal.jdbc.QueryDef;
import org.unidal.dal.jdbc.QueryType;
import org.unidal.dal.jdbc.Readset;
import org.unidal.dal.jdbc.Updateset;
import org.unidal.dal.jdbc.annotation.Attribute;
import org.unidal.dal.jdbc.annotation.Entity;
import org.unidal.dal.jdbc.annotation.Variable;

@Entity(logicalName = "metric-screen", physicalName = "metric_screen", alias = "ms")
public class MetricScreenEntity {

   @Attribute(field = "id", nullable = false, primaryKey = true, autoIncrement = true)
   public static final DataField ID = new DataField("id");

   @Attribute(field = "name", nullable = false)
   public static final DataField NAME = new DataField("name");

   @Attribute(field = "graph_name", nullable = false)
   public static final DataField GRAPH_NAME = new DataField("graph-name");

   @Attribute(field = "view", nullable = false)
   public static final DataField VIEW = new DataField("view");

   @Attribute(field = "endPoints", nullable = false)
   public static final DataField END_POINTS = new DataField("end-points");

   @Attribute(field = "measurements", nullable = false)
   public static final DataField MEASUREMENTS = new DataField("measurements");

   @Attribute(field = "content", nullable = false)
   public static final DataField CONTENT = new DataField("content");

   @Attribute(field = "creation_date", nullable = false, insertExpr = "NOW()")
   public static final DataField CREATION_DATE = new DataField("creation-date");

   @Attribute(field = "updatetime", nullable = false, insertExpr = "NOW()", updateExpr = "NOW()")
   public static final DataField UPDATETIME = new DataField("updatetime");

   @Variable
   public static final DataField KEY_ID = new DataField("key-id");

   public static final Readset<MetricScreen> READSET_FULL = new Readset<MetricScreen>(ID, NAME, GRAPH_NAME, VIEW, END_POINTS, MEASUREMENTS, CONTENT, CREATION_DATE, UPDATETIME);

   public static final Readset<MetricScreen> READSET_CONTENT = new Readset<MetricScreen>(CONTENT);

   public static final Readset<MetricScreen> READSET_METAINFO = new Readset<MetricScreen>(ID, NAME, GRAPH_NAME);

   public static final Updateset<MetricScreen> UPDATESET_FULL = new Updateset<MetricScreen>(ID, NAME, GRAPH_NAME, VIEW, END_POINTS, MEASUREMENTS, CONTENT, UPDATETIME);

   public static final QueryDef FIND_BY_PK = new QueryDef("findByPK", MetricScreenEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef INSERT = new QueryDef("insert", MetricScreenEntity.class, QueryType.INSERT, 
      "INSERT INTO <TABLE/>(<FIELDS/>) VALUES(<VALUES/>)");

   public static final QueryDef UPDATE_BY_PK = new QueryDef("updateByPK", MetricScreenEntity.class, QueryType.UPDATE, 
      "UPDATE <TABLE/> SET <FIELDS/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef DELETE_BY_PK = new QueryDef("deleteByPK", MetricScreenEntity.class, QueryType.DELETE, 
      "DELETE FROM <TABLE/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef FIND_ALL = new QueryDef("findAll", MetricScreenEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/>");

   public static final QueryDef FIND_BY_NAME_GRAPH = new QueryDef("findByNameGraph", MetricScreenEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> WHERE <FIELD name='name'/> = ${name} AND <FIELD name='graph-name'/> = ${graph-name}");

   public static final QueryDef FIND_BY_NAME = new QueryDef("findByName", MetricScreenEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> WHERE <FIELD name='name'/> = ${name}");

   public static final QueryDef INSERT_OR_UPDATE_BY_NAME_GRAPH = new QueryDef("insertOrUpdateByNameGraph", MetricScreenEntity.class, QueryType.INSERT, 
      "INSERT INTO <TABLE/>(<FIELDS/>) VALUES(<VALUES/>) ON DUPLICATE KEY UPDATE <FIELD name='view'/> = ${view}, <FIELD name='end-points'/> = ${end-points}, <FIELD name='measurements'/> = ${measurements}, <FIELD name='content'/> = ${content}");

   public static final QueryDef DELETE_BY_NAME = new QueryDef("deleteByName", MetricScreenEntity.class, QueryType.DELETE, 
      "DELETE FROM <TABLE/> WHERE <FIELD name='name'/> = ${name}");

   public static final QueryDef DELETE_BY_NAME_GRAPH = new QueryDef("deleteByNameGraph", MetricScreenEntity.class, QueryType.DELETE, 
      "DELETE FROM <TABLE/> WHERE <FIELD name='name'/> = ${name} AND <FIELD name='graph-name'/> = ${graph-name}");

}
