package com.dianping.cat.alarm.policy.transform;

import com.dianping.cat.alarm.policy.entity.AlertPolicy;
import com.dianping.cat.alarm.policy.entity.Group;
import com.dianping.cat.alarm.policy.entity.Level;
import com.dianping.cat.alarm.policy.entity.Type;

public interface IParser<T> {
   public AlertPolicy parse(IMaker<T> maker, ILinker linker, T node);

   public void parseForGroup(IMaker<T> maker, ILinker linker, Group parent, T node);

   public void parseForLevel(IMaker<T> maker, ILinker linker, Level parent, T node);

   public void parseForType(IMaker<T> maker, ILinker linker, Type parent, T node);
}
