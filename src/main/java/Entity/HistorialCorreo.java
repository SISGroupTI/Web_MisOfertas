package Entity;

/***********************************************************************
 * Module:  HistorialCorreo.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class HistorialCorreo
 ***********************************************************************/

import Entity.Oferta;
import java.util.*;

/** @pdOid 3f106a35-fce1-47f8-bd53-63559e74be18 */
public class HistorialCorreo {
   /** @pdOid b83c5120-d575-4531-92b3-bcec55c52f1b */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid f78ba5bc-dc27-425a-9f8e-19f3cea1c0be */
   public long idHistorialCorreo;
   /** @pdOid e63ac126-fad7-4f20-8eb2-bd0f98905148 */
   public java.util.Date fechaEnvio;
   
   /** @pdRoleInfo migr=no name=Consumidor assc=reference28 mult=1..1 side=A */
   public Consumidor consumidor;
   /** @pdRoleInfo migr=no name=Oferta assc=reference29 mult=1..1 side=A */
   public Oferta oferta;
   
   /** @pdOid f878fab7-5071-48d9-9396-87de8796dcb5 */
   public long getIdHistorialCorreo() {
      return idHistorialCorreo;
   }
   
   /** @param newIdHistorialCorreo
    * @pdOid fe204c8f-871f-4bf0-b382-09b0c4cebd2f */
   public void setIdHistorialCorreo(long newIdHistorialCorreo) {
      idHistorialCorreo = newIdHistorialCorreo;
   }
   
   /** @pdOid 4a37ba14-3d77-445f-946f-6a4b044985c0 */
   public java.util.Date getFechaEnvio() {
      return fechaEnvio;
   }
   
   /** @param newFechaEnvio
    * @pdOid 5771f43e-2ea9-4c2d-9852-3ae72dfa516a */
   public void setFechaEnvio(java.util.Date newFechaEnvio) {
      fechaEnvio = newFechaEnvio;
   }
   
   /** @pdOid 0a02aea2-6354-4042-a7e0-fc9465f19d85 */
   public HistorialCorreo() {
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
            oldConsumidor.removeHistorialCorreo(this);
         }
         if (newConsumidor != null)
         {
            this.consumidor = newConsumidor;
            this.consumidor.addHistorialCorreo(this);
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
            oldOferta.removeHistorialCorreo(this);
         }
         if (newOferta != null)
         {
            this.oferta = newOferta;
            this.oferta.addHistorialCorreo(this);
         }
      }
   }

}