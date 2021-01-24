package com.dao.daoFactories;

import com.dao.daoImplementations.AerolineaDAOimpl;
import com.dao.daoImplementations.ClienteDAOimpl;
import com.dao.daoImplementations.VentasDAOimpl;
import com.dao.daoImplementations.VuelosDAOimpl;
import com.dao.daoInterfaces.AerolineaDAO;
import com.dao.daoInterfaces.ClienteDAO;
import com.dao.daoInterfaces.VentasDAO;
import com.dao.daoInterfaces.VuelosDAO;

public class DAOFactory {
	
	public static AerolineaDAO getAerolineaDAOimpl() {
		return new AerolineaDAOimpl();
	}
	
	public static ClienteDAO getClienteDAOimpl() {
		return new ClienteDAOimpl();
	}
	
	public static VentasDAO getVentasDAOimpl() {
		return new VentasDAOimpl();
	}
	
	public static VuelosDAO getVuelosDAOimpl() {
		return new VuelosDAOimpl();
	}

}
