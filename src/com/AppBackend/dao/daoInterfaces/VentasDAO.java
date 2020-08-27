package com.AppBackend.dao.daoInterfaces;
import java.util.List;

import com.AppBackend.exceptions.NoSuchIdException;
import com.AppBackend.domain.Venta;

public interface VentasDAO {
	
	   public void addVenta(Venta venta);
	    public Venta updateVenta(Venta venta);
	    public void deleteVenta(int idVenta);
	    public List<Venta> findAllVentas();
	    public Venta getVenta(int idVenta) throws NoSuchIdException;

}
