package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.PasaporteDAO;
import com.domain.Pasaporte;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;

public class PasaporteDAOimpl implements PasaporteDAO{
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public void addPasaporte(Pasaporte Pasaporte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pasaporte updatePasaporte(Pasaporte Pasaporte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePasaporte(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pasaporte> findAllPasaporte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pasaporte getPasaporte(int id) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

}
