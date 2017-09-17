package Entity;

/***********************************************************************
 * Module:  Empresa.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Empresa
 ***********************************************************************/

import java.util.*;

/** @pdOid 89444a90-966e-406b-8c75-a15a2e996171 */
public class Empresa {
   /** @pdOid 7df5a0c9-7356-434e-b29e-05756b514b9b */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 5e7cea56-8377-4828-95e8-fcb4378c1d6a */
   public long idEmpresa;
   /** @pdOid 27434e1e-9229-415c-807c-b6cd1ba5a542 */
   public int rutEmpresa;
   /** @pdOid 3b5a8fb3-93bc-42a8-939a-9293f76e20ff */
   public java.lang.String dvEmpresa;
   /** @pdOid 73607936-2d71-45a9-8106-0cedc7b49ca9 */
   public java.lang.String nombreEmpresa;
   /** @pdOid 3f9ca94b-e4d3-4ca8-af4a-e07c387f0a55 */
   public java.util.Date fechaIncorporacion;
   /** @pdOid a3731735-2f6b-49f7-88b6-fdd18864f5fb */
   public java.util.Date fechaModificacion;
   /** @pdOid 35307bca-7149-4c0c-96ad-a8ed697fa8bc */
   public java.util.Date fechaEliminacion;
   /** @pdOid b8bdf25d-149f-43e1-beec-33938240cd7d */
   public short isActivo;
   
   /** @pdRoleInfo migr=no name=Local assc=reference5 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Local> local;
   
   /** @pdOid 169f7d72-f85e-4ac0-8fd6-5726c7529373 */
   public long getIdEmpresa() {
      return idEmpresa;
   }
   
   /** @param newIdEmpresa
    * @pdOid 7e3f90f0-5bd8-4e88-9a17-ab4046618644 */
   public void setIdEmpresa(long newIdEmpresa) {
      idEmpresa = newIdEmpresa;
   }
   
   /** @pdOid e51c1d16-2255-4e24-8768-ea19f0c1bc3a */
   public int getRutEmpresa() {
      return rutEmpresa;
   }
   
   /** @param newRutEmpresa
    * @pdOid 7cea33ce-8e9d-4244-b72b-71da08512d37 */
   public void setRutEmpresa(int newRutEmpresa) {
      rutEmpresa = newRutEmpresa;
   }
   
   /** @pdOid bba60b5b-f62e-4e77-b45b-fdf2acd0a75d */
   public java.lang.String getDvEmpresa() {
      return dvEmpresa;
   }
   
   /** @param newDvEmpresa
    * @pdOid 91f28734-1efc-4377-9211-379c5b6855d1 */
   public void setDvEmpresa(java.lang.String newDvEmpresa) {
      dvEmpresa = newDvEmpresa;
   }
   
   /** @pdOid d738e9d4-fedc-45f6-bf26-33d3c7e91abd */
   public java.lang.String getNombreEmpresa() {
      return nombreEmpresa;
   }
   
   /** @param newNombreEmpresa
    * @pdOid bcc35e8e-fc60-4db6-bf60-f0d8b8c3563c */
   public void setNombreEmpresa(java.lang.String newNombreEmpresa) {
      nombreEmpresa = newNombreEmpresa;
   }
   
   /** @pdOid 0f352e27-41af-4458-a909-a83264f94cf5 */
   public java.util.Date getFechaIncorporacion() {
      return fechaIncorporacion;
   }
   
   /** @param newFechaIncorporacion
    * @pdOid e7619b05-7e74-4e7f-8451-b7a1fa03867a */
   public void setFechaIncorporacion(java.util.Date newFechaIncorporacion) {
      fechaIncorporacion = newFechaIncorporacion;
   }
   
   /** @pdOid e4b5ccbf-1404-4f25-8d66-21b058ec5d43 */
   public java.util.Date getFechaModificacion() {
      return fechaModificacion;
   }
   
   /** @param newFechaModificacion
    * @pdOid e69734d3-b51a-458b-bdaa-51213d4f50f3 */
   public void setFechaModificacion(java.util.Date newFechaModificacion) {
      fechaModificacion = newFechaModificacion;
   }
   
   /** @pdOid 8b0ac328-af88-4632-874f-f6ff7ab5a233 */
   public java.util.Date getFechaEliminacion() {
      return fechaEliminacion;
   }
   
   /** @param newFechaEliminacion
    * @pdOid 6e891db5-c4bc-4c3a-9bb0-399db978eaeb */
   public void setFechaEliminacion(java.util.Date newFechaEliminacion) {
      fechaEliminacion = newFechaEliminacion;
   }
   
   /** @pdOid 5427c54a-8aff-48db-a727-a0290297f7c3 */
   public short getIsActivo() {
      return isActivo;
   }
   
   /** @param newIsActivo
    * @pdOid d1df026f-a23a-4308-94e4-f0468946d7cd */
   public void setIsActivo(short newIsActivo) {
      isActivo = newIsActivo;
   }
   
   /** @pdOid 5a367b03-0dcb-4249-aec1-1664c0f076dd */
   public Empresa() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Local> getLocal() {
      if (local == null)
         local = new java.util.HashSet<Local>();
      return local;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLocal() {
      if (local == null)
         local = new java.util.HashSet<Local>();
      return local.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLocal */
   public void setLocal(java.util.Collection<Local> newLocal) {
      removeAllLocal();
      for (java.util.Iterator iter = newLocal.iterator(); iter.hasNext();)
         addLocal((Local)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLocal */
   public void addLocal(Local newLocal) {
      if (newLocal == null)
         return;
      if (this.local == null)
         this.local = new java.util.HashSet<Local>();
      if (!this.local.contains(newLocal))
      {
         this.local.add(newLocal);
         newLocal.setEmpresa(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldLocal */
   public void removeLocal(Local oldLocal) {
      if (oldLocal == null)
         return;
      if (this.local != null)
         if (this.local.contains(oldLocal))
         {
            this.local.remove(oldLocal);
            oldLocal.setEmpresa((Empresa)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLocal() {
      if (local != null)
      {
         Local oldLocal;
         for (java.util.Iterator iter = getIteratorLocal(); iter.hasNext();)
         {
            oldLocal = (Local)iter.next();
            iter.remove();
            oldLocal.setEmpresa((Empresa)null);
         }
      }
   }

}