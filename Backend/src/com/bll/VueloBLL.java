package com.bll;

import java.util.List;

import com.domain.Venta;
import com.domain.Vuelo;

public class VueloBLL {

	/*
	 * metodo para verificar la existencia de asientos disponibles en el vuelo deseado
	 * devuelve true si existen lugares disponibles
	 * devuelve false si no existen mas lugares disponibles
	 */
	public Boolean asientosDisponibles(List<Venta> venta, Vuelo vuelo) {

		int index = matchVentaWithFlight(venta, vuelo);
		return freeSeatForMorePassengers(index, venta, vuelo);

	}

	public int matchVentaWithFlight(List<Venta> venta, Vuelo vuelo) {

		for (int i = 0; i < venta.size(); i++) {

			if (venta.get(i).getVuelo().getId().equalsIgnoreCase(vuelo.getId())) {
				return i;
			}
		}
		return (Integer) null;
	}

	public boolean freeSeatForMorePassengers(int index, List<Venta> venta, Vuelo vuelo) {

		if (venta.get(index).getVuelo().getVendidos() >= vuelo.getCantidadDeAsientos()) {
			return false;// no hay lugar
		} else {
			return true;// hay lugar
		}

	}

}
