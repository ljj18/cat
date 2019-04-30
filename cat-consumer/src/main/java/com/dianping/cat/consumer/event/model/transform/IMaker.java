package com.dianping.cat.consumer.event.model.transform;

import com.dianping.cat.consumer.event.model.entity.EventName;
import com.dianping.cat.consumer.event.model.entity.EventReport;
import com.dianping.cat.consumer.event.model.entity.EventType;
import com.dianping.cat.consumer.event.model.entity.GraphTrend;
import com.dianping.cat.consumer.event.model.entity.Machine;
import com.dianping.cat.consumer.event.model.entity.Range;
import com.dianping.cat.consumer.event.model.entity.StatusCode;

public interface IMaker<T> {

   public String buildDomain(T node);

   public EventReport buildEventReport(T node);

   public GraphTrend buildGraphTrend(T node);

   public String buildIp(T node);

   public Machine buildMachine(T node);

   public EventName buildName(T node);

   public Range buildRange(T node);

   public StatusCode buildStatusCode(T node);

   public EventType buildType(T node);
}
