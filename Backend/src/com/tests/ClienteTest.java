package com.tests;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.domain.Cliente;

public class ClienteTest {

	@Test
	public void test() {
		Cliente cliente = new Cliente();
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int age =0;
		
		Date date = new Date();
		
		date.setYear(1991);
		
		cliente.setFechaNacimiento(date);
		
		age = currentYear - cliente.getFechaNacimiento().getYear();
		
		if(age>=18) {
			assertTrue("mayor de 18", true);
		}else {
			assertFalse("menor de 18", true);
		}
		
	}

}
