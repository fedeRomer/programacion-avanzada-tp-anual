package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Venta;
import com.exceptions.NoSuchIdException;

public interface VentaDAO {

	public Boolean addVenta(Venta venta) throws SQLException, IOException;

	public Boolean updateVenta(Venta venta) throws SQLException, IOException;

	public Boolean deleteVenta(int idVenta) throws SQLException, IOException;

	public List<Venta> findAllVentas() throws SQLException, IOException;

	public Venta getVenta(int idVenta) throws NoSuchIdException, SQLException, IOException;

}
