package com.dao.daoImplementations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.daoInterfaces.VueloDAO;
import com.domain.Aeropuerto;
import com.domain.LineaAerea;
import com.domain.Vuelo;
import com.exceptions.NoSuchIdException;
import com.mysql.cj.jdbc.CallableStatement;
import com.utils.ConexionDB.MySQL;

public class VueloDAOimpl implements VueloDAO {

	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addVuelo(Vuelo vuelo) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "INSERT INTO VUELO (nroVuelo,cantidadDeAsientos,vendidos,tiempoHoras,lineaAerea,aeropuertoDeSalida,aeropuertoDeLlegada,horaSalida,horaLlegada) "
				+ "VALUES (?,?,?,?,?,?,?,?,?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, vuelo.getNroVuelo());
		preparedStatement.setInt(2, vuelo.getCantidadDeAsientos());
		preparedStatement.setInt(3, vuelo.getVendidos());
		preparedStatement.setInt(4, vuelo.getTiempoHoras());
		preparedStatement.setInt(5, vuelo.getLineaAerea().getId());
		preparedStatement.setInt(6, vuelo.getAeropuertoDeSalida().getId());
		preparedStatement.setInt(7, vuelo.getAeropuertoDeLlegada().getId());
		preparedStatement.setDate(8, (Date) vuelo.getHoraSalida());
		preparedStatement.setDate(9, (Date) vuelo.getHoraLlegada());

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
	public Boolean deleteVuelo(int idVuelo) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "DELETE FROM VUELO WHERE id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, idVuelo);
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
	public List<Vuelo> findAllvuelos() throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		List<Vuelo> listVuelo = new ArrayList<Vuelo>();
		query = "SELECT * FROM VUELO";
		preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Vuelo vuelo = new Vuelo();
			
			vuelo.setId(resultSet.getInt("id"));
			vuelo.setNroVuelo(resultSet.getString("nro_vuelo"));
			vuelo.setCantidadDeAsientos(resultSet.getInt("cantidad_de_asientos"));
			vuelo.setVendidos(resultSet.getInt("vendidos"));
			vuelo.setTiempoHoras(resultSet.getInt("tiempo_horas"));
			
			LineaAerea lineaAerea = new LineaAerea();
			lineaAerea.setId(resultSet.getInt("linea_aerea"));
			vuelo.setLineaAerea(lineaAerea);
			
			Aeropuerto aeropuertoDeSalida = new Aeropuerto();
			Aeropuerto aeropuertoDeLlegada = new Aeropuerto();
			aeropuertoDeSalida.setId(resultSet.getInt("aeropuerto_de_salida"));
			aeropuertoDeLlegada.setId(resultSet.getInt("aeropuerto_de_llegada"));
			vuelo.setAeropuertoDeLlegada(aeropuertoDeLlegada);
			vuelo.setAeropuertoDeSalida(aeropuertoDeSalida);
			
			vuelo.setHoraLlegada(resultSet.getDate("hora_llegada"));
			vuelo.setHoraSalida(resultSet.getDate("hora_salida"));
			
			listVuelo.add(vuelo);
		}
		
		resultSet.close();
		preparedStatement.close();
		connection.close();
		
		return listVuelo;
	}

	@Override
	public Vuelo getVuelo(int idVuelo) throws NoSuchIdException, SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "SELECT * FROM VUELO WHERE id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, idVuelo);
		
		Vuelo vuelo = new Vuelo();
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			vuelo.setId(resultSet.getInt("id"));
			vuelo.setNroVuelo(resultSet.getString("nro_vuelo"));
			vuelo.setCantidadDeAsientos(resultSet.getInt("cantidad_de_asientos"));
			vuelo.setVendidos(resultSet.getInt("vendidos"));
			vuelo.setTiempoHoras(resultSet.getInt("tiempo_horas"));
			
			LineaAerea lineaAerea = new LineaAerea();
			lineaAerea.setId(resultSet.getInt("linea_aerea"));
			vuelo.setLineaAerea(lineaAerea);
			
			Aeropuerto aeropuertoDeSalida = new Aeropuerto();
			Aeropuerto aeropuertoDeLlegada = new Aeropuerto();
			aeropuertoDeSalida.setId(resultSet.getInt("aeropuerto_de_salida"));
			aeropuertoDeLlegada.setId(resultSet.getInt("aeropuerto_de_llegada"));
			vuelo.setAeropuertoDeLlegada(aeropuertoDeLlegada);
			vuelo.setAeropuertoDeSalida(aeropuertoDeSalida);
			
			vuelo.setHoraLlegada(resultSet.getDate("hora_llegada"));
			vuelo.setHoraSalida(resultSet.getDate("hora_salida"));
		}
		
		resultSet.close();
		preparedStatement.close();
		connection.close();
		
		return vuelo;
	}

	@Override
	public Boolean updateVuelo(Vuelo vuelo) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "UPDATE VUELO SET nroVuelo=?,cantidadDeAsientos=?,vendidos=?,tiempoHoras=?,lineaAerea=?,aeropuertoDeSalida=?,aeropuertoDeLlegada=?,horaSalida=?,horaLlegada=? "
				+ "WHERE id=?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, vuelo.getNroVuelo());
		preparedStatement.setInt(2, vuelo.getCantidadDeAsientos());
		preparedStatement.setInt(3, vuelo.getVendidos());
		preparedStatement.setInt(4, vuelo.getTiempoHoras());
		preparedStatement.setInt(5, vuelo.getLineaAerea().getId());
		preparedStatement.setInt(6, vuelo.getAeropuertoDeSalida().getId());
		preparedStatement.setInt(7, vuelo.getAeropuertoDeLlegada().getId());
		preparedStatement.setDate(8, (Date) vuelo.getHoraSalida());
		preparedStatement.setDate(9, (Date) vuelo.getHoraLlegada());
		preparedStatement.setInt(10, vuelo.getId());

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

}
