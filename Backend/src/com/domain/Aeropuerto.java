package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Aeropuerto implements Serializable {

	private static final long serialVersionUID = 4489416593723971011L;
	
	private int id;

	private String identificacion;

	private String ciudad;

	private Provincia provincia;

	private Pais pais;

	public Aeropuerto(int id, String identificacion, String ciudad, Provincia provincia, Pais pais) {
		super();
		this.id = id;
		this.identificacion = identificacion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public Aeropuerto() {
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
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
