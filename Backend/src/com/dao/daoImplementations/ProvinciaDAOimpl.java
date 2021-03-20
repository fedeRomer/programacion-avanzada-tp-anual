package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.ProvinciaDAO;
import com.domain.Provincia;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;

public class ProvinciaDAOimpl implements ProvinciaDAO{
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public void addProvincia(Provincia Provincia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Provincia updateProvincia(Provincia Provincia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProvincia(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Provincia> findAllProvincia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provincia getProvincia(int id) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

}
