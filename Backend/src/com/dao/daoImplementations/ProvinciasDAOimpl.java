package com.dao.daoImplementations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.ProvinciaDAO;
import com.domain.Provincia;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;
import com.utils.ConexionDB.MySQL;

public class ProvinciasDAOimpl implements ProvinciaDAO{
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addProvincia(Provincia provincia) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "INSERT INTO PROVINCIA (nombre) VALUES (?)";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, provincia.getNombre());
		
		int resultSet = preparedStatement.executeUpdate();
		if (resultSet == 1) {
			preparedStatement.close();
			connection.close();
			return true;
		} else {
			preparedStatement.close();
			connection.close();
			return false;
		}
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
		// TODO Auto-generated method stub
		return null;
	}

}
