package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1381326742965240694L;

	private int idCliente;
	private String nombreCompleto;
	private int dni;
	private String cuilCuit;
	private Date fechaNacimiento;
	private String mail;
	private Pasaporte pasaporte;
	private Telefono telefono;
	private Direccion direccion;
	private PasajeroFrecuente pasajeroFrecuente;
	
	
	public Cliente() {}
	
	public Cliente(int idCliente, String nombreCompleto, int dni, String cuilCuit, Date fechaNacimiento, String mail,
			Pasaporte pasaporte, Telefono telefono, Direccion direccion, PasajeroFrecuente pasajeroFrecuente) {
		super();
		this.idCliente = idCliente;
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
		this.cuilCuit = cuilCuit;
		this.fechaNacimiento = fechaNacimiento;
		this.mail = mail;
		this.pasaporte = pasaporte;
		this.telefono = telefono;
		this.direccion = direccion;
		this.pasajeroFrecuente = pasajeroFrecuente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getCuilCuit() {
		return cuilCuit;
	}

	public void setCuilCuit(String cuilCuit) {
		this.cuilCuit = cuilCuit;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Pasaporte getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Pasaporte pasaporte) {
		this.pasaporte = pasaporte;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public PasajeroFrecuente getPasajeroFrecuente() {
		return pasajeroFrecuente;
	}

	public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
		this.pasajeroFrecuente = pasajeroFrecuente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
