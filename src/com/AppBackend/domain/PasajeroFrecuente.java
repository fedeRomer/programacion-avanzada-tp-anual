package com.AppBackend.domain;

import java.io.Serializable;

public class PasajeroFrecuente implements Serializable{

	private static final long serialVersionUID = 8579929575020220362L;

	int idPasajeroFrecuente;

	int numeroPasajero;

	String categoria;

	String alianza;

	String aerolinea;
	

	public PasajeroFrecuente(int idPasajeroFrecuente, int numeroPasajero, String categoria, String alianza,
			String aerolinea) {
		super();
		this.idPasajeroFrecuente = idPasajeroFrecuente;
		this.numeroPasajero = numeroPasajero;
		this.categoria = categoria;
		this.alianza = alianza;
		this.aerolinea = aerolinea;
	}
	
	public PasajeroFrecuente() {
		super();
	}

	public int getIdPasajeroFrecuente() {
		return this.idPasajeroFrecuente;
	}

	public void setIdPasajeroFrecuente(int value) {
		this.idPasajeroFrecuente = value;
	}

	public int getNumeroPasajero() {
		return this.numeroPasajero;
	}

	public void setNumeroPasajero(int value) {
		this.numeroPasajero = value;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String value) {
		this.categoria = value;
	}

	public String getAlianza() {
		return this.alianza;
	}

	public void setAlianza(String value) {
		this.alianza = value;
	}

	public String getAerolinea() {
		return this.aerolinea;
	}

	public void setAerolinea(String value) {
		this.aerolinea = value;
	}

	@Override
	public String toString() {
		return "PasajeroFrecuente [idPasajeroFrecuente=" + idPasajeroFrecuente + ", numeroPasajero=" + numeroPasajero
				+ ", categoria=" + categoria + ", alianza=" + alianza + ", aerolinea=" + aerolinea + "]";
	}
	
	


}
