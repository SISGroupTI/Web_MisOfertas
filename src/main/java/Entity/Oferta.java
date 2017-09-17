
package Entity;

/***********************************************************************
 * Module:  Oferta.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Oferta
 ***********************************************************************/

import Entity.Valoracion;
import java.util.*;

/** @pdOid ca19e091-27ba-4a68-b29a-3e7064ec4432 */
public class Oferta {
   /** @pdOid 7b44a74f-3002-4d9e-b37f-cd9500486573 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** La IdOferta es el identificador unico de las ofertas dentro del sistema
    * 
    * 
    * @pdOid 480aa78a-85ae-4ee0-a638-2c8882392cb0 */
   public long idOferta;
   /** @pdOid f2eab1fd-f81a-4e62-bb9b-303efa0fad4f */
   public int codigoOferta;
   /** @pdOid 77cf2e9d-8f1d-49f6-9029-b08c6e67461e */
   public java.util.Date fechaCreacion;
   /** @pdOid 1ffa1121-1634-411f-a1ff-a4d2126f7a7e */
   public java.util.Date fechaInicio;
   /** @pdOid 37e0834e-8cea-4b18-9fb5-6b4f5968be3f */
   public java.util.Date fechaFinalzacion;
   /** @pdOid 29f55f9f-3631-4e78-95ba-b338c02ab11c */
   public int precio;
   /** @pdOid afde07b2-50a0-40cd-91d5-4a926d088945 */
   public short isVisible;
   /** @pdOid 29f19d76-fea7-4621-a7fd-e24b8e70cfdd */
   public java.lang.String tituloOferta;
   /** @pdOid ebb1d540-6768-4be0-b996-9b17872aa3ab */
   public java.lang.String descripcionOferta;
   /** @pdOid 88b24fa7-62a5-4af2-bb25-091fb68a8577 */
   public java.lang.String condiciones;
   /** @pdOid c30ea216-27d0-449b-81db-e2c8fe77fdcc */
   public short isDisponible;
   /** @pdOid 39c1e084-11cc-4fdf-8d13-202551c62554 */
   public java.util.Date fechaModificacion;
   /** @pdOid 15119e0c-d61a-402c-b9fa-ffd7cf940eb3 */
   public java.util.Date fechaEliminacion;
   
   /** @pdRoleInfo migr=no name=DetalleOferta assc=reference7 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<DetalleOferta> detalleOferta;
   /** @pdRoleInfo migr=no name=Valoracion assc=reference13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Valoracion> valoracion;
   /** @pdRoleInfo migr=no name=Track assc=reference17 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Track> track;
   /** @pdRoleInfo migr=no name=ImgOferta assc=reference26 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<ImgOferta> imgOferta;
   /** @pdRoleInfo migr=no name=HistorialCorreo assc=reference29 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<HistorialCorreo> historialCorreo;
   /** @pdRoleInfo migr=no name=Rubro assc=reference23 mult=1..1 side=A */
   public Rubro rubro;
   /** @pdRoleInfo migr=no name=Local assc=reference30 mult=1..1 side=A */
   public Local local;
   
   /** @pdOid 92f7afd6-1d8d-42c5-a397-c25841cd7206 */
   public long getIdOferta() {
      return idOferta;
   }
   
   /** @param newIdOferta
    * @pdOid 7e2adeb5-0fd5-4145-8aa2-be7e651e7b1d */
   public void setIdOferta(long newIdOferta) {
      idOferta = newIdOferta;
   }
   
   /** @pdOid 6640d75f-f6cf-4fee-b7ea-7bcd4f86b69b */
   public int getCodigoOferta() {
      return codigoOferta;
   }
   
   /** @param newCodigoOferta
    * @pdOid 2cffd5fe-70ee-4c5d-a8ee-20d1fae99a0c */
   public void setCodigoOferta(int newCodigoOferta) {
      codigoOferta = newCodigoOferta;
   }
   
   /** @pdOid 40ab11ae-4eb6-48ca-b91a-9dc40a7f794c */
   public java.util.Date getFechaCreacion() {
      return fechaCreacion;
   }
   
