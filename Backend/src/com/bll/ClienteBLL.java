package com.bll;

import java.util.Calendar;

import com.domain.Cliente;

public class ClienteBLL {

	public boolean verifyAge18(Cliente c) {

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = 0;
		age = currentYear - c.getFechaNacimiento().getYear();
		if (age >= 18) {
			return true;
		} else {
			return false;
		}

	}

}
