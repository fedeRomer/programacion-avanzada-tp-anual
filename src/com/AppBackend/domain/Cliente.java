package com.AppBackend.domain;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1381326742965240694L;

	private int idCliente;

	private String nombreCompleto;

	private int dni;

	private String cuil;

	private Date fechaNacimiento;

	private String mail;

	private Object pasaporte = new Pasaporte();

	private Object telefono = new Telefono();

	private Object direccion = new Direccion();

	private Object pasajeroFrecuente = new PasajeroFrecuente();

	public Cliente(int idCliente, String nombreCompleto, int dni, String cuil, Date fechaNacimiento, String mail,
			Object pasaporte, Object telefono, Object direccion, Object pasajeroFrecuente) {
		super();
		this.idCliente = idCliente;
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
		this.cuil = cuil;
		this.fechaNacimiento = fechaNacimiento;
		this.mail = mail;
		this.pasaporte = pasaporte;
		this.telefono = telefono;
		this.direccion = direccion;
		this.pasajeroFrecuente = pasajeroFrecuente;
	}

	public Cliente() {
		super();

	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int value) {
		this.idCliente = value;
	}

	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String value) {
		this.nombreCompleto = value;
	}

	public int getDni() {
		return this.dni;
	}

	public void setDni(int value) {
		this.dni = value;
	}

	public String getCuil() {
		return this.cuil;
	}

	public void setCuil(String value) {
		this.cuil = value;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date value) {
		this.fechaNacimiento = value;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String value) {
		this.mail = value;
	}

	public Object getPasaporte() {
		return this.pasaporte;
	}

	public void setPasaporte(Object value) {
		this.pasaporte = value;
	}

	public Object getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Object value) {
		this.telefono = value;
	}

	public Object getDireccion() {
		return this.direccion;
	}

	public void setDireccion(Object value) {
		this.direccion = value;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", cuil="
				+ cuil + ", fechaNacimiento=" + fechaNacimiento + ", mail=" + mail + ", pasaporte=" + pasaporte
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", pasajeroFrecuente=" + pasajeroFrecuente
				+ "]";
	}
	
	

}
