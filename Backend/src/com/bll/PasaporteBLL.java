package com.bll;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.Date;

import com.domain.Pasaporte;
import com.domain.Vuelo;

public class PasaporteBLL {

	/*
	 * devuelve true si el pasaporte es valido
	 */
	public Boolean validatePassportExpiration(Pasaporte p, Vuelo v) {

		if (checkIfItsExpired(p).equals(false) && checkIfExpires6MonthsAfter(p, v).equals(true)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * devuelve true si el pasaporte esta vencido
	 */
	public Boolean checkIfItsExpired(Pasaporte p) {
		Date date = new Date();
		return p.getFechaVencimiento().before(date);
	}

	/*
	 * devuelve true si el periodo entre el vencimiento del pasaporte y de la
	 * finalizacion del vuelo es mayor o igual a 6 meses significando que el
	 * pasaporte esta en regla
	 */
	public Boolean checkIfExpires6MonthsAfter(Pasaporte p, Vuelo v) {

		LocalDate passportExpiration = p.getFechaVencimiento().toInstant().atOffset(ZoneOffset.UTC).toLocalDate();
		LocalDate flightEnd = v.getHoraLlegada().toInstant().atOffset(ZoneOffset.UTC).toLocalDate();

		if (Period.between(flightEnd, passportExpiration).getMonths() >= 6) {
			return true;
		} else {
			return false;
		}
	}

}
