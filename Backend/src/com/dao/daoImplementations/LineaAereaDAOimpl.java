package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.LineaAereaDAO;
import com.domain.LineaAerea;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;

public class LineaAereaDAOimpl implements LineaAereaDAO{
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addLineaAerea(LineaAerea lineaAerea) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean updateLineaAerea(LineaAerea lineaAerea) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteLineaAerea(int id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LineaAerea> findAllLineaAerea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LineaAerea getLineaAerea(int id) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

}
