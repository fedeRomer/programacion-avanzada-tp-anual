package com.dao.daoImplementations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.daoInterfaces.TelefonoDAO;
import com.domain.Telefono;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;
import com.utils.ConexionDB.MySQL;

public class TelefonoDAOimpl implements TelefonoDAO{
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addTelefono(Telefono telefono) throws IOException, SQLException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "INSERT INTO TELEFONO (laboral, personal, celular) VALUES (?,?,?)";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, telefono.getLaboral());
		preparedStatement.setString(2, telefono.getPersonal());
		preparedStatement.setString(3, telefono.getCelular());
		
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
	public Boolean updateTelefono(Telefono telefono) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query ="UPDATE TELEFONO SET laboral=?, personal=?, celular=?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, telefono.getLaboral());
		preparedStatement.setString(2, telefono.getPersonal());
		preparedStatement.setString(3, telefono.getCelular());

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
	public Boolean deleteTelefono(int id) throws IOException, SQLException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "DELETE FROM TELEFONO where id = ?";
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
	public List<Telefono> findAllTelefono() throws IOException, SQLException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		List<Telefono> telefonoList = new ArrayList<Telefono>();
		query = "SELECT * FROM TELEFONO";
		preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Telefono t = new Telefono();
			t.setId(resultSet.getInt(1));
			t.setLaboral(resultSet.getString(2));
			t.setPersonal(resultSet.getString(3));
			t.setCelular(resultSet.getString(4));
			telefonoList.add(t);
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		
		return telefonoList;
	}

	@Override
	public Telefono getTelefono(int id) throws IOException, SQLException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "SELECT * FROM TELEFONO WHERE id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		ResultSet set = preparedStatement.executeQuery();
		
		Telefono t = new Telefono();
		while (set.next()) {
			t.setId(id);
			t.setLaboral(set.getString(1));
			t.setPersonal(set.getString(2));
			t.setCelular(set.getString(3));
		}
		set.close();
		preparedStatement.close();
		connection.close();
		return t;
	}

}
