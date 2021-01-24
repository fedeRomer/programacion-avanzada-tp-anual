package com.domain;


import java.io.Serializable;

public class Direccion implements Serializable {

	private static final long serialVersionUID = -2802958673228442283L;

	private String calle;

	private String altura;

	private Object provincia;

	private String ciudad;

	private String pais;

	private String codigoPostal;

	public Direccion(String calle, String altura, Object provincia, String ciudad, String pais, String codigoPostal) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
	}

	public Direccion() {
		super();
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String value) {
		this.calle = value;
	}

	public String getAltura() {
		return this.altura;
	}

	public void setAltura(String value) {
		this.altura = value;
	}

	public Object getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Object value) {
		this.provincia = value;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String value) {
		this.ciudad = value;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String value) {
		this.pais = value;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String value) {
		this.codigoPostal = value;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", provincia=" + provincia + ", ciudad=" + ciudad
				+ ", pais=" + pais + ", codigoPostal=" + codigoPostal + "]";
	}


}
