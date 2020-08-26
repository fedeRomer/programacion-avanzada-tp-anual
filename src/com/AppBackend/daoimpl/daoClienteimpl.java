package com.AppBackend.daoimpl;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.AppBackend.dao.daoCliente;
import com.AppBackend.domain.Cliente;
import com.AppBackend.utils.ConexionDB.Conexion;
import com.mysql.cj.xdevapi.Statement;
import java.sql.*;

public class daoClienteimpl implements daoCliente{
	
	private Cliente cliente;
	private Conexion conexion;
	private String  selectall    = "SELECT * FROM Usuario WHERE idUsuario = ? ";
	private String deletecliente = "DELET FROM clientes WHERE idUsuario = ? ";
	private String addcliente    = "";
	
	
	
	
	
	
	public  daoClienteimpl() {
	
		this.conexion = new Conexion();
	
	}

	@Override
	public void addCliente(Cliente cliente) {
		
	}

	@Override
	public Cliente updateCliente(Cliente usuario, String dniUsuario) {
				return null;
	}

	@Override
	public void deleteCliente(String dni) {
		
	}

	@Override
	public List<Cliente> findAllCliente() {
		return null;
	}

	@Override
	public Cliente getCliente(String dni) {
		
		Connection con= null;
		Statement st = null;
		
		try {
			
			con = conexion.getConnection();
			st =  con.createStatement();
			
		}catch(SQLException e) {
			
		}
		
		
		
		
		
		return null;
	}

}
