package Entity;

/***********************************************************************
 * Module:  Valoracion.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Valoracion
 ***********************************************************************/

import java.util.*;

/** @pdOid 846afde3-e34d-40c7-b3ca-faf0f67181cf */
public class Valoracion {
   /** @pdOid fd87ffdc-51ef-4cc3-855a-7a70cac05035 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 93367018-139a-4618-a194-9364699a3d36 */
   public long idValoracion;
   /** @pdOid aa1f6643-6937-4d3a-9ef0-9834f3fb0c1e */
   public java.lang.String fotoValoracion;
   /** @pdOid e8269aa7-a3fd-4168-92a8-c27934ce64dc */
   public int puntoGanado;
   /** @pdOid 0bcf7c01-d12f-4708-8dd7-246fdf1a1470 */
   public java.util.Date fechaValoracion;
   
   /** @pdRoleInfo migr=no name=Consumidor assc=reference12 mult=1..1 side=A */
   public Consumidor consumidor;
   /** @pdRoleInfo migr=no name=Oferta assc=reference13 mult=1..1 side=A */
   public Oferta oferta;
   /** @pdRoleInfo migr=no name=Escala assc=reference21 mult=1..1 side=A */
   public Escala escala;
   
   /** @pdOid ba0956e3-f4ac-4b22-946f-cdc00530d84a */
   public long getIdValoracion() {
      return idValoracion;
   }
   
   /** @param newIdValoracion
    * @pdOid 97006fa8-4b8b-44b1-8d95-7d3f9c69c518 */
   public void setIdValoracion(long newIdValoracion) {
      idValoracion = newIdValoracion;
   }
   
   /** @pdOid 12e3431c-cceb-438d-9091-254178e87a45 */
   public java.lang.String getFotoValoracion() {
      return fotoValoracion;
   }
   
   /** @param newFotoValoracion
    * @pdOid c117c1f2-cfe7-441c-b06f-c0a0a982583a */
   public void setFotoValoracion(java.lang.String newFotoValoracion) {
      fotoValoracion = newFotoValoracion;
   }
   
   /** @pdOid 36182071-4784-45d8-8710-ab15a9dfbbda */
   public int getPuntoGanado() {
      return puntoGanado;
   }
   
   /** @param newPuntoGanado
    * @pdOid fac8cd30-2b83-4542-a1c8-ff4f3cdced46 */
   public void setPuntoGanado(int newPuntoGanado) {
      puntoGanado = newPuntoGanado;
   }
   
   /** @pdOid f0715b93-f935-4ccc-b1c2-dee0aabda541 */
   public java.util.Date getFechaValoracion() {
      return fechaValoracion;
   }
   
   /** @param newFechaValoracion
    * @pdOid adafbe34-9046-4861-8413-58bd9b684413 */
   public void setFechaValoracion(java.util.Date newFechaValoracion) {
      fechaValoracion = newFechaValoracion;
   }
   
   /** @pdOid 9d281039-1c9c-43e3-8d13-8e1e1c1b64b0 */
   public Valoracion() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default parent getter */
   public Consumidor getConsumidor() {
      return consumidor;
   }
   
   /** @pdGenerated default parent setter
     * @param newConsumidor */
   public void setConsumidor(Consumidor newConsumidor) {
      if (this.consumidor == null || !this.consumidor.equals(newConsumidor))
      {
         if (this.consumidor != null)
         {
            Consumidor oldConsumidor = this.consumidor;
            this.consumidor = null;
            oldConsumidor.removeValoracion(this);
         }
         if (newConsumidor != null)
         {
            this.consumidor = newConsumidor;
            this.consumidor.addValoracion(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Oferta getOferta() {
      return oferta;
   }
   
   /** @pdGenerated default parent setter
     * @param newOferta */
   public void setOferta(Oferta newOferta) {
      if (this.oferta == null || !this.oferta.equals(newOferta))
      {
         if (this.oferta != null)
         {
            Oferta oldOferta = this.oferta;
            this.oferta = null;
            oldOferta.removeValoracion(this);
         }
         if (newOferta != null)
         {
            this.oferta = newOferta;
            this.oferta.addValoracion(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Escala getEscala() {
      return escala;
   }
   
   /** @pdGenerated default parent setter
     * @param newEscala */
   public void setEscala(Escala newEscala) {
      if (this.escala == null || !this.escala.equals(newEscala))
      {
         if (this.escala != null)
         {
            Escala oldEscala = this.escala;
            this.escala = null;
            oldEscala.removeValoracion(this);
         }
         if (newEscala != null)
         {
            this.escala = newEscala;
            this.escala.addValoracion(this);
         }
      }
   }

}