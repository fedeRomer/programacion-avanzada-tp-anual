/**
 * Generated on Sat May 30 20:36:27 UTC 2020 by ObjGen 3.0
 */
package com.AppBackend.Domain;

import java.util.Date;

/**
 *
 */
public class Pasaporte {
 
   /** Property idPasaporte */
   int idPasaporte;

   /** Property codigoPasaporte */
   int codigoPasaporte;

   /** Property Pais */
   String Pais;

   /** Property autoridadEmision */
   String autoridadEmision;

   /** Property fechaEmision */
   Date fechaEmision;

   /** Property fechaVencimiento */
   Date fechaVencimiento;

   /**
    * Gets the idPasaporte
    */
   public int getIdPasaporte() {
      return this.idPasaporte;
   }

   /**
    * Sets the idPasaporte
    */
   public void setIdPasaporte(int value) {
      this.idPasaporte = value;
   }

   /**
    * Gets the codigoPasaporte
    */
   public int getCodigoPasaporte() {
      return this.codigoPasaporte;
   }

   /**
    * Sets the codigoPasaporte
    */
   public void setCodigoPasaporte(int value) {
      this.codigoPasaporte = value;
   }

   /**
    * Gets the Pais
    */
   public String getPais() {
      return this.Pais;
   }

   /**
    * Sets the Pais
    */
   public void setPais(String value) {
      this.Pais = value;
   }

   /**
    * Gets the autoridadEmision
    */
   public String getAutoridadEmision() {
      return this.autoridadEmision;
   }

   /**
    * Sets the autoridadEmision
    */
   public void setAutoridadEmision(String value) {
      this.autoridadEmision = value;
   }

   /**
    * Gets the fechaEmision
    */
   public Date getFechaEmision() {
      return this.fechaEmision;
   }

   /**
    * Sets the fechaEmision
    */
   public void setFechaEmision(Date value) {
      this.fechaEmision = value;
   }

   /**
    * Gets the fechaVencimiento
    */
   public Date getFechaVencimiento() {
      return this.fechaVencimiento;
   }

   /**
    * Sets the fechaVencimiento
    */
   public void setFechaVencimiento(Date value) {
      this.fechaVencimiento = value;
   }
}
