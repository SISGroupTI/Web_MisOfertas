package Entity;

/***********************************************************************
 * Module:  Modulo.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Modulo
 ***********************************************************************/

import java.util.*;

/** @pdOid 99c90434-5fb6-4424-a2e2-33188d5a53ff */
public class Modulo {
   /** @pdOid d001b406-19cb-4f92-a70e-cad89cd10002 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 3cc40d0f-d400-4c5f-ba49-e4c8c7f1dad9 */
   public long idModulo;
   /** @pdOid 045fbddc-fc93-4776-86bf-3fa9d352ffb6 */
   public java.lang.String modulo;
   
   /** @pdRoleInfo migr=no name=Permiso assc=reference20 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Permiso> permiso;
   
   /** @pdOid 0181203f-a8d7-4e5f-ada1-e804252a51a7 */
   public long getIdModulo() {
      return idModulo;
   }
   
   /** @param newIdModulo
    * @pdOid 2de98ea2-e8df-4694-a49a-592b7b67d47c */
   public void setIdModulo(long newIdModulo) {
      idModulo = newIdModulo;
   }
   
   /** @pdOid a62514d3-12aa-40f4-9f96-024115713837 */
   public java.lang.String getModulo() {
      return modulo;
   }
   
   /** @param newModulo
    * @pdOid 94b06134-1d78-4827-8200-54dffed3169d */
   public void setModulo(java.lang.String newModulo) {
      modulo = newModulo;
   }
   
   /** @pdOid 8e26a3f3-b45a-4990-9ea9-14fae250fe00 */
   public Modulo() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Permiso> getPermiso() {
      if (permiso == null)
         permiso = new java.util.HashSet<Permiso>();
      return permiso;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPermiso() {
      if (permiso == null)
         permiso = new java.util.HashSet<Permiso>();
      return permiso.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPermiso */
   public void setPermiso(java.util.Collection<Permiso> newPermiso) {
      removeAllPermiso();
      for (java.util.Iterator iter = newPermiso.iterator(); iter.hasNext();)
         addPermiso((Permiso)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPermiso */
   public void addPermiso(Permiso newPermiso) {
      if (newPermiso == null)
         return;
      if (this.permiso == null)
         this.permiso = new java.util.HashSet<Permiso>();
      if (!this.permiso.contains(newPermiso))
      {
         this.permiso.add(newPermiso);
         newPermiso.setModulo(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldPermiso */
   public void removePermiso(Permiso oldPermiso) {
      if (oldPermiso == null)
         return;
      if (this.permiso != null)
         if (this.permiso.contains(oldPermiso))
         {
            this.permiso.remove(oldPermiso);
            oldPermiso.setModulo((Modulo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPermiso() {
      if (permiso != null)
      {
         Permiso oldPermiso;
         for (java.util.Iterator iter = getIteratorPermiso(); iter.hasNext();)
         {
            oldPermiso = (Permiso)iter.next();
            iter.remove();
            oldPermiso.setModulo((Modulo)null);
         }
      }
   }

}