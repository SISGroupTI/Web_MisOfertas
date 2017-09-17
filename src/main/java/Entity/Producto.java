package Entity;

/***********************************************************************
 * Module:  Producto.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Producto
 ***********************************************************************/

import java.util.*;

/** @pdOid bda3a689-a677-4adb-a10c-52e78355d89f */
public class Producto {
   /** @pdOid fb240074-87dd-4311-b170-ae8eee183305 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid 0061c43f-f941-400c-992e-be8b1267a849 */
   public long idProducto;
   /** @pdOid c3f18f47-2414-4270-88a9-aab326648831 */
   public int codigoProducto;
   /** @pdOid ef6f3de3-fb9c-45ec-af2e-a1f41fd3015f */
   public java.lang.String descripcion;
   /** @pdOid 67064fcf-037d-49b1-93c1-cb9534c244d1 */
   public int precioNormal;
   /** @pdOid 8b5872b3-6444-4ed8-b39c-078bff5e68b9 */
   public int precioOferta;
   /** @pdOid 269d1034-7b28-4e91-a5ad-c941bebfca2d */
   public java.util.Date fechaCaducidad;
   /** @pdOid 08092ca7-fd0d-4f54-860c-533acf80d15d */
   public java.util.Date fechaRegistro;
   /** @pdOid c4d623cb-b272-4908-ab0f-2670af6edca5 */
   public java.util.Date fechaModificacion;
   /** @pdOid 9a7b2b1b-71d6-41e7-9ea2-7cd9719fae2b */
   public java.util.Date fechaEliminacion;
   
   /** @pdRoleInfo migr=no name=DetalleOferta assc=reference10 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<DetalleOferta> detalleOferta;
   /** @pdRoleInfo migr=no name=Estado assc=reference27 mult=1..1 side=A */
   public Estado estado;
   /** @pdRoleInfo migr=no name=Local assc=reference31 mult=1..1 side=A */
   public Local local;
   
   /** @pdOid fc444179-ed3e-4b92-8ea0-c703ec57cc34 */
   public long getIdProducto() {
      return idProducto;
   }
   
   /** @param newIdProducto
    * @pdOid f7ba2c94-aa97-48a7-8e41-fbe2f9c96bec */
   public void setIdProducto(long newIdProducto) {
      idProducto = newIdProducto;
   }
   
   /** @pdOid a3a61b92-b3a5-481d-afb2-7c1698e24bb1 */
   public int getCodigoProducto() {
      return codigoProducto;
   }
   
   /** @param newCodigoProducto
    * @pdOid 4374fa03-5aae-41eb-a0fc-d6831c07b9ef */
   public void setCodigoProducto(int newCodigoProducto) {
      codigoProducto = newCodigoProducto;
   }
   
   /** @pdOid 410a6334-b165-4941-ba40-29e8466bd219 */
   public java.lang.String getDescripcion() {
      return descripcion;
   }
   
   /** @param newDescripcion
    * @pdOid 0fec240f-75d9-4475-bb55-f9b26a992256 */
   public void setDescripcion(java.lang.String newDescripcion) {
      descripcion = newDescripcion;
   }
   
   /** @pdOid 2ed14d31-e75d-44f9-bdc8-fe04994eb08e */
   public int getPrecioNormal() {
      return precioNormal;
   }
   
   /** @param newPrecioNormal
    * @pdOid 699a60de-8db2-4375-9344-4411cfb2be2f */
   public void setPrecioNormal(int newPrecioNormal) {
      precioNormal = newPrecioNormal;
   }
   
   /** @pdOid 569b6cd8-e22f-4f46-906c-e82fc8ae6b7b */
   public int getPrecioOferta() {
      return precioOferta;
   }
   
   /** @param newPrecioOferta
    * @pdOid c5dc9028-507e-45f5-adbc-d2fe45e070ee */
   public void setPrecioOferta(int newPrecioOferta) {
      precioOferta = newPrecioOferta;
   }
   
   /** @pdOid e6e5f79e-c341-4bc4-a56b-40d90ecb60e5 */
   public java.util.Date getFechaCaducidad() {
      return fechaCaducidad;
   }
   
   /** @param newFechaCaducidad
    * @pdOid 9e02b600-787f-4fb4-b3a8-33066df0058a */
   public void setFechaCaducidad(java.util.Date newFechaCaducidad) {
      fechaCaducidad = newFechaCaducidad;
   }
   
   /** @pdOid 4f205742-ac0c-442f-9ff8-c78778c21f5d */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 06ec81ac-1f16-4b06-9c5d-85a87fb6114f */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 632ca351-23fa-4431-8806-187e93cdaa00 */
   public java.util.Date getFechaModificacion() {
      return fechaModificacion;
   }
   
   /** @param newFechaModificacion
    * @pdOid 9963215b-ca0c-42e0-ad5a-2d6b0b27ab5e */
   public void setFechaModificacion(java.util.Date newFechaModificacion) {
      fechaModificacion = newFechaModificacion;
   }
   
   /** @pdOid 550e8b04-b1a6-4b72-b51e-5052fbefb14c */
   public java.util.Date getFechaEliminacion() {
      return fechaEliminacion;
   }
   
   /** @param newFechaEliminacion
    * @pdOid ee034d5d-4064-4ebb-a175-2ab4fac15efc */
   public void setFechaEliminacion(java.util.Date newFechaEliminacion) {
      fechaEliminacion = newFechaEliminacion;
   }
   
   /** @pdOid c779b1ca-abfa-4434-9c0c-341e2a576285 */
   public Producto() {
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
         newDetalleOferta.setProducto(this);      
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
            oldDetalleOferta.setProducto((Producto)null);
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
            oldDetalleOferta.setProducto((Producto)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Estado getEstado() {
      return estado;
   }
   
   /** @pdGenerated default parent setter
     * @param newEstado */
   public void setEstado(Estado newEstado) {
      if (this.estado == null || !this.estado.equals(newEstado))
      {
         if (this.estado != null)
         {
            Estado oldEstado = this.estado;
            this.estado = null;
            oldEstado.removeProducto(this);
         }
         if (newEstado != null)
         {
            this.estado = newEstado;
            this.estado.addProducto(this);
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
            oldLocal.removeProducto(this);
         }
         if (newLocal != null)
         {
            this.local = newLocal;
            this.local.addProducto(this);
         }
      }
   }

}