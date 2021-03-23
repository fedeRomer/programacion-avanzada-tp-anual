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
	public Boolean addProvincia(Provincia Provincia) {
		return null;
	}

	@Override
	public Boolean updateProvincia(Provincia Provincia) {
		return null;
	}

	@Override
	public Boolean deleteProvincia(int id) {
		return null;
	}

	@Override
	public List<Provincia> findAllProvincia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provincia getProvincia(int id) throws NoSuchIdException {
		return null;
	}

}
