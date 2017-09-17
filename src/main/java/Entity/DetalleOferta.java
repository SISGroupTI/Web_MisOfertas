package Entity;

/***********************************************************************
 * Module:  DetalleOferta.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class DetalleOferta
 ***********************************************************************/

import Entity.Oferta;
import java.util.*;

/** @pdOid 7e6471df-ca30-46f4-8677-aa7b54f8e693 */
public class DetalleOferta {
   /** @pdOid 0a0d6ec9-fb53-4b52-9f62-48bbacd5c0f9 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 6a3ac721-c9d5-4c02-a735-0818d3c7979f */
   public long idDetalle;
   /** @pdOid c2e6ee66-2cfc-491a-9920-e18b8d5cefe7 */
   public int cantidadMinima;
   /** @pdOid 5c5ef241-6303-4f8a-b2c2-f9bcdb2f5137 */
   public int cantidadMaxima;
   /** @pdOid 999d6542-69d2-479d-a9d3-55f1d6e4966e */
   public java.util.Date fechaIngreso;
   
   /** @pdRoleInfo migr=no name=Oferta assc=reference7 mult=1..1 side=A */
   public Oferta oferta;
   /** @pdRoleInfo migr=no name=Producto assc=reference10 mult=1..1 side=A */
   public Producto producto;
   
   /** @pdOid ba3196bb-0585-4d30-b937-bedb1cff38ae */
   public long getIdDetalle() {
      return idDetalle;
   }
   
   /** @param newIdDetalle
    * @pdOid b9af401d-671b-4d38-9b15-29d13b30606d */
   public void setIdDetalle(long newIdDetalle) {
      idDetalle = newIdDetalle;
   }
   
   /** @pdOid faf9e160-46b9-47fc-a232-727f48039267 */
   public int getCantidadMinima() {
      return cantidadMinima;
   }
   
   /** @param newCantidadMinima
    * @pdOid 081f7cca-3956-4645-86d2-f70724561a9c */
   public void setCantidadMinima(int newCantidadMinima) {
      cantidadMinima = newCantidadMinima;
   }
   
   /** @pdOid 12792822-447c-4a92-9e24-163c0a3124fc */
   public int getCantidadMaxima() {
      return cantidadMaxima;
   }
   
   /** @param newCantidadMaxima
    * @pdOid e726e1a2-4986-4424-9691-5bd6f7423af5 */
   public void setCantidadMaxima(int newCantidadMaxima) {
      cantidadMaxima = newCantidadMaxima;
   }
   
   /** @pdOid 0e3a51a9-4ba4-4b61-89a1-43363e292f16 */
   public java.util.Date getFechaIngreso() {
      return fechaIngreso;
   }
   
   /** @param newFechaIngreso
    * @pdOid 6335ec98-1c34-46ff-ae86-d3f818e37aee */
   public void setFechaIngreso(java.util.Date newFechaIngreso) {
      fechaIngreso = newFechaIngreso;
   }
   
   /** @pdOid bcbdec93-6051-4da2-b035-0f5621d6df47 */
   public DetalleOferta() {
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
            oldOferta.removeDetalleOferta(this);
         }
         if (newOferta != null)
         {
            this.oferta = newOferta;
            this.oferta.addDetalleOferta(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Producto getProducto() {
      return producto;
   }
   
   /** @pdGenerated default parent setter
     * @param newProducto */
   public void setProducto(Producto newProducto) {
      if (this.producto == null || !this.producto.equals(newProducto))
      {
         if (this.producto != null)
         {
            Producto oldProducto = this.producto;
            this.producto = null;
            oldProducto.removeDetalleOferta(this);
         }
         if (newProducto != null)
         {
            this.producto = newProducto;
            this.producto.addDetalleOferta(this);
         }
      }
   }

}