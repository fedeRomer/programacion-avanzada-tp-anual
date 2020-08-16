/**
 * Generated on Sat May 30 20:45:04 UTC 2020 by ObjGen 3.0
 */
package com.AppBackend.Domain;

/**
 *
 */
public class Cliente {

   /** Property idCliente */
   int idCliente;

   /** Property nombreCompleto */
   String nombreCompleto;

   /** Property dni */
   int dni;

   /** Property cuil */
   String cuil;

   /** Property fechaNacimiento */
   Date fechaNacimiento;

   /** Property mail */
   String mail;

   /** Property pasaporte */
   Object pasaporte = new Pasaporte();

   /** Property telefono */
   Object telefono = new Telefono();

   /** Property direccion */
   Object direccion = new Direccion();

   /** Property pasajeroFrecuente */
   Object pasajeroFrecuente = new PasajeroFrecuente();

   /**
    * Gets the idCliente
    */
   public int getIdCliente() {
      return this.idCliente;
   }

   /**
    * Sets the idCliente
    */
   public void setIdCliente(int value) {
      this.idCliente = value;
   }

   /**
    * Gets the nombreCompleto
    */
   public String getNombreCompleto() {
      return this.nombreCompleto;
   }

   /**
    * Sets the nombreCompleto
    */
   public void setNombreCompleto(String value) {
      this.nombreCompleto = value;
   }

   /**
    * Gets the dni
    */
   public int getDni() {
      return this.dni;
   }

   /**
    * Sets the dni
    */
   public void setDni(int value) {
      this.dni = value;
   }

   /**
    * Gets the cuil
    */
   public String getCuil() {
      return this.cuil;
   }

   /**
    * Sets the cuil
    */
   public void setCuil(String value) {
      this.cuil = value;
   }

   /**
    * Gets the fechaNacimiento
    */
   public Date getFechaNacimiento() {
      return this.fechaNacimiento;
   }

   /**
    * Sets the fechaNacimiento
    */
   public void setFechaNacimiento(Date value) {
      this.fechaNacimiento = value;
   }

   /**
    * Gets the mail
    */
   public String getMail() {
      return this.mail;
   }

   /**
    * Sets the mail
    */
   public void setMail(String value) {
      this.mail = value;
   }

   /**
    * Gets the pasaporte
    */
   public Object getPasaporte() {
      return this.pasaporte;
   }

   /**
    * Sets the pasaporte
    */
   public void setPasaporte(Object value) {
      this.pasaporte = value;
   }

   /**
    * Gets the telefono
    */
   public Object getTelefono() {
      return this.telefono;
   }

   /**
    * Sets the telefono
    */
   public void setTelefono(Object value) {
      this.telefono = value;
   }

   /**
    * Gets the direccion
    */
   public Object getDireccion() {
      return this.direccion;
   }

   /**
    * Sets the direccion
    */
   public void setDireccion(Object value) {
      this.direccion = value;
   }

   /**
    * Gets the pasajeroFrecuente
    */

}
