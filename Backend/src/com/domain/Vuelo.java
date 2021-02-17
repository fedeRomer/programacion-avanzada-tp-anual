package com.domain;

import java.io.Serializable;
import java.util.Date;

public class Vuelo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 229504749680671403L;

	private String id;
	private String nroVuelo;

	private int cantidadDeAsientos;
	private int vendidos;
	private int tiempoHoras;

	private LineaAerea lineaAerea;

	private Aeropuerto aeropuertoDeSalida;
	private Aeropuerto aeropuertoDeLlegada;

	private Date horaSalida;
	private Date horaLlegada;

	public Vuelo(String id, String nroVuelo, int cantidadDeAsientos, int vendidos, int tiempoHoras,
			LineaAerea lineaAerea, Aeropuerto aeropuertoDeSalida, Aeropuerto aeropuertoDeLlegada, Date horaSalida,
			Date horaLlegada) {
		super();
		this.id = id;
		this.nroVuelo = nroVuelo;
		this.cantidadDeAsientos = cantidadDeAsientos;
		this.vendidos = vendidos;
		this.tiempoHoras = tiempoHoras;
		this.lineaAerea = lineaAerea;
		this.aeropuertoDeSalida = aeropuertoDeSalida;
		this.aeropuertoDeLlegada = aeropuertoDeLlegada;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}

	public Vuelo() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNroVuelo() {
		return nroVuelo;
	}

	public void setNroVuelo(String nroVuelo) {
		this.nroVuelo = nroVuelo;
	}

	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	public int getVendidos() {
		return vendidos;
	}

	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}

	public int getTiempoHoras() {
		return tiempoHoras;
	}

	public void setTiempoHoras(int tiempoHoras) {
		this.tiempoHoras = tiempoHoras;
	}

	public LineaAerea getLineaAerea() {
		return lineaAerea;
	}

	public void setLineaAerea(LineaAerea lineaAerea) {
		this.lineaAerea = lineaAerea;
	}

	public Aeropuerto getAeropuertoDeSalida() {
		return aeropuertoDeSalida;
	}

	public void setAeropuertoDeSalida(Aeropuerto aeropuertoDeSalida) {
		this.aeropuertoDeSalida = aeropuertoDeSalida;
	}

	public Aeropuerto getAeropuertoDeLlegada() {
		return aeropuertoDeLlegada;
	}

	public void setAeropuertoDeLlegada(Aeropuerto aeropuertoDeLlegada) {
		this.aeropuertoDeLlegada = aeropuertoDeLlegada;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
