package com.AppBackend.domain;

import java.io.Serializable;

public class Pais implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3469414203813841773L;

	private String nombre;

	private String provincia;

	public Pais(String nombre, String provincia) {
		super();
		this.nombre = nombre;
		this.provincia = provincia;
	}
	
	public Pais() {
		super();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String value) {
		this.nombre = value;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String value) {
		this.provincia = value;
	}

	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", provincia=" + provincia + "]";
	}
	
	
}
