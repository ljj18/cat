package com.dianping.cat.home.business.transform;

import static com.dianping.cat.home.business.Constants.ATTR_DOMAIN;
import static com.dianping.cat.home.business.Constants.ATTR_ID;
import static com.dianping.cat.home.business.Constants.ATTR_ITEM_ID;

import org.xml.sax.Attributes;

import com.dianping.cat.home.business.entity.BusinessItem;
import com.dianping.cat.home.business.entity.BusinessTagConfig;
import com.dianping.cat.home.business.entity.Tag;

public class DefaultSaxMaker implements IMaker<Attributes> {

   @Override
   public BusinessItem buildBusinessItem(Attributes attributes) {
      String domain = attributes.getValue(ATTR_DOMAIN);
      String itemId = attributes.getValue(ATTR_ITEM_ID);
      BusinessItem businessItem = new BusinessItem();

      if (domain != null) {
         businessItem.setDomain(domain);
      }

      if (itemId != null) {
         businessItem.setItemId(itemId);
      }

      return businessItem;
   }

   @Override
   public BusinessTagConfig buildBusinessTagConfig(Attributes attributes) {
      BusinessTagConfig businessTagConfig = new BusinessTagConfig();

      return businessTagConfig;
   }

   @Override
   public Tag buildTag(Attributes attributes) {
      String id = attributes.getValue(ATTR_ID);
      Tag tag = new Tag(id);

      return tag;
   }

   @SuppressWarnings("unchecked")
   protected <T> T convert(Class<T> type, String value, T defaultValue) {
      if (value == null || value.length() == 0) {
         return defaultValue;
      }

      if (type == Boolean.class || type == Boolean.TYPE) {
         return (T) Boolean.valueOf(value);
      } else if (type == Integer.class || type == Integer.TYPE) {
         return (T) Integer.valueOf(value);
      } else if (type == Long.class || type == Long.TYPE) {
         return (T) Long.valueOf(value);
      } else if (type == Short.class || type == Short.TYPE) {
         return (T) Short.valueOf(value);
      } else if (type == Float.class || type == Float.TYPE) {
         return (T) Float.valueOf(value);
      } else if (type == Double.class || type == Double.TYPE) {
         return (T) Double.valueOf(value);
      } else if (type == Byte.class || type == Byte.TYPE) {
         return (T) Byte.valueOf(value);
      } else if (type == Character.class || type == Character.TYPE) {
         return (T) (Character) value.charAt(0);
      } else {
         return (T) value;
      }
   }
}
