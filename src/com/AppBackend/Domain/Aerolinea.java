/**
 * Generated on Sat May 30 21:27:36 UTC 2020 by ObjGen 3.0
 */
package com.AppBackend.Domain;

import java.util.Objects;

/**
 *
 */
public class Aerolinea {

   /** Property Nombre */
   String Nombre;

   /** Property Vuelos */
   Object Vuelos = new Object();

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
   public Object getVuelos() {
      return this.Vuelos;
   }

   /**
    * Sets the Vuelos
    */
   public void setVuelos(Object value) {
      this.Vuelos = (Object) value;
   }
}
