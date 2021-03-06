package com.dianping.cat.home.storage.entity;

import static com.dianping.cat.home.storage.Constants.ATTR_ID;
import static com.dianping.cat.home.storage.Constants.ENTITY_STORAGE;

import com.dianping.cat.home.storage.BaseEntity;
import com.dianping.cat.home.storage.IVisitor;

public class Storage extends BaseEntity<Storage> {
   private String m_id;

   private String m_department;

   private String m_productline;

   private String m_title;

   public Storage() {
   }

   public Storage(String id) {
      m_id = id;
   }

   @Override
   public void accept(IVisitor visitor) {
      visitor.visitStorage(this);
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Storage) {
         Storage _o = (Storage) obj;

         if (!equals(getId(), _o.getId())) {
            return false;
         }

         return true;
      }

      return false;
   }

   public String getDepartment() {
      return m_department;
   }

   public String getId() {
      return m_id;
   }

   public String getProductline() {
      return m_productline;
   }

   public String getTitle() {
      return m_title;
   }

   @Override
   public int hashCode() {
      int hash = 0;

      hash = hash * 31 + (m_id == null ? 0 : m_id.hashCode());

      return hash;
   }

   @Override
   public void mergeAttributes(Storage other) {
      assertAttributeEquals(other, ENTITY_STORAGE, ATTR_ID, m_id, other.getId());

      if (other.getDepartment() != null) {
         m_department = other.getDepartment();
      }

      if (other.getProductline() != null) {
         m_productline = other.getProductline();
      }

      if (other.getTitle() != null) {
         m_title = other.getTitle();
      }
   }

   public Storage setDepartment(String department) {
      m_department = department;
      return this;
   }

   public Storage setId(String id) {
      m_id = id;
      return this;
   }

   public Storage setProductline(String productline) {
      m_productline = productline;
      return this;
   }

   public Storage setTitle(String title) {
      m_title = title;
      return this;
   }

}
