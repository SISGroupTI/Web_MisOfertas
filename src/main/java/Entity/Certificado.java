
package Entity;

/***********************************************************************
 * Module:  Certificado.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Certificado
 ***********************************************************************/

import java.util.*;

/** @pdOid 383a7f6a-8fbe-48db-b4a9-fc9879df122e */
public class Certificado {
   /** @pdOid b2cdb3ae-5c6b-41a4-9412-880e0a7f3726 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid abe998c3-31a9-4bee-9450-a6034bf05ff2 */
   public long idCertificado;
   /** @pdOid 30433348-6e7a-4e5a-bce0-4efda1d6c34a */
   public int puntos;
   /** @pdOid c48d6634-0b61-4320-86db-193597f4b788 */
   public float descuento;
   /** @pdOid 31eb2ecd-8889-4bfd-b64a-5c5e322840d8 */
   public int tope;
   /** @pdOid 2892fb64-4443-49eb-b94a-6d60cb505bcd */
   public java.lang.String condiciones;
   /** @pdOid 611eecbf-1d8c-4086-a9c9-405f97d8e3b4 */
   public java.util.Date fechaEmision;
   
   public int is_generado;
   /** @pdRoleInfo migr=no name=CertificadoRubro assc=reference32 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<CertificadoRubro> certificadoRubro;
   /** @pdRoleInfo migr=no name=Consumidor assc=reference14 mult=1..1 side=A */
   public Consumidor consumidor;
   
   /** @pdOid 4cf9a91c-0f7f-46a4-85d3-3c27f1bad12d */
   public long getIdCertificado() {
      return idCertificado;
   }
   
   /** @param newIdCertificado
    * @pdOid 588b1a34-8968-40ee-8d16-6c56b20012f3 */
   public void setIdCertificado(long newIdCertificado) {
      idCertificado = newIdCertificado;
   }
   
   /** @pdOid 18d202a6-f78a-4bae-8e88-b4dabcac4825 */
   public int getPuntos() {
      return puntos;
   }
   
   /** @param newPuntos
    * @pdOid a01b4269-4dca-4f19-b8b3-d9cb89d1e6c0 */
   public void setPuntos(int newPuntos) {
      puntos = newPuntos;
   }
   
   /** @pdOid e041e98f-1ead-4f6a-a924-eeabf2c3be37 */
   public float getDescuento() {
      return descuento;
   }
   
   /** @param newDescuento
    * @pdOid d1ba8ea8-21a1-46e7-b12a-658f1eb9ad81 */
   public void setDescuento(float newDescuento) {
      descuento = newDescuento;
   }
   
   /** @pdOid 7b30caa5-6ae7-4fee-b602-7705985fb11c */
   public int getTope() {
      return tope;
   }
   
   /** @param newTope
    * @pdOid dedc31ff-7163-4ac0-b730-7314b4c8f852 */
   public void setTope(int newTope) {
      tope = newTope;
   }
   
   /** @pdOid fb3fde9c-2847-4640-8dc3-adf7a29a89d3 */
   public java.lang.String getCondiciones() {
      return condiciones;
   }
   
   /** @param newCondiciones
    * @pdOid 7ed7978a-2c3e-4847-8ac2-c79eacc287ef */
   public void setCondiciones(java.lang.String newCondiciones) {
      condiciones = newCondiciones;
   }
   
   /** @pdOid 04dcf38f-68d8-4793-8f07-d06812d46ec3 */
   public java.util.Date getFechaEmision() {
      return fechaEmision;
   }
   
   /** @param newFechaEmision
    * @pdOid e120f197-5a1c-4970-a80c-13c76da0cb19 */
   public void setFechaEmision(java.util.Date newFechaEmision) {
      fechaEmision = newFechaEmision;
   }
   
   /** @pdOid f41c4afb-1ec1-410c-a3e8-0b3e437551d8 */
   public Certificado() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<CertificadoRubro> getCertificadoRubro() {
      if (certificadoRubro == null)
         certificadoRubro = new java.util.HashSet<CertificadoRubro>();
      return certificadoRubro;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCertificadoRubro() {
      if (certificadoRubro == null)
         certificadoRubro = new java.util.HashSet<CertificadoRubro>();
      return certificadoRubro.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCertificadoRubro */
   public void setCertificadoRubro(java.util.Collection<CertificadoRubro> newCertificadoRubro) {
      removeAllCertificadoRubro();
      for (java.util.Iterator iter = newCertificadoRubro.iterator(); iter.hasNext();)
         addCertificadoRubro((CertificadoRubro)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCertificadoRubro */
   public void addCertificadoRubro(CertificadoRubro newCertificadoRubro) {
      if (newCertificadoRubro == null)
         return;
      if (this.certificadoRubro == null)
         this.certificadoRubro = new java.util.HashSet<CertificadoRubro>();
      if (!this.certificadoRubro.contains(newCertificadoRubro))
      {
         this.certificadoRubro.add(newCertificadoRubro);
         newCertificadoRubro.setCertificado(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCertificadoRubro */
   public void removeCertificadoRubro(CertificadoRubro oldCertificadoRubro) {
      if (oldCertificadoRubro == null)
         return;
      if (this.certificadoRubro != null)
         if (this.certificadoRubro.contains(oldCertificadoRubro))
         {
            this.certificadoRubro.remove(oldCertificadoRubro);
            oldCertificadoRubro.setCertificado((Certificado)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCertificadoRubro() {
      if (certificadoRubro != null)
      {
         CertificadoRubro oldCertificadoRubro;
         for (java.util.Iterator iter = getIteratorCertificadoRubro(); iter.hasNext();)
         {
            oldCertificadoRubro = (CertificadoRubro)iter.next();
            iter.remove();
            oldCertificadoRubro.setCertificado((Certificado)null);
         }
      }
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
            oldConsumidor.removeCertificado(this);
         }
         if (newConsumidor != null)
         {
            this.consumidor = newConsumidor;
            this.consumidor.addCertificado(this);
         }
      }
   }

    public int getIs_generado() {
        return is_generado;
    }

    public void setIs_generado(int is_generado) {
        this.is_generado = is_generado;
    }

   
}