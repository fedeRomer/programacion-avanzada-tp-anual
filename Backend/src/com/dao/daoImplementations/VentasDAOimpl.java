package com.dao.daoImplementations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.dao.daoInterfaces.VentasDAO;
import com.domain.Venta;
import com.mysql.cj.jdbc.CallableStatement;

public class VentasDAOimpl implements VentasDAO {
	private PreparedStatement preparedStatement;
	//private CallableStatement callableStatement;
	private String query;
	private Connection connection;
	private Statement statement;
	@Override
	public void addVenta(Venta venta) {
				
	}


	@Override
	public void deleteVenta(int idVenta) {
		
	}

	@Override
	public List<Venta> findAllVentas() {
		return null;
	}

	@Override
	public Venta getVenta(int idVenta) {
		return null;
	}


	@Override
	public Venta updateVenta(Venta venta) {
		// TODO Auto-generated method stub
		return null;
	}

}
