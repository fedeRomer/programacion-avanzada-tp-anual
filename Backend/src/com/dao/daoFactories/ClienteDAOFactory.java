package com.dao.daoFactories;

import com.dao.daoImplementations.ClienteDAOimpl;
import com.dao.daoInterfaces.ClienteDAO;

public class ClienteDAOFactory {
	
	public static ClienteDAO getClienteDAOimpl() {
		return new ClienteDAOimpl();
	}

}
