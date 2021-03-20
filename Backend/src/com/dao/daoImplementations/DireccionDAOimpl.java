package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.DireccionDAO;
import com.domain.Direccion;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;

public class DireccionDAOimpl implements DireccionDAO{
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public void addDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Direccion updateDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDireccion(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Direccion> findAllDireccion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Direccion getDireccion(int id) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

}
