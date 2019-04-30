package com.dianping.cat.home.dal.report;

import org.unidal.dal.jdbc.DataField;
import org.unidal.dal.jdbc.QueryDef;
import org.unidal.dal.jdbc.QueryType;
import org.unidal.dal.jdbc.Readset;
import org.unidal.dal.jdbc.Updateset;
import org.unidal.dal.jdbc.annotation.Attribute;
import org.unidal.dal.jdbc.annotation.Entity;
import org.unidal.dal.jdbc.annotation.Variable;

@Entity(logicalName = "metric-graph", physicalName = "metric_graph", alias = "mg")
public class MetricGraphEntity {

   @Attribute(field = "id", nullable = false, primaryKey = true, autoIncrement = true)
   public static final DataField ID = new DataField("id");

   @Attribute(field = "graph_id")
   public static final DataField GRAPH_ID = new DataField("graph-id");

   @Attribute(field = "content")
   public static final DataField CONTENT = new DataField("content");

   @Attribute(field = "creation_date", nullable = false, insertExpr = "NOW()")
   public static final DataField CREATION_DATE = new DataField("creation-date");

   @Attribute(field = "updatetime", nullable = false, insertExpr = "NOW()", updateExpr = "NOW()")
   public static final DataField UPDATETIME = new DataField("updatetime");

   @Variable
   public static final DataField KEY_ID = new DataField("key-id");

   @Variable
   public static final DataField NUMBER = new DataField("number");

   public static final Readset<MetricGraph> READSET_FULL = new Readset<MetricGraph>(ID, GRAPH_ID, CONTENT, CREATION_DATE, UPDATETIME);

   public static final Updateset<MetricGraph> UPDATESET_FULL = new Updateset<MetricGraph>(ID, GRAPH_ID, CONTENT, UPDATETIME);

   public static final QueryDef FIND_BY_PK = new QueryDef("findByPK", MetricGraphEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef INSERT = new QueryDef("insert", MetricGraphEntity.class, QueryType.INSERT, 
      "INSERT INTO <TABLE/>(<FIELDS/>) VALUES(<VALUES/>)");

   public static final QueryDef UPDATE_BY_PK = new QueryDef("updateByPK", MetricGraphEntity.class, QueryType.UPDATE, 
      "UPDATE <TABLE/> SET <FIELDS/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef DELETE_BY_PK = new QueryDef("deleteByPK", MetricGraphEntity.class, QueryType.DELETE, 
      "DELETE FROM <TABLE/> WHERE <FIELD name='id'/> = ${key-id}");

   public static final QueryDef FIND_BY_GRAP_ID = new QueryDef("findByGrapId", MetricGraphEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> WHERE <FIELD name='graph-id'/> = ${graph-id}");

   public static final QueryDef FIND_LAST = new QueryDef("findLast", MetricGraphEntity.class, QueryType.SELECT, 
      "SELECT <FIELDS/> FROM <TABLE/> ORDER BY <FIELD name='creation-date'/> DESC LIMIT ${number}");

   public static final QueryDef DELETE_BEFORE_DATE = new QueryDef("deleteBeforeDate", MetricGraphEntity.class, QueryType.DELETE, 
      "DELETE FROM <TABLE/> WHERE <FIELD name='creation-date'/> < ${creation-date}");

}
