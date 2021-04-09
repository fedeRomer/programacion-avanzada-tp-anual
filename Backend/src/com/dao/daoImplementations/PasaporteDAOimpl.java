package com.dao.daoImplementations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dao.daoInterfaces.PasaporteDAO;
import com.domain.Pais;
import com.domain.Pasaporte;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;
import com.utils.ConexionDB.MySQL;

public class PasaporteDAOimpl implements PasaporteDAO {
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addPasaporte(Pasaporte pasaporte) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "INSERT INTO PASAPORTE (codigoPasaporte, pais, autoridadEmision, fechaEmision, fechaVencimiento) "
				+ "VALUES (?,?,?,?,?)";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, pasaporte.getCodigoPasaporte());
		preparedStatement.setInt(2, pasaporte.getPais().getId());
		preparedStatement.setString(3, pasaporte.getAutoridadEmision());
		preparedStatement.setDate(4, (java.sql.Date) pasaporte.getFechaEmision());
		preparedStatement.setDate(5, (java.sql.Date) pasaporte.getFechaVencimiento());

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
	public Boolean updatePasaporte(Pasaporte pasaporte) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "UPDATE PASAPORTE SET codigoPasaporte=?, pais=?, autoridadEmision=?, fechaEmision=?, fechaVencimiento=?"
				+ " WHERE id=?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, pasaporte.getCodigoPasaporte());
		preparedStatement.setInt(2, pasaporte.getPais().getId());
		preparedStatement.setString(3, pasaporte.getAutoridadEmision());
		preparedStatement.setDate(4, (java.sql.Date) pasaporte.getFechaEmision());
		preparedStatement.setDate(5, (java.sql.Date) pasaporte.getFechaVencimiento());
		preparedStatement.setInt(6, pasaporte.getIdPasaporte());

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
	public Boolean deletePasaporte(int id) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "DELETE FROM PASAPORTE WHERE id = ?";
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
	public List<Pasaporte> findAllPasaporte() throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		List<Pasaporte> listPasaporte = new ArrayList<Pasaporte>();
		query = "SELECT * FROM PASAPORTE";
		preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Pasaporte p = new Pasaporte();
			p.setIdPasaporte(resultSet.getInt("id"));
			p.setCodigoPasaporte(resultSet.getInt("codigo_pasaporte"));

			Pais pais = new Pais();
			pais.setId(resultSet.getInt("pais"));
			p.setPais(pais);

			p.setAutoridadEmision(resultSet.getString("autoridad_emision"));
			p.setFechaEmision(resultSet.getDate("fecha_emision"));
			p.setFechaEmision(resultSet.getDate("fecha_vencimiento"));

			listPasaporte.add(p);
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return listPasaporte;
	}

	@Override
	public Pasaporte getPasaporte(int id) throws NoSuchIdException, SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "SELECT * FROM PASAPORTE WHERE id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		
		Pasaporte p = new Pasaporte();
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			
			p.setIdPasaporte(resultSet.getInt("id"));
			p.setCodigoPasaporte(resultSet.getInt("codigo_pasaporte"));

			Pais pais = new Pais();
			pais.setId(resultSet.getInt("pais"));
			p.setPais(pais);

			p.setAutoridadEmision(resultSet.getString("autoridad_emision"));
			p.setFechaEmision(resultSet.getDate("fecha_emision"));
			p.setFechaEmision(resultSet.getDate("fecha_vencimiento"));
		}
		
		resultSet.close();
		preparedStatement.close();
		connection.close();
		
		return p;
	}

}
