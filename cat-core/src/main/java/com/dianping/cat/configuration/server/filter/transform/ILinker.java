package com.dianping.cat.configuration.server.filter.transform;

import com.dianping.cat.configuration.server.filter.entity.AtomicTreeConfig;
import com.dianping.cat.configuration.server.filter.entity.CrashLogDomain;
import com.dianping.cat.configuration.server.filter.entity.ServerFilterConfig;

public interface ILinker {

   public boolean onAtomicTreeConfig(ServerFilterConfig parent, AtomicTreeConfig atomicTreeConfig);

   public boolean onCrashLogDomain(ServerFilterConfig parent, CrashLogDomain crashLogDomain);
}
