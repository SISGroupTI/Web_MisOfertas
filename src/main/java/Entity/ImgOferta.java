package Entity;

/***********************************************************************
 * Module:  ImgOferta.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class ImgOferta
 ***********************************************************************/

import Entity.Oferta;
import java.util.*;

/** @pdOid 3b2d48d3-337f-4591-b8db-d143f378bfe7 */
public class ImgOferta {
   /** @pdOid 9426d108-942b-4dd4-a0e0-8c304405c449 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 64b2027c-41a1-4b69-a05a-647bb161523e */
   public java.lang.String imagen;
   /** @pdOid aacefa3c-895a-4392-96ee-ab91988a9d2c */
   public short isPrincipal;
   
   /** @pdRoleInfo migr=no name=Oferta assc=reference26 mult=0..1 side=A */
   public Oferta oferta;
   
   /** @pdOid a76f7bb7-c2bc-4768-b46c-d5834e1b4f3d */
   public java.lang.String getImagen() {
      return imagen;
   }
   
   /** @param newImagen
    * @pdOid 87359f51-82da-4459-81f8-00c366bba127 */
   public void setImagen(java.lang.String newImagen) {
      imagen = newImagen;
   }
   
   /** @pdOid cdff6e48-ceed-4704-8bda-b2f17a61537d */
   public short getIsPrincipal() {
      return isPrincipal;
   }
   
   /** @param newIsPrincipal
    * @pdOid 88bbae42-0def-4d85-a3fc-2d6a5f05d9b6 */
   public void setIsPrincipal(short newIsPrincipal) {
      isPrincipal = newIsPrincipal;
   }
   
   /** @pdOid b0991804-0e61-4818-b96a-9527a3178a15 */
   public ImgOferta() {
      // TODO: implement
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
            oldOferta.removeImgOferta(this);
         }
         if (newOferta != null)
         {
            this.oferta = newOferta;
            this.oferta.addImgOferta(this);
         }
      }
   }

}