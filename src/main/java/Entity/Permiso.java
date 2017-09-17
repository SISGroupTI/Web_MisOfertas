package Entity;

/***********************************************************************
 * Module:  Permiso.java
 * Author:  Ian Cardenas
 * Purpose: Defines the Class Permiso
 ***********************************************************************/

import java.util.*;

/** @pdOid 6b674d4f-c74f-484e-82cc-7dcc79063142 */
public class Permiso {
   /** @pdOid c5a87853-6c0f-4ddd-b5f0-972f26585455 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdOid e31ba23e-8590-4aa6-b52f-b6d0a5225959 */
   public long idPermiso;
   
   /** @pdRoleInfo migr=no name=Perfil assc=reference19 mult=1..1 side=A */
   public Perfil perfil;
   /** @pdRoleInfo migr=no name=Modulo assc=reference20 mult=1..1 side=A */
   public Modulo modulo;
   
   /** @pdOid eb4fa969-2861-4d76-a12b-c7ad13243540 */
   public long getIdPermiso() {
      return idPermiso;
   }
   
   /** @param newIdPermiso
    * @pdOid 8bdd101b-9fd1-47b2-9bcf-bf50c36913e3 */
   public void setIdPermiso(long newIdPermiso) {
      idPermiso = newIdPermiso;
   }
   
   /** @pdOid fd524bf8-1f7c-4c9f-a39c-c500293a1804 */
   public Permiso() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default parent getter */
   public Perfil getPerfil() {
      return perfil;
   }
   
   /** @pdGenerated default parent setter
     * @param newPerfil */
   public void setPerfil(Perfil newPerfil) {
      if (this.perfil == null || !this.perfil.equals(newPerfil))
      {
         if (this.perfil != null)
         {
            Perfil oldPerfil = this.perfil;
            this.perfil = null;
            oldPerfil.removePermiso(this);
         }
         if (newPerfil != null)
         {
            this.perfil = newPerfil;
            this.perfil.addPermiso(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Modulo getModulo() {
      return modulo;
   }
   
   /** @pdGenerated default parent setter
     * @param newModulo */
   public void setModulo(Modulo newModulo) {
      if (this.modulo == null || !this.modulo.equals(newModulo))
      {
         if (this.modulo != null)
         {
            Modulo oldModulo = this.modulo;
            this.modulo = null;
            oldModulo.removePermiso(this);
         }
         if (newModulo != null)
         {
            this.modulo = newModulo;
            this.modulo.addPermiso(this);
         }
      }
   }

}