package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.AeropuertoDAO;
import com.domain.Aeropuerto;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;

public class AeropuertoDAOimpl implements AeropuertoDAO {
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addAeropuerto(Aeropuerto aeropuerto) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean updateAeropuerto(Aeropuerto aeropuerto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAeropuerto(int id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Aeropuerto> findAllAeropuertos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aeropuerto getAeropuerto(int id) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

}
