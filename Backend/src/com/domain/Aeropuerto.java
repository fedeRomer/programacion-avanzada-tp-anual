package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Aeropuerto implements Serializable {

	private static final long serialVersionUID = 4489416593723971011L;

	private String identificacion;

	private String ciudad;

	private Provincia provincia;

	private Pais pais;

	public Aeropuerto(String identificacion, String ciudad, Provincia provincia, Pais pais) {
		super();
		this.identificacion = identificacion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
	}

	public Aeropuerto() {
	}

	
	
}