   /** @param newFechaCreacion
    * @pdOid f107e0b4-ade9-44a1-b844-7fb4491b665b */
   public void setFechaCreacion(java.util.Date newFechaCreacion) {
      fechaCreacion = newFechaCreacion;
   }
   
   /** @pdOid 472f0b8f-6766-4c2f-9de7-9150385885f5 */
   public java.util.Date getFechaInicio() {
      return fechaInicio;
   }
   
   /** @param newFechaInicio
    * @pdOid 6f1f2142-aea8-484c-8550-f4f0811c56c8 */
   public void setFechaInicio(java.util.Date newFechaInicio) {
      fechaInicio = newFechaInicio;
   }
   
   /** @pdOid b31c9144-2e09-4d36-97f7-16f64e235b2f */
   public java.util.Date getFechaFinalzacion() {
      return fechaFinalzacion;
   }
   
   /** @param newFechaFinalzacion
    * @pdOid 4185a20f-666f-4dc2-8c27-ee8cc48452b5 */
   public void setFechaFinalzacion(java.util.Date newFechaFinalzacion) {
      fechaFinalzacion = newFechaFinalzacion;
   }
   
   /** @pdOid 6e7f622d-f791-4bf5-85f7-c696bfda328c */
   public int getPrecio() {
      return precio;
   }
   
   /** @param newPrecio
    * @pdOid e6fd9e61-fc33-4a52-aafb-bf7cbdc0a467 */
   public void setPrecio(int newPrecio) {
      precio = newPrecio;
   }
   
   /** @pdOid 1b156401-2824-4aa3-9092-2370af701ec1 */
   public short getIsVisible() {
      return isVisible;
   }
   
   /** @param newIsVisible
    * @pdOid 683afbef-172f-4315-bad8-cc65437f8d4f */
   public void setIsVisible(short newIsVisible) {
      isVisible = newIsVisible;
   }
   
   /** @pdOid 3f873528-b378-4fee-8e06-017c3d49421b */
   public java.lang.String getTituloOferta() {
      return tituloOferta;
   }
   
   /** @param newTituloOferta
    * @pdOid eb045076-c291-46c0-b1a0-c124edaf7100 */
   public void setTituloOferta(java.lang.String newTituloOferta) {
      tituloOferta = newTituloOferta;
   }
   
   /** @pdOid c1ca3e89-6202-437e-a398-f7646d35c788 */
   public java.lang.String getDescripcionOferta() {
      return descripcionOferta;
   }
   
   /** @param newDescripcionOferta
    * @pdOid 630afe56-4082-4b11-8131-2b12c5834dd2 */
   public void setDescripcionOferta(java.lang.String newDescripcionOferta) {
      descripcionOferta = newDescripcionOferta;
   }
   
   /** @pdOid a7ea9d72-f5b2-4ff9-bf88-ea8ff0d7e746 */
   public java.lang.String getCondiciones() {
      return condiciones;
   }
   
   /** @param newCondiciones
    * @pdOid 53c053d5-2159-426d-9be9-0c814acd13a2 */
   public void setCondiciones(java.lang.String newCondiciones) {
      condiciones = newCondiciones;
   }
   
   /** @pdOid 25de68e3-5111-4981-b3ca-0d2fd5832273 */
   public short getIsDisponible() {
      return isDisponible;
   }
   
   /** @param newIsDisponible
    * @pdOid da2b4f1f-a322-42aa-9987-baa9d2c3b5b3 */
   public void setIsDisponible(short newIsDisponible) {
      isDisponible = newIsDisponible;
   }
   
   /** @pdOid 7906a5c7-beb0-424c-a9e3-33ccb6e857d0 */
   public java.util.Date getFechaModificacion() {
      return fechaModificacion;
   }
   
   /** @param newFechaModificacion
    * @pdOid 796bed96-2c09-47cd-894a-ded7ae56f2b7 */
   public void setFechaModificacion(java.util.Date newFechaModificacion) {
      fechaModificacion = newFechaModificacion;
   }
   
