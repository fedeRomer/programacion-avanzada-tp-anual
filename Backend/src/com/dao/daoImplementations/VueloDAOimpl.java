package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.VueloDAO;
import com.domain.Vuelo;
import com.mysql.cj.jdbc.CallableStatement;

public class VueloDAOimpl implements VueloDAO {
	
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addVuelo(Vuelo vuelo) {
		return null;

	}

	@Override
	public Boolean deleteVuelo(int idVuelo) {
		return null;

	}

	@Override
	public List<Vuelo> findAllvuelos() {
		return null;
	}

	@Override
	public Vuelo getVuelo(int idVuelo) {
		return null;
	}

	@Override
	public Boolean updateVuelo(Vuelo vuelo) {
		return null;
	}

}
