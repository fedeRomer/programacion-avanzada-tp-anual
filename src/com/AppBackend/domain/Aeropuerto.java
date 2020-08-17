package com.AppBackend.domain;

import java.io.Serializable;
import java.util.Date;

public class Aeropuerto implements Serializable {

	private static final long serialVersionUID = 4489416593723971011L;

	String identificacion;

	String ciudad;

	String provincia;

	String pais;

	Date horaSalida;

	Date horaLlegada;
	
	

	public Aeropuerto(String identificacion, String ciudad, String provincia, String pais, Date horaSalida,
			Date horaLlegada) {
		super();
		this.identificacion = identificacion;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.pais = pais;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}
	
	public Aeropuerto() {
		super();
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String value) {
		this.identificacion = value;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String value) {
		this.ciudad = value;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String value) {
		this.provincia = value;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String value) {
		this.pais = value;
	}

	public Date getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(Date value) {
		this.horaSalida = value;
	}

	public Date getHoraLlegada() {
		return this.horaLlegada;
	}

	public void setHoraLlegada(Date value) {
		this.horaLlegada = value;
	}

	@Override
	public String toString() {
		return "Aeropuerto [identificacion=" + identificacion + ", ciudad=" + ciudad + ", provincia=" + provincia
				+ ", pais=" + pais + ", horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + "]";
	}
	
}
