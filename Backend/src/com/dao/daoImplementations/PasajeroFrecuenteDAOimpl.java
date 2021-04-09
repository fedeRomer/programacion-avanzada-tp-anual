package com.dao.daoImplementations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.daoInterfaces.PasajeroFrecuenteDAO;
import com.domain.Alianza;
import com.domain.LineaAerea;
import com.domain.PasajeroFrecuente;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;
import com.utils.ConexionDB.MySQL;

public class PasajeroFrecuenteDAOimpl implements PasajeroFrecuenteDAO {
	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "INSERT INTO PASAJERO_FRECUENTE (numeroPasajero, lineaAerea, alianza, aerolinea) " + "VALUES (?,?,?,?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, pasajeroFrecuente.getNumeroPasajero());
		preparedStatement.setInt(2, pasajeroFrecuente.getLineaAerea().getId());
		preparedStatement.setString(3, pasajeroFrecuente.getAlianza().name());
		preparedStatement.setString(4, pasajeroFrecuente.getAerolinea());

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
	public Boolean updatePasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "UPDATE PASAJERO_FRECUENTE SET idPasajeroFrecuente=?,  numeroPasajero=?,  lineaAerea=?,  alianza=?, aerolinea=? "
				+ "WHERE id = ?";

		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, pasajeroFrecuente.getNumeroPasajero());
		preparedStatement.setInt(2, pasajeroFrecuente.getLineaAerea().getId());
		preparedStatement.setString(3, pasajeroFrecuente.getAlianza().name());
		preparedStatement.setString(4, pasajeroFrecuente.getAerolinea());
		preparedStatement.setInt(5, pasajeroFrecuente.getIdPasajeroFrecuente());

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
	public Boolean deletePasajeroFrecuente(int id) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "DELETE FROM PASAJERO_FRECUENTE WHERE id = ?";

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
	public List<PasajeroFrecuente> findAllPasajeroFrecuente() throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		List<PasajeroFrecuente> listPasajeroFrecuente = new ArrayList<PasajeroFrecuente>();
		query = "SELECT * FROM PASAJERO_FRECUENTE";
		preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			PasajeroFrecuente pf = new PasajeroFrecuente();
			pf.setIdPasajeroFrecuente(resultSet.getInt("id"));
			pf.setNumeroPasajero(resultSet.getInt("numero_pasajero"));

			LineaAerea la = new LineaAerea();
			la.setId(resultSet.getInt("linea_aerea"));
			pf.setLineaAerea(la);

			String alianzaQuery = resultSet.getString("alianza");

			for (Alianza alianzas : Alianza.values()) {
				if (alianzas.alianza.equalsIgnoreCase(alianzaQuery)) {
					pf.setAlianza(alianzas);
				}
			}

			pf.setAerolinea(resultSet.getString("aerolinea"));

			listPasajeroFrecuente.add(pf);
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();
		return listPasajeroFrecuente;
	}

	@Override
	public PasajeroFrecuente getPasajeroFrecuente(int id) throws NoSuchIdException, SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "SELECT * FROM PASAJERO_FRECUENTE WHERE id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);

		PasajeroFrecuente pf = new PasajeroFrecuente();
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			pf.setIdPasajeroFrecuente(resultSet.getInt("id"));
			pf.setNumeroPasajero(resultSet.getInt("numero_pasajero"));

			LineaAerea la = new LineaAerea();
			la.setId(resultSet.getInt("linea_aerea"));
			pf.setLineaAerea(la);

			String alianzaQuery = resultSet.getString("alianza");

			for (Alianza alianzas : Alianza.values()) {
				if (alianzas.alianza.equalsIgnoreCase(alianzaQuery)) {
					pf.setAlianza(alianzas);
				}
			}

			pf.setAerolinea(resultSet.getString("aerolinea"));
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();

		return pf;
	}

}
