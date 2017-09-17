package Entity;

/***********************************************************************
 * Module:  Trabajador.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Trabajador
 ***********************************************************************/

import java.util.*;

/** @pdOid 8f8adc92-5468-40f3-81eb-3de3baf55654 */
public class Trabajador {
   /** @pdOid 1f259438-7ed4-459e-855d-6c9739aaf3cc */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 1c574a4b-94ab-4555-9eeb-e977dccdcc72 */
   public long idTrabajador;
   /** @pdOid adb66ff6-81e5-44d1-9c92-5731d67c467e */
   public java.lang.String nombreUsuario;
   /** @pdOid b4009fae-ff02-4c3d-894d-a386c53c87cb */
   public int rut;
   /** @pdOid e18ffd88-b608-46bf-82c5-3005c9ce7771 */
   public java.lang.String dv;
   /** @pdOid 76236415-4398-48a8-8210-649a84e9eb2e */
   public java.lang.String nombre;
   /** @pdOid 16604f1e-f10a-4d8f-aa9a-cb509d40ca6d */
   public java.lang.String apellidos;
   /** @pdOid 1b0ad3f7-149b-4b68-bad5-44c3be3ec04f */
   public java.lang.String correoCorporativo;
   /** @pdOid 99aafdbc-ef35-4127-9dfa-002a13809b72 */
   public java.util.Date fechaIngreso;
   /** @pdOid c5341087-b068-4939-a18a-a0ace5efd062 */
   public java.util.Date fechaModificacion;
   /** @pdOid 79313c4c-215f-4c00-af01-45dd94b48ffc */
   public int fechaEliminacion;
   /** @pdOid db923683-5589-4377-a324-d62ba963c208 */
   public java.lang.String contrasena;
   /** @pdOid fdf9e4eb-ee9b-4e52-bbc8-78b2b2c10060 */
   public short isActivo;
   
   /** @pdRoleInfo migr=no name=Perfil assc=reference24 mult=1..1 side=A */
   public Perfil perfil;
   /** @pdRoleInfo migr=no name=Local assc=reference25 mult=1..1 side=A */
   public Local local;
   
   /** @pdOid cb3b7905-d9c6-4973-9d42-572e771ca7b2 */
   public long getIdTrabajador() {
      return idTrabajador;
   }
   
   /** @param newIdTrabajador
    * @pdOid 441fa6a4-d3bf-4bec-8fae-32c32c0584bf */
   public void setIdTrabajador(long newIdTrabajador) {
      idTrabajador = newIdTrabajador;
   }
   
   /** @pdOid ea179d0a-0f1d-48e7-8a30-cd2d03ac0550 */
   public java.lang.String getNombreUsuario() {
      return nombreUsuario;
   }
   
   /** @param newNombreUsuario
    * @pdOid f37dbbfa-56c9-492b-a695-a38b1191bd62 */
   public void setNombreUsuario(java.lang.String newNombreUsuario) {
      nombreUsuario = newNombreUsuario;
   }
   
   /** @pdOid 57c2483b-a895-492e-9923-63ac46dcebf8 */
   public int getRut() {
      return rut;
   }
   
   /** @param newRut
    * @pdOid 2d02672e-5f30-4139-80b2-8b53e80e8290 */
   public void setRut(int newRut) {
      rut = newRut;
   }
   
   /** @pdOid fc8b1150-cc35-460b-801e-858ffb8f8502 */
   public java.lang.String getDv() {
      return dv;
   }
   
   /** @param newDv
    * @pdOid 626d92ab-b045-4728-bfc6-802e964eba1e */
   public void setDv(java.lang.String newDv) {
      dv = newDv;
   }
   
   /** @pdOid 3d4b27cf-3100-4438-8071-b3dadc51fec1 */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid a17c9179-5b78-4331-b706-fac6059bcc7b */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid 7c6b8ee9-61df-4bf0-9d58-b997b5f5f58f */
   public java.lang.String getApellidos() {
      return apellidos;
   }
   
   /** @param newApellidos
    * @pdOid 29772bb7-0981-4f5e-8653-aaad85ade69f */
   public void setApellidos(java.lang.String newApellidos) {
      apellidos = newApellidos;
   }
   
   /** @pdOid 07c30d0f-f8a6-4868-a1c9-596c31d87391 */
   public java.lang.String getCorreoCorporativo() {
      return correoCorporativo;
   }
   
   /** @param newCorreoCorporativo
    * @pdOid 3f5bceff-fe2a-4cfa-a7fa-0724e4a3ac07 */
   public void setCorreoCorporativo(java.lang.String newCorreoCorporativo) {
      correoCorporativo = newCorreoCorporativo;
   }
   
   /** @pdOid 2f955176-3b2f-4cf0-8b87-a4cf37eee2fd */
   public java.util.Date getFechaIngreso() {
      return fechaIngreso;
   }
   
   /** @param newFechaIngreso
    * @pdOid 05a10fc2-cbd6-460a-af86-37c22b461318 */
   public void setFechaIngreso(java.util.Date newFechaIngreso) {
      fechaIngreso = newFechaIngreso;
   }
   
   /** @pdOid 47796061-acb8-4b67-9407-e8de2e11c978 */
   public java.util.Date getFechaModificacion() {
      return fechaModificacion;
   }
   
   /** @param newFechaModificacion
    * @pdOid 6ac66772-e312-4d0a-a855-5d3468a21dba */
   public void setFechaModificacion(java.util.Date newFechaModificacion) {
      fechaModificacion = newFechaModificacion;
   }
   
   /** @pdOid e0658e0a-1ca6-45d0-8183-9b6c31f73267 */
   public int getFechaEliminacion() {
      return fechaEliminacion;
   }
   
   /** @param newFechaEliminacion
    * @pdOid e3dec0d3-383e-471c-ad16-e363e9bafb81 */
   public void setFechaEliminacion(int newFechaEliminacion) {
      fechaEliminacion = newFechaEliminacion;
   }
   
   /** @pdOid 44651949-b0ae-4381-b2ba-976c14cf2c19 */
   public java.lang.String getContrasena() {
      return contrasena;
   }
   
   /** @param newContrasena
    * @pdOid 17667184-0348-433d-bfde-9c21a58e48cd */
   public void setContrasena(java.lang.String newContrasena) {
      contrasena = newContrasena;
   }
   
   /** @pdOid c44a4ab1-e48c-44fb-92bf-dac9ce3e3bc7 */
   public short getIsActivo() {
      return isActivo;
   }
   
   /** @param newIsActivo
    * @pdOid 4163d648-43a1-4eec-bef7-c2d3db889a76 */
   public void setIsActivo(short newIsActivo) {
      isActivo = newIsActivo;
   }
   
   /** @pdOid e2683b60-a460-49d5-9994-700f26bdf9ee */
   public Trabajador() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default parent getter */
   public Perfil getPerfil() {
      return perfil;
   }
   
   /** @pdGenerated default parent setter
     * @param newPerfil */
   public void setPerfil(Perfil newPerfil) {
      if (this.perfil == null || !this.perfil.equals(newPerfil))
      {
         if (this.perfil != null)
         {
            Perfil oldPerfil = this.perfil;
            this.perfil = null;
            oldPerfil.removeTrabajador(this);
         }
         if (newPerfil != null)
         {
            this.perfil = newPerfil;
            this.perfil.addTrabajador(this);
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
            oldLocal.removeTrabajador(this);
         }
         if (newLocal != null)
         {
            this.local = newLocal;
            this.local.addTrabajador(this);
         }
      }
   }

}