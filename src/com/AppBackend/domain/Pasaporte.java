package com.AppBackend.domain;

import java.io.Serializable;
import java.util.Date;

public class Pasaporte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3909055847503191432L;

	private int idPasaporte;

	private int codigoPasaporte;

	private String pais;

	private String autoridadEmision;

	private Date fechaEmision;

	private Date fechaVencimiento;

	public Pasaporte(int idPasaporte, int codigoPasaporte, String pais, String autoridadEmision, Date fechaEmision,
			Date fechaVencimiento) {
		super();
		this.idPasaporte = idPasaporte;
		this.codigoPasaporte = codigoPasaporte;
		this.pais = pais;
		this.autoridadEmision = autoridadEmision;
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	public Pasaporte() {
		super();
	}
	public int getIdPasaporte() {
		return this.idPasaporte;
	}

	public void setIdPasaporte(int value) {
		this.idPasaporte = value;
	}

	public int getCodigoPasaporte() {
		return this.codigoPasaporte;
	}

	public void setCodigoPasaporte(int value) {
		this.codigoPasaporte = value;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String value) {
		this.pais = value;
	}

	public String getAutoridadEmision() {
		return this.autoridadEmision;
	}

	public void setAutoridadEmision(String value) {
		this.autoridadEmision = value;
	}

	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date value) {
		this.fechaEmision = value;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date value) {
		this.fechaVencimiento = value;
	}

}
