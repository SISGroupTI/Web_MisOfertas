package Entity;

/***********************************************************************
 * Module:  CertificadoRubro.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class CertificadoRubro
 ***********************************************************************/

import java.util.*;

/** @pdOid f21263bd-c477-4346-8385-a43bad135970 */
public class CertificadoRubro {
   /** @pdRoleInfo migr=no name=Certificado assc=reference32 mult=1..1 side=A */
   public Certificado certificado;
   /** @pdRoleInfo migr=no name=Rubro assc=reference33 mult=1..1 side=A */
   public Rubro rubro;
   
   
   /** @pdGenerated default parent getter */
   public Certificado getCertificado() {
      return certificado;
   }
   
   /** @pdGenerated default parent setter
     * @param newCertificado */
   public void setCertificado(Certificado newCertificado) {
      if (this.certificado == null || !this.certificado.equals(newCertificado))
      {
         if (this.certificado != null)
         {
            Certificado oldCertificado = this.certificado;
            this.certificado = null;
            oldCertificado.removeCertificadoRubro(this);
         }
         if (newCertificado != null)
         {
            this.certificado = newCertificado;
            this.certificado.addCertificadoRubro(this);
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
            oldRubro.removeCertificadoRubro(this);
         }
         if (newRubro != null)
         {
            this.rubro = newRubro;
            this.rubro.addCertificadoRubro(this);
         }
      }
   }

}