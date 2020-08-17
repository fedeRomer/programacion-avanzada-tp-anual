package com.AppBackend.domain;

import java.io.Serializable;

public class Telefono implements Serializable{

	private static final long serialVersionUID = 5551214220263138873L;

	String laboral;

	String personal;

	String celular;

	public Telefono(String laboral, String personal, String celular) {
		super();
		this.laboral = laboral;
		this.personal = personal;
		this.celular = celular;
	}
	
	public Telefono() {
		super();
	}

	public String getLaboral() {
		return this.laboral;
	}

	public void setLaboral(String value) {
		this.laboral = value;
	}

	public String getPersonal() {
		return this.personal;
	}

	public void setPersonal(String value) {
		this.personal = value;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String value) {
		this.celular = value;
	}

	@Override
	public String toString() {
		return "Telefono [laboral=" + laboral + ", personal=" + personal + ", celular=" + celular + "]";
	}
	
	
}
