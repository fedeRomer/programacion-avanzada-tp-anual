package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Venta implements Serializable {

	private static final long serialVersionUID = 1587009634072513422L;

	private int idVenta;

	private Cliente cliente;

	private Vuelo vuelo;

	private LineaAerea lineaAerea;

	private Date fechaDeVenta;

	private String metodoDePago;

	public Venta(int idVenta, Cliente cliente, Vuelo vuelo, LineaAerea lineaAerea, Date fechaDeVenta,
			String metodoDePago) {
		super();
		this.idVenta = idVenta;
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.lineaAerea = lineaAerea;
		this.fechaDeVenta = fechaDeVenta;
		this.metodoDePago = metodoDePago;
	}

	public Venta() {
	}

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public LineaAerea getLineaAerea() {
		return lineaAerea;
	}

	public void setLineaAerea(LineaAerea lineaAerea) {
		this.lineaAerea = lineaAerea;
	}

	public Date getFechaDeVenta() {
		return fechaDeVenta;
	}

	public void setFechaDeVenta(Date fechaDeVenta) {
		this.fechaDeVenta = fechaDeVenta;
	}

	public String getMetodoDePago() {
		return metodoDePago;
	}


	public void setMetodoDePagoEfectivo() {
		this.metodoDePago = "Efectivo";
	}
	
	public void setMetodoDePagoTarjetaDeb() {
		this.metodoDePago = "Tarjeta Debito";
	}
	
	public void setMetodoDePagoTarjetaCred() {
		this.metodoDePago = "Tarjeta Credito";
	}
}
