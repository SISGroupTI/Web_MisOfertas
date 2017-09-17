package Entity;

/***********************************************************************
 * Module:  Perfil.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Perfil
 ***********************************************************************/

import java.util.*;

/** @pdOid fdaa623e-c577-4541-9443-70645bd8defd */
public class Perfil {
   /** @pdOid f699fe62-07f6-41fc-8067-be0813721b9a */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 0f5825dc-d0a1-47a5-84e0-dc1dbda45722 */
   public long idPerfil;
   /** @pdOid 9bad3f09-5f77-4b99-8a06-9a9a9561da91 */
   public java.lang.String nombrePerfil;
   
   /** @pdRoleInfo migr=no name=Permiso assc=reference19 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Permiso> permiso;
   /** @pdRoleInfo migr=no name=Trabajador assc=reference24 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Trabajador> trabajador;
   
   /** @pdOid 2bf9184d-c5a8-4a8e-9194-47ac5a94968d */
   public long getIdPerfil() {
      return idPerfil;
   }
   
   /** @param newIdPerfil
    * @pdOid 908e8488-f328-434d-bdcf-d54a8194ee16 */
   public void setIdPerfil(long newIdPerfil) {
      idPerfil = newIdPerfil;
   }
   
   /** @pdOid 1a4e3b81-7fa9-4fbb-8331-91cc8740b95c */
   public java.lang.String getNombrePerfil() {
      return nombrePerfil;
   }
   
   /** @param newNombrePerfil
    * @pdOid 1a38fd3d-9166-429f-990c-f2066d93e38d */
   public void setNombrePerfil(java.lang.String newNombrePerfil) {
      nombrePerfil = newNombrePerfil;
   }
   
   /** @pdOid 299cf656-4350-46b9-9a62-b5a9f993fc48 */
   public Perfil() {
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
         newPermiso.setPerfil(this);      
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
            oldPermiso.setPerfil((Perfil)null);
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
            oldPermiso.setPerfil((Perfil)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Trabajador> getTrabajador() {
      if (trabajador == null)
         trabajador = new java.util.HashSet<Trabajador>();
      return trabajador;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTrabajador() {
      if (trabajador == null)
         trabajador = new java.util.HashSet<Trabajador>();
      return trabajador.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTrabajador */
   public void setTrabajador(java.util.Collection<Trabajador> newTrabajador) {
      removeAllTrabajador();
      for (java.util.Iterator iter = newTrabajador.iterator(); iter.hasNext();)
         addTrabajador((Trabajador)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTrabajador */
   public void addTrabajador(Trabajador newTrabajador) {
      if (newTrabajador == null)
         return;
      if (this.trabajador == null)
         this.trabajador = new java.util.HashSet<Trabajador>();
      if (!this.trabajador.contains(newTrabajador))
      {
         this.trabajador.add(newTrabajador);
         newTrabajador.setPerfil(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTrabajador */
   public void removeTrabajador(Trabajador oldTrabajador) {
      if (oldTrabajador == null)
         return;
      if (this.trabajador != null)
         if (this.trabajador.contains(oldTrabajador))
         {
            this.trabajador.remove(oldTrabajador);
            oldTrabajador.setPerfil((Perfil)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTrabajador() {
      if (trabajador != null)
      {
         Trabajador oldTrabajador;
         for (java.util.Iterator iter = getIteratorTrabajador(); iter.hasNext();)
         {
            oldTrabajador = (Trabajador)iter.next();
            iter.remove();
            oldTrabajador.setPerfil((Perfil)null);
         }
      }
   }

}