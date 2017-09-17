package Entity;

/***********************************************************************
 * Module:  Rubro.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Rubro
 ***********************************************************************/

import Entity.Oferta;
import java.util.*;

/** @pdOid 8ba84213-d8c7-4598-a1ec-7997f3b20714 */
public class Rubro {
   /** @pdOid 41416d9f-7a7e-41c9-bb0b-e8a9dafcedeb */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid e888d02f-46f9-41cf-9f59-a6b6e92678d1 */
   public long idRubro;
   /** @pdOid aa48700d-1b42-4eb8-acad-0d3699b1eaf9 */
   public java.lang.String descripcionRubro;
   
   /** @pdRoleInfo migr=no name=Track assc=reference22 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Track> track;
   /** @pdRoleInfo migr=no name=Oferta assc=reference23 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Oferta> oferta;
   /** @pdRoleInfo migr=no name=CertificadoRubro assc=reference33 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<CertificadoRubro> certificadoRubro;
   
   /** @pdOid cd19f565-09b3-412c-b230-257c5eb8434c */
   public long getIdRubro() {
      return idRubro;
   }
   
   /** @param newIdRubro
    * @pdOid c8bb12c7-573a-47f3-a3d4-f5426697263d */
   public void setIdRubro(long newIdRubro) {
      idRubro = newIdRubro;
   }
   
   /** @pdOid 0439e97b-2bb4-4cd6-ad0a-f56a2553920e */
   public java.lang.String getDescripcionRubro() {
      return descripcionRubro;
   }
   
   /** @param newDescripcionRubro
    * @pdOid 5eed2bf3-ef05-4d7c-8712-745aa69fdda9 */
   public void setDescripcionRubro(java.lang.String newDescripcionRubro) {
      descripcionRubro = newDescripcionRubro;
   }
   
   /** @pdOid 63c9b5d5-e1ef-44ae-a90b-e715f179bd47 */
   public Rubro() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Track> getTrack() {
      if (track == null)
         track = new java.util.HashSet<Track>();
      return track;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTrack() {
      if (track == null)
         track = new java.util.HashSet<Track>();
      return track.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTrack */
   public void setTrack(java.util.Collection<Track> newTrack) {
      removeAllTrack();
      for (java.util.Iterator iter = newTrack.iterator(); iter.hasNext();)
         addTrack((Track)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTrack */
   public void addTrack(Track newTrack) {
      if (newTrack == null)
         return;
      if (this.track == null)
         this.track = new java.util.HashSet<Track>();
      if (!this.track.contains(newTrack))
      {
         this.track.add(newTrack);
         newTrack.setRubro(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldTrack */
   public void removeTrack(Track oldTrack) {
      if (oldTrack == null)
         return;
      if (this.track != null)
         if (this.track.contains(oldTrack))
         {
            this.track.remove(oldTrack);
            oldTrack.setRubro((Rubro)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTrack() {
      if (track != null)
      {
         Track oldTrack;
         for (java.util.Iterator iter = getIteratorTrack(); iter.hasNext();)
         {
            oldTrack = (Track)iter.next();
            iter.remove();
            oldTrack.setRubro((Rubro)null);
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
         newOferta.setRubro(this);      
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
            oldOferta.setRubro((Rubro)null);
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
            oldOferta.setRubro((Rubro)null);
         }
      }
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
         newCertificadoRubro.setRubro(this);      
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
            oldCertificadoRubro.setRubro((Rubro)null);
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
            oldCertificadoRubro.setRubro((Rubro)null);
         }
      }
   }

}