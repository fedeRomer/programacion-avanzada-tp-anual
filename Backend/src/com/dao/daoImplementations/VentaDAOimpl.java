package com.dao.daoImplementations;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.daoInterfaces.VentaDAO;
import com.domain.Cliente;
import com.domain.LineaAerea;
import com.domain.Venta;
import com.domain.Vuelo;
import com.exceptions.NoSuchIdException;
import com.utils.ConexionDB.MySQL;

public class VentaDAOimpl implements VentaDAO {

	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addVenta(Venta venta) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "INSERT INTO VENTA (fecha_venta, metodo_pago, id_vuelo, id_cliente, id_aerolinea) "
				+ "VALUES (?,?,?,?,?)";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setDate(1, (Date) venta.getFechaDeVenta());
		preparedStatement.setString(2, venta.getFormaDePago().getValue());
		preparedStatement.setInt(3, venta.getVuelo().getId());
		preparedStatement.setInt(4, venta.getCliente().getIdCliente());
		preparedStatement.setString(5, venta.getLineaAerea().getAerolinea());

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
	public Boolean updateVenta(Venta venta) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "UPDATE VENTA SET fecha_venta=?, metodo_pago=?, id_vuelo=?, id_cliente=?, id_aerolinea=? WHERE id=?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setDate(1, (Date) venta.getFechaDeVenta());
		preparedStatement.setString(2, venta.getFormaDePago().getValue());
		preparedStatement.setInt(3, venta.getVuelo().getId());
		preparedStatement.setInt(4, venta.getCliente().getIdCliente());
		preparedStatement.setString(5, venta.getLineaAerea().getAerolinea());
		preparedStatement.setInt(6, venta.getIdVenta());
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
	public Boolean deleteVenta(int idVenta) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "DELETE FROM VENTA WHERE id =?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, idVenta);
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
	public List<Venta> findAllVentas() throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		List<Venta> ventaList = new ArrayList<Venta>();
		query = "SELECT * FROM VENTA";
		preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {

			Venta venta = new Venta();
			Cliente cliente = new Cliente();
			Vuelo vuelo = new Vuelo();
			LineaAerea lineaAerea = new LineaAerea();

			venta.setIdVenta(resultSet.getInt(1));
			venta.setFechaDeVenta(resultSet.getDate(2));
			venta.setFormaDePago(resultSet.getString(3));

			cliente.setIdCliente(resultSet.getInt(4));
			vuelo.setId(resultSet.getInt(5));
			lineaAerea.setId(resultSet.getInt(6));

			venta.setCliente(cliente);
			venta.setVuelo(vuelo);
			venta.setLineaAerea(lineaAerea);

			ventaList.add(venta);
		}

		return ventaList;
	}

	@Override
	public Venta getVenta(int idVenta) throws NoSuchIdException, SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "SELECT * FROM VENTA WHERE id =?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, idVenta);
		ResultSet set = preparedStatement.executeQuery();
		Venta venta = new Venta();
		while (set.next()) {
			Cliente cliente = new Cliente();
			Vuelo vuelo = new Vuelo();
			LineaAerea lineaAerea = new LineaAerea();

			venta.setIdVenta(set.getInt(1));
			venta.setFechaDeVenta(set.getDate(2));
			venta.setFormaDePago(set.getString(3));

			cliente.setIdCliente(set.getInt(4));
			vuelo.setId(set.getInt(5));
			lineaAerea.setId(set.getInt(6));

			venta.setCliente(cliente);
			venta.setVuelo(vuelo);
			venta.setLineaAerea(lineaAerea);
		}

		return venta;

	}

}
