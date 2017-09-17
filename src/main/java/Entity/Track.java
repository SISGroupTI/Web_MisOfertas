package Entity;

/***********************************************************************
 * Module:  Track.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Track
 ***********************************************************************/

import Entity.Oferta;
import java.util.*;

/** @pdOid 76a1a19e-1bee-4545-8848-074024a361e5 */
public class Track {
   /** @pdOid 591056a9-30b2-4c72-8e18-ecf93116f51f */
   public long idTrack;
   /** @pdOid bda0c334-bc02-47c2-9f68-67b62c55e460 */
   public java.util.Date fechaAccion;
   /** @pdOid 6c65e9f1-0162-4157-a4cb-2c27339724c8 */
   public java.lang.String accion;
   
   /** @pdRoleInfo migr=no name=Consumidor assc=reference18 mult=1..1 side=A */
   public Consumidor consumidor;
   /** @pdRoleInfo migr=no name=Oferta assc=reference17 mult=1..1 side=A */
   public Oferta oferta;
   /** @pdRoleInfo migr=no name=Rubro assc=reference22 mult=1..1 side=A */
   public Rubro rubro;
   
   
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
            oldConsumidor.removeTrack(this);
         }
         if (newConsumidor != null)
         {
            this.consumidor = newConsumidor;
            this.consumidor.addTrack(this);
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
            oldOferta.removeTrack(this);
         }
         if (newOferta != null)
         {
            this.oferta = newOferta;
            this.oferta.addTrack(this);
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
            oldRubro.removeTrack(this);
         }
         if (newRubro != null)
         {
            this.rubro = newRubro;
            this.rubro.addTrack(this);
         }
      }
   }

}