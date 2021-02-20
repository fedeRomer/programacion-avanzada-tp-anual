package com.dao.daoImplementations;

import java.util.ArrayList;
import java.util.List;

import com.dao.daoInterfaces.UsuarioDAO;
import com.domain.Usuario;
import com.exceptions.NoSuchIdException;
import com.utils.ConexionDB.MySQL;

import java.io.IOException;
import java.sql.*;

public class UsuarioDAOimpl implements UsuarioDAO {

	private PreparedStatement preparedStatement;
	private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;

	@Override
	public Boolean addUsuario(Usuario usuario) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "INSERT INTO USUARIO (username,password,tipo_usuario) VALUES (?,?,?)";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, usuario.getUsername());
		preparedStatement.setString(2, usuario.getPassword());
		preparedStatement.setString(3, usuario.getTipoUser());
		
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
	public Boolean updateUsuario(Usuario usuario) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "UPDATE USUARIO SET username=?, password=?, tipo_usuario=?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, usuario.getUsername());
		preparedStatement.setString(2, usuario.getPassword());
		preparedStatement.setString(3, usuario.getTipoUser());
		
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
	public Boolean deleteUsuario(int id) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "DELETE FROM USUARIO WHERE id = ?";
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
	public List<Usuario> findAllUsuario() throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		List<Usuario> userList = new ArrayList<Usuario>();
		query = "select * from USUARIO";
		preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Usuario usuario = new Usuario();
			usuario.setId(resultSet.getInt(1));
			usuario.setUsername(resultSet.getString(2));
			usuario.setPassword(resultSet.getString(3));
			usuario.setTipoUser(resultSet.getString(4));
			userList.add(usuario);
		}
		resultSet.close();
		preparedStatement.close();
		connection.close();

		return userList;
	}

	@Override
	public Usuario getUsuario(int id) throws NoSuchIdException, SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "select * from USUARIO where id = ?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);

		ResultSet set = preparedStatement.executeQuery();
		Usuario usuario = new Usuario();
		while (set.next()) {
			usuario.setId(set.getInt(1));
			usuario.setUsername(set.getString(2));
			usuario.setPassword(set.getString(3));
			usuario.setTipoUser(set.getString(4));
		}
		set.close();
		preparedStatement.close();
		connection.close();
		return usuario;
	}

	@Override
	public Usuario getUsuario(String username, String password) throws SQLException, IOException {
		MySQL mySQL = new MySQL();
		this.connection = mySQL.getConnection();
		query = "select * from USUARIO where username=? and password=?";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet set = preparedStatement.executeQuery();
		Usuario usuario = new Usuario();
		while (set.next()) {
			usuario.setId(set.getInt(1));
			usuario.setUsername(set.getString(2));
			usuario.setPassword(set.getString(3));
			usuario.setTipoUser(set.getString(4));
		}
		set.close();
		preparedStatement.close();
		connection.close();
		return usuario;
	}

}
