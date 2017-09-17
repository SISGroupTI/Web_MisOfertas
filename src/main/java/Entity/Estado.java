package Entity;

/***********************************************************************
 * Module:  Estado.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Estado
 ***********************************************************************/

import java.util.*;

/** @pdOid 323c9e73-9f56-404c-83ee-3c24d2528736 */
public class Estado {
   /** @pdOid 643de8ba-0d94-4802-b70d-76179b6813d9 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid b74b7346-6831-45da-9fad-fc51de4389c3 */
   public long idEstado;
   /** @pdOid 88ffb534-9a54-46f1-96b5-aefa4334812d */
   public java.lang.String estado;
   
   /** @pdRoleInfo migr=no name=Producto assc=reference27 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Producto> producto;
   
   /** @pdOid 4ed85216-5d93-434e-91a5-89ab510d1d9a */
   public long getIdEstado() {
      return idEstado;
   }
   
   /** @param newIdEstado
    * @pdOid c1975a32-9a39-48ca-b2fd-4ef633e1793d */
   public void setIdEstado(long newIdEstado) {
      idEstado = newIdEstado;
   }
   
   /** @pdOid dd49db7b-896c-4d8f-8ae9-e90353f5f2cb */
   public java.lang.String getEstado() {
      return estado;
   }
   
   /** @param newEstado
    * @pdOid f0aadeb7-9306-4554-8de7-4b67dfd072d6 */
   public void setEstado(java.lang.String newEstado) {
      estado = newEstado;
   }
   
   /** @pdOid 10f51a2e-a617-46b2-a708-0c1da00a7fdc */
   public Estado() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Producto> getProducto() {
      if (producto == null)
         producto = new java.util.HashSet<Producto>();
      return producto;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorProducto() {
      if (producto == null)
         producto = new java.util.HashSet<Producto>();
      return producto.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newProducto */
   public void setProducto(java.util.Collection<Producto> newProducto) {
      removeAllProducto();
      for (java.util.Iterator iter = newProducto.iterator(); iter.hasNext();)
         addProducto((Producto)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newProducto */
   public void addProducto(Producto newProducto) {
      if (newProducto == null)
         return;
      if (this.producto == null)
         this.producto = new java.util.HashSet<Producto>();
      if (!this.producto.contains(newProducto))
      {
         this.producto.add(newProducto);
         newProducto.setEstado(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldProducto */
   public void removeProducto(Producto oldProducto) {
      if (oldProducto == null)
         return;
      if (this.producto != null)
         if (this.producto.contains(oldProducto))
         {
            this.producto.remove(oldProducto);
            oldProducto.setEstado((Estado)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllProducto() {
      if (producto != null)
      {
         Producto oldProducto;
         for (java.util.Iterator iter = getIteratorProducto(); iter.hasNext();)
         {
            oldProducto = (Producto)iter.next();
            iter.remove();
            oldProducto.setEstado((Estado)null);
         }
      }
   }

}