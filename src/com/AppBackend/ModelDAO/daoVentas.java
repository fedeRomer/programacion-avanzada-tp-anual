package com.AppBackend.ModelDAO;
import java.util.List;
import com.AppBackend.Domain.Venta;

public interface daoVentas {
	
	   public void addVenta(Venta venta);
	    public Venta updateVenta(Venta venta, int idVenta);
	    public void deleteVenta(int idVenta);
	    public List<Venta> findAllVentas();
	    public Venta getVenta(int idVenta); /*throws NoSuchUserException*/

}
