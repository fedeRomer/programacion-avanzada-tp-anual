package com.AppBackend.dao.daoFactories;

import com.AppBackend.dao.daoImplementations.AerolineaDAOimpl;
import com.AppBackend.dao.daoImplementations.ClienteDAOimpl;
import com.AppBackend.dao.daoImplementations.VentasDAOimpl;
import com.AppBackend.dao.daoImplementations.VuelosDAOimpl;
import com.AppBackend.dao.daoInterfaces.AerolineaDAO;
import com.AppBackend.dao.daoInterfaces.ClienteDAO;
import com.AppBackend.dao.daoInterfaces.VentasDAO;
import com.AppBackend.dao.daoInterfaces.VuelosDAO;

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
