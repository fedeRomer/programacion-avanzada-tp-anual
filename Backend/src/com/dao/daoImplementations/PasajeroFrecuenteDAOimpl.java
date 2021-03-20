package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.PasajeroFrecuenteDAO;
import com.domain.PasajeroFrecuente;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;

public class PasajeroFrecuenteDAOimpl implements PasajeroFrecuenteDAO{
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public void addPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PasajeroFrecuente updatePasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePasajeroFrecuente(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PasajeroFrecuente> findAllPasajeroFrecuente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PasajeroFrecuente getPasajeroFrecuente(int id) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

}
