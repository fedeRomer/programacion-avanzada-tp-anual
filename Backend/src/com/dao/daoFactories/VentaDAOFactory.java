package com.dao.daoFactories;

import com.dao.daoImplementations.VentaDAOimpl;
import com.dao.daoInterfaces.VentaDAO;

public class VentaDAOFactory {

	public static VentaDAO getVentaDAOimpl() {
		return new VentaDAOimpl();
	}
}
