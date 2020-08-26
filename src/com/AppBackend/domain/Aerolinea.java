package com.AppBackend.domain;

import java.io.Serializable;

public class Aerolinea implements Serializable{

	private static final long serialVersionUID = -4066101569874565022L;


	private String nombre;

	private Object vuelos = new Object();
	
	private Alianza alianza;

	public Aerolinea(String nombre, Object vuelos,Alianza alianza) {
		super();
		this.nombre = nombre;
		this.vuelos = vuelos;
		this.alianza = alianza;
	}

	public Aerolinea() {
		super();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String value) {
		this.nombre = value;
	}

	public Object getVuelos() {
		return this.vuelos;
	}

	public void setVuelos(Object value) {
		this.vuelos = (Object) value;
	}


	public Alianza getAlianza() {
		return alianza;
	}

	public void setAlianza(Alianza alianza) {
		this.alianza = alianza;
	}

	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + ", vuelos=" + vuelos + ", alianza=" + alianza + "]";
	}
	
	
}
