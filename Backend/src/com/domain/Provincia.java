package com.domain;

import java.io.Serializable;

public class Provincia implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6439391805327850284L;
	private int id;
	private String nombre;
	
	
	public Provincia(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	public Provincia() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
