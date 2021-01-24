package com.dao.daoImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.daoInterfaces.ClienteDAO;
import com.domain.Cliente;
import com.exceptions.NoSuchIdException;
import com.utils.ConexionDB.ThrowQueryByString;
import com.mysql.cj.jdbc.CallableStatement;

public class ClienteDAOimpl implements ClienteDAO {
	private PreparedStatement preparedStatement;
	//private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;
	@Override
	public void addCliente(Cliente cliente) {
		try {
			String query = "insert into...T";
			ThrowQueryByString t = new ThrowQueryByString();
			ResultSet rs = t.exec(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCliente(int idUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> findAllCliente() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			String query = "SELECT * FROM CLIENTE";
			ThrowQueryByString t = new ThrowQueryByString();
			ResultSet rs = t.exec(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {

					Cliente tempBo = new Cliente();
					tempBo.setIdCliente(rs.getInt("id_cliente"));
					tempBo.setNombreCompleto(rs.getString("nombre") + " " + rs.getString("Apellido"));
					tempBo.setDni(rs.getInt("dni"));
					tempBo.setCuilCuit(rs.getString("cuil"));
					tempBo.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
					tempBo.setMail(rs.getString("email"));
					/*
					 * agregar Pasaporte pasaporte en pojo cliente
					 * aca realizar tempBo.setPasaporte.setIdpasaporte(rs.getint
					 */
					clientes.add(tempBo);
				}
				System.out.println("\n");
			}
			
			return clientes;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Cliente getCliente(int idUsuario) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente updateCliente(Cliente usuario) {
		// TODO Auto-generated method stub
		return null;
	}
}
