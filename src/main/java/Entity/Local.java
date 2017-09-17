package Entity;

/***********************************************************************
 * Module:  Local.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Local
 ***********************************************************************/

import Entity.Oferta;
import java.util.*;

/** @pdOid 14555061-aace-4f64-bfbe-7b33cea14c60 */
public class Local {
   /** @pdOid 6849d025-f270-4314-a453-336f5946a1c9 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid ed5e9f67-91ee-4f04-8daa-d5d56622e5de */
   public long idLocal;
   /** @pdOid ed547875-9351-4dd4-84d1-28073634d979 */
   public int numeroLocal;
   /** @pdOid e85cb6a9-dee9-4aea-b191-425ce04bb369 */
   public java.lang.String direccion;
   /** @pdOid fa0739c0-96b8-4c6d-acd8-586e43fc265f */
   public java.util.Date fechaRegistro;
   /** @pdOid f1b9be09-8058-4ac5-a150-4053e4ed4134 */
   public java.util.Date fechaEliminacion;
   
   /** @pdRoleInfo migr=no name=Trabajador assc=reference25 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Trabajador> trabajador;
   /** @pdRoleInfo migr=no name=Oferta assc=reference30 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Oferta> oferta;
   /** @pdRoleInfo migr=no name=Producto assc=reference31 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Producto> producto;
   /** @pdRoleInfo migr=no name=Empresa assc=reference5 mult=1..1 side=A */
   public Empresa empresa;
   
   /** @pdOid 09f5b342-5830-4b83-ba02-c635f8f9b921 */
   public long getIdLocal() {
      return idLocal;
   }
   
   /** @param newIdLocal
    * @pdOid f108f734-d87f-4c58-9ca3-b44da05b5a13 */
   public void setIdLocal(long newIdLocal) {
      idLocal = newIdLocal;
   }
   
   /** @pdOid 6b64a8dc-2582-4855-a278-5255e9c63fa6 */
   public int getNumeroLocal() {
      return numeroLocal;
   }
   
   /** @param newNumeroLocal
    * @pdOid 5ecbee0b-607f-4911-807b-8d50bb7e9a0f */
   public void setNumeroLocal(int newNumeroLocal) {
      numeroLocal = newNumeroLocal;
   }
   
   /** @pdOid d40442bb-7eca-41ea-a01a-3862104d2ad0 */
   public java.lang.String getDireccion() {
      return direccion;
   }
   
   /** @param newDireccion
    * @pdOid d7b1f1c7-5d2f-4268-9624-18f33a5c8550 */
   public void setDireccion(java.lang.String newDireccion) {
      direccion = newDireccion;
   }
   
   /** @pdOid 22942085-3568-4ea4-823b-68910c5afc47 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 11c79c57-c37d-4118-9f10-1b76232dc7ef */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 90c763d7-02e6-436b-89df-60966d517b40 */
   public java.util.Date getFechaEliminacion() {
      return fechaEliminacion;
   }
   
   /** @param newFechaEliminacion
    * @pdOid 9ab95bfa-94f2-44a9-b64d-39af2c60c0c1 */
   public void setFechaEliminacion(java.util.Date newFechaEliminacion) {
      fechaEliminacion = newFechaEliminacion;
   }
   
   /** @pdOid 8e52861e-454c-4565-b65b-f1b027dcfa47 */
   public Local() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Trabajador> getTrabajador() {
      if (trabajador == null)
         trabajador = new java.util.HashSet<Trabajador>();
      return trabajador;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTrabajador() {
      if (trabajador == null)
         trabajador = new java.util.HashSet<Trabajador>();
      return trabajador.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTrabajador */
   public void setTrabajador(java.util.Collection<Trabajador> newTrabajador) {
      removeAllTrabajador();
      for (java.util.Iterator iter = newTrabajador.iterator(); iter.hasNext();)
         addTrabajador((Trabajador)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTrabajador */
   public void addTrabajador(Trabajador newTrabajador) {
      if (newTrabajador == null)
         return;
      if (this.trabajador == null)
         this.trabajador = new java.util.HashSet<Trabajador>();
      if (!this.trabajador.contains(newTrabajador))
      {
         this.trabajador.add(newTrabajador);
         newTrabajador.setLocal(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTrabajador */
   public void removeTrabajador(Trabajador oldTrabajador) {
      if (oldTrabajador == null)
         return;
      if (this.trabajador != null)
         if (this.trabajador.contains(oldTrabajador))
         {
            this.trabajador.remove(oldTrabajador);
            oldTrabajador.setLocal((Local)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTrabajador() {
      if (trabajador != null)
      {
         Trabajador oldTrabajador;
         for (java.util.Iterator iter = getIteratorTrabajador(); iter.hasNext();)
         {
            oldTrabajador = (Trabajador)iter.next();
            iter.remove();
            oldTrabajador.setLocal((Local)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Oferta> getOferta() {
      if (oferta == null)
         oferta = new java.util.HashSet<Oferta>();
      return oferta;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorOferta() {
      if (oferta == null)
         oferta = new java.util.HashSet<Oferta>();
      return oferta.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newOferta */
   public void setOferta(java.util.Collection<Oferta> newOferta) {
      removeAllOferta();
      for (java.util.Iterator iter = newOferta.iterator(); iter.hasNext();)
         addOferta((Oferta)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newOferta */
   public void addOferta(Oferta newOferta) {
      if (newOferta == null)
         return;
      if (this.oferta == null)
         this.oferta = new java.util.HashSet<Oferta>();
      if (!this.oferta.contains(newOferta))
      {
         this.oferta.add(newOferta);
         newOferta.setLocal(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldOferta */
   public void removeOferta(Oferta oldOferta) {
      if (oldOferta == null)
         return;
      if (this.oferta != null)
         if (this.oferta.contains(oldOferta))
         {
            this.oferta.remove(oldOferta);
            oldOferta.setLocal((Local)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllOferta() {
      if (oferta != null)
      {
         Oferta oldOferta;
         for (java.util.Iterator iter = getIteratorOferta(); iter.hasNext();)
         {
            oldOferta = (Oferta)iter.next();
            iter.remove();
            oldOferta.setLocal((Local)null);
         }
      }
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
         newProducto.setLocal(this);      
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
            oldProducto.setLocal((Local)null);
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
            oldProducto.setLocal((Local)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Empresa getEmpresa() {
      return empresa;
   }
   
   /** @pdGenerated default parent setter
     * @param newEmpresa */
   public void setEmpresa(Empresa newEmpresa) {
      if (this.empresa == null || !this.empresa.equals(newEmpresa))
      {
         if (this.empresa != null)
         {
            Empresa oldEmpresa = this.empresa;
            this.empresa = null;
            oldEmpresa.removeLocal(this);
         }
         if (newEmpresa != null)
         {
            this.empresa = newEmpresa;
            this.empresa.addLocal(this);
         }
      }
   }

}