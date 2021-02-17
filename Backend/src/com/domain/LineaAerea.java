package com.domain;

import java.io.Serializable;
import java.util.ArrayList;

public class LineaAerea implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String aerolinea;
	private String iniciales;
	private Alianza alianza;
	private ArrayList<Vuelo> arrVuelos;

	public LineaAerea(int id, String aerolinea, String iniciales, Alianza alianza, ArrayList<Vuelo> arrVuelos) {
		super();
		this.id = id;
		this.aerolinea = aerolinea;
		this.iniciales = iniciales;
		this.alianza = alianza;
		this.arrVuelos = arrVuelos;
	}

	public LineaAerea() {
	}

	public Vuelo searchFlight(String id) {
		Vuelo vuelo = null;

		for (int i = 0; i < arrVuelos.size(); i++) {
			if (arrVuelos.get(i).getId().equalsIgnoreCase(id)) {
				vuelo = arrVuelos.get(i);
				return vuelo;
			}
		}

		return null;

	}

	public Boolean releaseFlight(String id) throws Exception {
		Vuelo vuelo = searchFlight(id);

		if (vuelo != null) {
			arrVuelos.remove(vuelo);
			return true;
		} else {
			throw new Exception("Vuelo inexistente " + id);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getIniciales() {
		return iniciales;
	}

	public void setIniciales(String iniciales) {
		this.iniciales = iniciales;
	}

	public Alianza getAlianza() {
		return alianza;
	}

	public void setAlianza(Alianza alianza) {
		this.alianza = alianza;
	}

	public ArrayList<Vuelo> getArrVuelos() {
		return arrVuelos;
	}

	public void setArrVuelos(ArrayList<Vuelo> arrVuelos) {
		this.arrVuelos = arrVuelos;
	}

}
