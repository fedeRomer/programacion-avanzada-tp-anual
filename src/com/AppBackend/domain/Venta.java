package com.AppBackend.domain;

import java.io.Serializable;
import java.util.Date;

public class Venta implements Serializable {

	private static final long serialVersionUID = 1587009634072513422L;
	int idVenta;
	Object cliente = new Cliente();

	Object vuelo = new Vuelo();

	Object aerolinea = new Aerolinea();

	Date fechaDeVenta;

	String metodoDePago;

	public Venta(int idVenta, Object cliente, Object vuelo, Object aerolinea, Date fechaDeVenta, String metodoDePago) {
		super();
		this.idVenta = idVenta;
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.aerolinea = aerolinea;
		this.fechaDeVenta = fechaDeVenta;
		this.metodoDePago = metodoDePago;
	}
	
	public Venta() {
		super();
	}

	public Object getCliente() {
		return this.cliente;
	}

	public void setCliente(Object value) {
		this.cliente = value;
	}

	public Object getVuelo() {
		return this.vuelo;
	}

	public void setVuelo(Object value) {
		this.vuelo = value;
	}

	public Object getAerolinea() {
		return this.aerolinea;
	}

	public void setAerolinea(Object value) {
		this.aerolinea = value;
	}

	public Date getFechaDeVenta() {
		return this.fechaDeVenta;
	}

	public void setFechaDeVenta(Date value) {
		this.fechaDeVenta = value;
	}

	public String getMetodoDePago() {
		return this.metodoDePago;
	}

	public void setMetodoDePago(String value) {
		this.metodoDePago = value;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", cliente=" + cliente + ", vuelo=" + vuelo + ", aerolinea=" + aerolinea
				+ ", fechaDeVenta=" + fechaDeVenta + ", metodoDePago=" + metodoDePago + "]";
	}
	
	
}
