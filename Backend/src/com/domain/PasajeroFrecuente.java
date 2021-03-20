package com.domain;

import java.io.Serializable;

public class PasajeroFrecuente implements Serializable{

	private static final long serialVersionUID = 8579929575020220362L;

	private int idPasajeroFrecuente;

	private int numeroPasajero;

	private LineaAerea lineaAerea;

	private Alianza alianza;

	private String aerolinea;

	public PasajeroFrecuente(int idPasajeroFrecuente, int numeroPasajero, LineaAerea lineaAerea, Alianza alianza,
			String aerolinea) {
		super();
		this.idPasajeroFrecuente = idPasajeroFrecuente;
		this.numeroPasajero = numeroPasajero;
		this.lineaAerea = lineaAerea;
		this.alianza = alianza;
		this.aerolinea = aerolinea;
	}

	public PasajeroFrecuente() {
	}

	public int getIdPasajeroFrecuente() {
		return idPasajeroFrecuente;
	}

	public void setIdPasajeroFrecuente(int idPasajeroFrecuente) {
		this.idPasajeroFrecuente = idPasajeroFrecuente;
	}

	public int getNumeroPasajero() {
		return numeroPasajero;
	}

	public void setNumeroPasajero(int numeroPasajero) {
		this.numeroPasajero = numeroPasajero;
	}

	public LineaAerea getLineaAerea() {
		return lineaAerea;
	}

	public void setLineaAerea(LineaAerea lineaAerea) {
		this.lineaAerea = lineaAerea;
	}

	public Alianza getAlianza() {
		return alianza;
	}

	public void setAlianza(Alianza alianza) {
		this.alianza = alianza;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

	


}
