package com.domain;


import java.io.Serializable;

public class Direccion implements Serializable {

	private static final long serialVersionUID = -2802958673228442283L;

	private String calle;

	private String altura;

	private Provincia provincia;

	private String ciudad;

	private Pais pais;

	private String codigoPostal;

	public Direccion(String calle, String altura, Provincia provincia, String ciudad, Pais pais, String codigoPostal) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.pais = pais;
		this.codigoPostal = codigoPostal;
	}

	public Direccion() {}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	


}
