package com.AppBackend.domain;

import java.io.Serializable;
import java.util.Date;

public class Vuelo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 229504749680671403L;
	private int idVuelo;
	private int idCliente;
	private int idAerolinea;
	private Date fechaVenta;
	private String formaDePago;

	public Vuelo(int idVuelo, int idCliente, int idAerolinea, Date fechaVenta, String formaDePago) {
		super();
		this.idVuelo = idVuelo;
		this.idCliente = idCliente;
		this.idAerolinea = idAerolinea;
		this.fechaVenta = fechaVenta;
		this.formaDePago = formaDePago;
	}
	
	public Vuelo() {
		super();
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", idCliente=" + idCliente + ", idAerolinea=" + idAerolinea
				+ ", fechaVenta=" + fechaVenta + ", formaDePago=" + formaDePago + "]";
	}
	
	

}
