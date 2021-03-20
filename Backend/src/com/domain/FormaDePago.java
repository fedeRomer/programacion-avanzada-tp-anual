package com.domain;

public enum FormaDePago {

	CONTADO_EFECTIVO("Contado efectivo"), TARJETA_DEBITO("Tarjeta de Debito"), TARJETA_CREDITO("Tarjeta de Credito");

	private final String value;
	private String detalle;

	private FormaDePago(String value) {
		this.value = value;
	}

	public static FormaDePago get(String nombre) {
		if (nombre.equals("Contado efectivo")) {
			return CONTADO_EFECTIVO;
		}
		if (nombre.equals("Tarjeta de Debito")) {
			return TARJETA_DEBITO;
		}
		if (nombre.equals("Tarjeta de Credito")) {
			return TARJETA_CREDITO;
		}
		return null;
	}

	public String getValue() {
		return value;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
