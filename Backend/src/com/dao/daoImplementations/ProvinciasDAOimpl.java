package com.dao.daoImplementations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
	public Boolean updateProvincia(Provincia provincia) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "UPDATE PROVINCIA SET nombre = ? WHERE id=?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, provincia.getNombre());
		preparedStatement.setInt(2, provincia.getId());

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
	public Boolean deleteProvincia(int id) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "DELETE FROM PROVINCIA WHERE id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		
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
	public List<Provincia> findAllProvincia() throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		List<Provincia> provinciaList = new ArrayList<Provincia>();
		query = "select * from PROVINCIA";
		preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Provincia p = new Provincia();
			p.setId(resultSet.getInt(1));
			p.setNombre(resultSet.getString(2));
			provinciaList.add(p);
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		
		return provinciaList;
	}

	@Override
	public Provincia getProvincia(int id) throws NoSuchIdException, SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "select * from PROVINCIA where id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);

		ResultSet set = preparedStatement.executeQuery();
		Provincia p = new Provincia();
		while (set.next()) {
			p.setId(set.getInt(1));
			p.setNombre(set.getString(2));
		}
		set.close();
		preparedStatement.close();
		connection.close();
		return p;
	}

}
