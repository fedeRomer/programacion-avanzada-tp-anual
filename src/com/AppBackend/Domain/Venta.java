/**
 * Generated on Sat May 30 21:13:36 UTC 2020 by ObjGen 3.0
 */
package com.AppBackend.Domain;

import java.util.Date;

/**
 *
 */
public class Venta {

   /** Property cliente */
   Object cliente = new Cliente();

   /** Property vuelo */
   Object vuelo = new Vuelo();

   /** Property aerolinea */
   Object aerolinea = new Aerolinea();

   /** Property fechaDeVenta */
   Date fechaDeVenta;

   /** Property metodoDePago */
   String metodoDePago;

   /**
    * Gets the cliente
    */
   public Object getCliente() {
      return this.cliente;
   }

   /**
    * Sets the cliente
    */
   public void setCliente(Object value) {
      this.cliente = value;
   }

   /**
    * Gets the vuelo
    */
   public Object getVuelo() {
      return this.vuelo;
   }

   /**
    * Sets the vuelo
    */
   public void setVuelo(Object value) {
      this.vuelo = value;
   }

   /**
    * Gets the aerolinea
    */
   public Object getAerolinea() {
      return this.aerolinea;
   }

   /**
    * Sets the aerolinea
    */
   public void setAerolinea(Object value) {
      this.aerolinea = value;
   }

   /**
    * Gets the fechaDeVenta
    */
   public Date getFechaDeVenta() {
      return this.fechaDeVenta;
   }

   /**
    * Sets the fechaDeVenta
    */
   public void setFechaDeVenta(Date value) {
      this.fechaDeVenta = value;
   }

   /**
    * Gets the metodoDePago
    */
   public String getMetodoDePago() {
      return this.metodoDePago;
   }

   /**
    * Sets the metodoDePago
    */
   public void setMetodoDePago(String value) {
      this.metodoDePago = value;
   }
}
