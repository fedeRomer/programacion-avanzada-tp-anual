package com.domain;

import java.io.Serializable;

public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1040496108296825493L;

	private int id;
	private String username;
	private String password;
	private String tipoUser;
	
	
	public Usuario(int id, String username, String password, String tipoUser) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.tipoUser = tipoUser;
	}


	public Usuario() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTipoUser() {
		return tipoUser;
	}


	public void setTipoUser(String tipoUser) {
		this.tipoUser = tipoUser;
	}
	
	
	
	

}
