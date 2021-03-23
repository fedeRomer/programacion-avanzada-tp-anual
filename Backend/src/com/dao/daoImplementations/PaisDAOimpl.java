package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.PaisDAO;
import com.domain.Pais;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;

public class PaisDAOimpl implements PaisDAO{
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addPais(Pais pais) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean updatePais(Pais pais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deletePais(int id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pais> findAllPais() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pais getPais(int id) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

}