   /** @pdOid 060a6daa-6329-4260-a321-1d869fde2187 */
   public java.util.Date getFechaEliminacion() {
      return fechaEliminacion;
   }
   
   /** @param newFechaEliminacion
    * @pdOid b0d0bd76-6d35-4c30-b8fb-519e9f104f2b */
   public void setFechaEliminacion(java.util.Date newFechaEliminacion) {
      fechaEliminacion = newFechaEliminacion;
   }
   
   /** @pdOid 3d583e49-2042-40b2-a701-40b1a95fecdc */
   public Oferta() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<DetalleOferta> getDetalleOferta() {
      if (detalleOferta == null)
         detalleOferta = new java.util.HashSet<DetalleOferta>();
      return detalleOferta;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorDetalleOferta() {
      if (detalleOferta == null)
         detalleOferta = new java.util.HashSet<DetalleOferta>();
      return detalleOferta.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newDetalleOferta */
   public void setDetalleOferta(java.util.Collection<DetalleOferta> newDetalleOferta) {
      removeAllDetalleOferta();
      for (java.util.Iterator iter = newDetalleOferta.iterator(); iter.hasNext();)
         addDetalleOferta((DetalleOferta)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newDetalleOferta */
   public void addDetalleOferta(DetalleOferta newDetalleOferta) {
      if (newDetalleOferta == null)
         return;
      if (this.detalleOferta == null)
         this.detalleOferta = new java.util.HashSet<DetalleOferta>();
      if (!this.detalleOferta.contains(newDetalleOferta))
      {
         this.detalleOferta.add(newDetalleOferta);
         newDetalleOferta.setOferta(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldDetalleOferta */
   public void removeDetalleOferta(DetalleOferta oldDetalleOferta) {
      if (oldDetalleOferta == null)
         return;
      if (this.detalleOferta != null)
         if (this.detalleOferta.contains(oldDetalleOferta))
         {
            this.detalleOferta.remove(oldDetalleOferta);
            oldDetalleOferta.setOferta((Oferta)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllDetalleOferta() {
      if (detalleOferta != null)
      {
         DetalleOferta oldDetalleOferta;
         for (java.util.Iterator iter = getIteratorDetalleOferta(); iter.hasNext();)
         {
            oldDetalleOferta = (DetalleOferta)iter.next();
            iter.remove();
            oldDetalleOferta.setOferta((Oferta)null);
         }
      }
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
         newValoracion.setOferta(this);      
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
            oldValoracion.setOferta((Oferta)null);
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
            oldValoracion.setOferta((Oferta)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Track> getTrack() {
      if (track == null)
         track = new java.util.HashSet<Track>();
      return track;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTrack() {
      if (track == null)
         track = new java.util.HashSet<Track>();
      return track.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTrack */
   public void setTrack(java.util.Collection<Track> newTrack) {
      removeAllTrack();
      for (java.util.Iterator iter = newTrack.iterator(); iter.hasNext();)
         addTrack((Track)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTrack */
   public void addTrack(Track newTrack) {
      if (newTrack == null)
         return;
      if (this.track == null)
         this.track = new java.util.HashSet<Track>();
      if (!this.track.contains(newTrack))
      {
         this.track.add(newTrack);
         newTrack.setOferta(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTrack */
   public void removeTrack(Track oldTrack) {
      if (oldTrack == null)
         return;
      if (this.track != null)
         if (this.track.contains(oldTrack))
         {
            this.track.remove(oldTrack);
            oldTrack.setOferta((Oferta)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTrack() {
      if (track != null)
      {
         Track oldTrack;
         for (java.util.Iterator iter = getIteratorTrack(); iter.hasNext();)
         {
            oldTrack = (Track)iter.next();
            iter.remove();
            oldTrack.setOferta((Oferta)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<ImgOferta> getImgOferta() {
      if (imgOferta == null)
         imgOferta = new java.util.HashSet<ImgOferta>();
      return imgOferta;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorImgOferta() {
      if (imgOferta == null)
         imgOferta = new java.util.HashSet<ImgOferta>();
      return imgOferta.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newImgOferta */
   public void setImgOferta(java.util.Collection<ImgOferta> newImgOferta) {
      removeAllImgOferta();
      for (java.util.Iterator iter = newImgOferta.iterator(); iter.hasNext();)
         addImgOferta((ImgOferta)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newImgOferta */
   public void addImgOferta(ImgOferta newImgOferta) {
      if (newImgOferta == null)
         return;
      if (this.imgOferta == null)
         this.imgOferta = new java.util.HashSet<ImgOferta>();
      if (!this.imgOferta.contains(newImgOferta))
      {
         this.imgOferta.add(newImgOferta);
         newImgOferta.setOferta(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldImgOferta */
   public void removeImgOferta(ImgOferta oldImgOferta) {
      if (oldImgOferta == null)
         return;
      if (this.imgOferta != null)
         if (this.imgOferta.contains(oldImgOferta))
         {
            this.imgOferta.remove(oldImgOferta);
            oldImgOferta.setOferta((Oferta)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllImgOferta() {
      if (imgOferta != null)
      {
         ImgOferta oldImgOferta;
         for (java.util.Iterator iter = getIteratorImgOferta(); iter.hasNext();)
         {
            oldImgOferta = (ImgOferta)iter.next();
            iter.remove();
            oldImgOferta.setOferta((Oferta)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<HistorialCorreo> getHistorialCorreo() {
      if (historialCorreo == null)
         historialCorreo = new java.util.HashSet<HistorialCorreo>();
      return historialCorreo;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHistorialCorreo() {
      if (historialCorreo == null)
         historialCorreo = new java.util.HashSet<HistorialCorreo>();
      return historialCorreo.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHistorialCorreo */
   public void setHistorialCorreo(java.util.Collection<HistorialCorreo> newHistorialCorreo) {
      removeAllHistorialCorreo();
      for (java.util.Iterator iter = newHistorialCorreo.iterator(); iter.hasNext();)
         addHistorialCorreo((HistorialCorreo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newHistorialCorreo */
   public void addHistorialCorreo(HistorialCorreo newHistorialCorreo) {
      if (newHistorialCorreo == null)
         return;
      if (this.historialCorreo == null)
         this.historialCorreo = new java.util.HashSet<HistorialCorreo>();
      if (!this.historialCorreo.contains(newHistorialCorreo))
      {
         this.historialCorreo.add(newHistorialCorreo);
         newHistorialCorreo.setOferta(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldHistorialCorreo */
   public void removeHistorialCorreo(HistorialCorreo oldHistorialCorreo) {
      if (oldHistorialCorreo == null)
         return;
      if (this.historialCorreo != null)
         if (this.historialCorreo.contains(oldHistorialCorreo))
         {
            this.historialCorreo.remove(oldHistorialCorreo);
            oldHistorialCorreo.setOferta((Oferta)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHistorialCorreo() {
      if (historialCorreo != null)
      {
         HistorialCorreo oldHistorialCorreo;
         for (java.util.Iterator iter = getIteratorHistorialCorreo(); iter.hasNext();)
         {
            oldHistorialCorreo = (HistorialCorreo)iter.next();
            iter.remove();
            oldHistorialCorreo.setOferta((Oferta)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Rubro getRubro() {
      return rubro;
   }
   
   /** @pdGenerated default parent setter
     * @param newRubro */
   public void setRubro(Rubro newRubro) {
      if (this.rubro == null || !this.rubro.equals(newRubro))
      {
         if (this.rubro != null)
         {
            Rubro oldRubro = this.rubro;
            this.rubro = null;
            oldRubro.removeOferta(this);
         }
         if (newRubro != null)
         {
            this.rubro = newRubro;
            this.rubro.addOferta(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Local getLocal() {
      return local;
   }
   
   /** @pdGenerated default parent setter
     * @param newLocal */
   public void setLocal(Local newLocal) {
      if (this.local == null || !this.local.equals(newLocal))
      {
         if (this.local != null)
         {
            Local oldLocal = this.local;
            this.local = null;
            oldLocal.removeOferta(this);
         }
         if (newLocal != null)
         {
            this.local = newLocal;
            this.local.addOferta(this);
         }
      }
   }

}