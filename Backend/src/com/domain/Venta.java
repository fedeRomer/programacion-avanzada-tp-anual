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

	private FormaDePago formaDePago;
	
	/**
	 * constructor para generar la venta
	 * 
	 * @param Cliente, Vuelo, Linea Aerea, Fecha de venta, Metodo de pago
	 */
	public Venta(Cliente cliente, Vuelo vuelo, LineaAerea lineaAerea, Date fechaDeVenta,
			FormaDePago formaDePago) {
		super();
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.lineaAerea = lineaAerea;
		this.fechaDeVenta = fechaDeVenta;
		this.formaDePago = formaDePago;
	}
	
	/**
	 * constructor para instanciar la venta despues de ser generada
	 * 
	 * @param id venta, Cliente, Vuelo, Linea Aerea, Fecha de venta, Metodo de pago
	 */
	public Venta(int idVenta, Cliente cliente, Vuelo vuelo, LineaAerea lineaAerea, Date fechaDeVenta,
			FormaDePago formaDePago) {
		super();
		this.idVenta = idVenta;
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.lineaAerea = lineaAerea;
		this.fechaDeVenta = fechaDeVenta;
		this.formaDePago = formaDePago;
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

	public FormaDePago getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = FormaDePago.get(formaDePago);	
	}

	
}
