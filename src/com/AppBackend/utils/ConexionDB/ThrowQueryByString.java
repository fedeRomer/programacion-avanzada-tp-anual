package com.AppBackend.utils.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ThrowQueryByString {

	public ResultSet exec(String query) {
		Connection conn;
		ResultSet resultSet = null;
		try {
			Conexion conexionObj = new Conexion();
			conn = conexionObj.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			resultSet = ps.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultSet;
	}

}
