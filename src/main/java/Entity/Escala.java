package Entity;

/***********************************************************************
 * Module:  Escala.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Escala
 ***********************************************************************/

import Entity.Valoracion;
import java.util.*;

/** @pdOid d49b495a-8b9d-4623-be9d-885e8fe304a2 */
public class Escala {
   /** @pdOid 95d4a75f-1704-4523-a392-a552acd1291c */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 4c0adb91-c6c7-41cd-ae2b-dbf2debd07d3 */
   public long idEscala;
   /** @pdOid 0180fe40-c4f7-4c35-bbd8-19620cfb1439 */
   public java.lang.String nota;
   
   /** @pdRoleInfo migr=no name=Valoracion assc=reference21 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Valoracion> valoracion;
   
   /** @pdOid d22efe5a-58eb-42bc-9ed1-535f3ecf7320 */
   public long getIdEscala() {
      return idEscala;
   }
   
   /** @param newIdEscala
    * @pdOid 8a77d77b-a693-4749-89ee-356e2459d2b0 */
   public void setIdEscala(long newIdEscala) {
      idEscala = newIdEscala;
   }
   
   /** @pdOid 9044db81-613f-4d09-a98c-9acc13fe9304 */
   public java.lang.String getNota() {
      return nota;
   }
   
   /** @param newNota
    * @pdOid 9ed0db1c-7083-48a6-aa85-f68a344d029d */
   public void setNota(java.lang.String newNota) {
      nota = newNota;
   }
   
   /** @pdOid 2900dfc8-07d9-4f46-b645-8612da1476db */
   public Escala() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Valoracion> getValoracion() {
      if (valoracion == null)
         valoracion = new java.util.HashSet<Valoracion>();
      return valoracion;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorValoracion() {
      if (valoracion == null)
         valoracion = new java.util.HashSet<Valoracion>();
      return valoracion.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newValoracion */
   public void setValoracion(java.util.Collection<Valoracion> newValoracion) {
      removeAllValoracion();
      for (java.util.Iterator iter = newValoracion.iterator(); iter.hasNext();)
         addValoracion((Valoracion)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newValoracion */
   public void addValoracion(Valoracion newValoracion) {
      if (newValoracion == null)
         return;
      if (this.valoracion == null)
         this.valoracion = new java.util.HashSet<Valoracion>();
      if (!this.valoracion.contains(newValoracion))
      {
         this.valoracion.add(newValoracion);
         newValoracion.setEscala(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldValoracion */
   public void removeValoracion(Valoracion oldValoracion) {
      if (oldValoracion == null)
         return;
      if (this.valoracion != null)
         if (this.valoracion.contains(oldValoracion))
         {
            this.valoracion.remove(oldValoracion);
            oldValoracion.setEscala((Escala)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllValoracion() {
      if (valoracion != null)
      {
         Valoracion oldValoracion;
         for (java.util.Iterator iter = getIteratorValoracion(); iter.hasNext();)
         {
            oldValoracion = (Valoracion)iter.next();
            iter.remove();
            oldValoracion.setEscala((Escala)null);
         }
      }
   }

}