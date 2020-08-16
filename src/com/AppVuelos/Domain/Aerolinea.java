/**
 * Generated on Sat May 30 21:27:36 UTC 2020 by ObjGen 3.0
 */
package com.tpFinal;

/**
 *
 */
public class Aerolinea {

   /** Property Nombre */
   String Nombre;

   /** Property Vuelos */
   Objecto Vuelos = new Vuelos();

   /**
    * Gets the Nombre
    */
   public String getNombre() {
      return this.Nombre;
   }

   /**
    * Sets the Nombre
    */
   public void setNombre(String value) {
      this.Nombre = value;
   }

   /**
    * Gets the Vuelos
    */
   public Objecto getVuelos() {
      return this.Vuelos;
   }

   /**
    * Sets the Vuelos
    */
   public void setVuelos(Objecto value) {
      this.Vuelos = value;
   }
}
