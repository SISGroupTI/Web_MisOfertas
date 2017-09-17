package Entity;

/***********************************************************************
 * Module:  Consumidor.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Consumidor
 ***********************************************************************/

import Entity.Valoracion;
import java.util.*;

public class Consumidor {

   protected void finalize() {
      
   }
  
   public long idConsumidor;
   public int rut;
   public java.lang.String dv;
   public java.lang.String nombre;
   public java.lang.String apellidos;
   public java.lang.String correo;
   public java.lang.String contrasena;
   public short recibirOferta;
   public java.util.Date fechaRegistro;
   public java.util.Date fechaModificacion;
   public java.util.Date fechaEliminacion;
   public short isActivo;
   
  
   public java.util.Collection<Valoracion> valoracion;
   public java.util.Collection<Certificado> certificado;
   public java.util.Collection<Track> track;
   public java.util.Collection<HistorialCorreo> historialCorreo;
   
   
   public long getIdConsumidor() {
      return idConsumidor;
   }
   public void setIdConsumidor(long newIdConsumidor) {
      idConsumidor = newIdConsumidor;
   }
   public int getRut() {
      return rut;
   }
   public void setRut(int newRut) {
      rut = newRut;
   }
   public java.lang.String getDv() {
      return dv;
   }
   public void setDv(java.lang.String newDv) {
      dv = newDv;
   }
   public java.lang.String getNombre() {
      return nombre;
   }
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   public java.lang.String getApellidos() {
      return apellidos;
   }
   public void setApellidos(java.lang.String newApellidos) {
      apellidos = newApellidos;
   }
   public java.lang.String getCorreo() {
      return correo;
   }
   public void setCorreo(java.lang.String newCorreo) {
      correo = newCorreo;
   }
   public java.lang.String getContrasena() {
      return contrasena;
   }
   public void setContrasena(java.lang.String newContrasena) {
      contrasena = newContrasena;
   }
   public short getRecibirOferta() {
      return recibirOferta;
   }
   public void setRecibirOferta(short newRecibirOferta) {
      recibirOferta = newRecibirOferta;
   }
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   public java.util.Date getFechaModificacion() {
      return fechaModificacion;
   }
   public void setFechaModificacion(java.util.Date newFechaModificacion) {
      fechaModificacion = newFechaModificacion;
   }
   public java.util.Date getFechaEliminacion() {
      return fechaEliminacion;
   }
   public void setFechaEliminacion(java.util.Date newFechaEliminacion) {
      fechaEliminacion = newFechaEliminacion;
   }
   public short getIsActivo() {
      return isActivo;
   }
   public void setIsActivo(short newIsActivo) {
      isActivo = newIsActivo;
   }
   public Consumidor() {
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
         newValoracion.setConsumidor(this);      
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
            oldValoracion.setConsumidor((Consumidor)null);
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
            oldValoracion.setConsumidor((Consumidor)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Certificado> getCertificado() {
      if (certificado == null)
         certificado = new java.util.HashSet<Certificado>();
      return certificado;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCertificado() {
      if (certificado == null)
         certificado = new java.util.HashSet<Certificado>();
      return certificado.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCertificado */
   public void setCertificado(java.util.Collection<Certificado> newCertificado) {
      removeAllCertificado();
      for (java.util.Iterator iter = newCertificado.iterator(); iter.hasNext();)
         addCertificado((Certificado)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCertificado */
   public void addCertificado(Certificado newCertificado) {
      if (newCertificado == null)
         return;
      if (this.certificado == null)
         this.certificado = new java.util.HashSet<Certificado>();
      if (!this.certificado.contains(newCertificado))
      {
         this.certificado.add(newCertificado);
         newCertificado.setConsumidor(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCertificado */
   public void removeCertificado(Certificado oldCertificado) {
      if (oldCertificado == null)
         return;
      if (this.certificado != null)
         if (this.certificado.contains(oldCertificado))
         {
            this.certificado.remove(oldCertificado);
            oldCertificado.setConsumidor((Consumidor)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCertificado() {
      if (certificado != null)
      {
         Certificado oldCertificado;
         for (java.util.Iterator iter = getIteratorCertificado(); iter.hasNext();)
         {
            oldCertificado = (Certificado)iter.next();
            iter.remove();
            oldCertificado.setConsumidor((Consumidor)null);
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
         newTrack.setConsumidor(this);      
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
            oldTrack.setConsumidor((Consumidor)null);
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
            oldTrack.setConsumidor((Consumidor)null);
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
         newHistorialCorreo.setConsumidor(this);      
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
            oldHistorialCorreo.setConsumidor((Consumidor)null);
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
            oldHistorialCorreo.setConsumidor((Consumidor)null);
         }
      }
   }

}