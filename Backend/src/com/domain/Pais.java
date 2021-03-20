package com.domain;

import java.io.Serializable;

public class Pais implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3469414203813841773L;

	private String nombre;

	private int id;

	public Pais(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	public Pais() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
