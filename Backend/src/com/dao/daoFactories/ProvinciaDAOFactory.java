package com.dao.daoFactories;

import com.dao.daoImplementations.ProvinciaDAOimpl;
import com.dao.daoInterfaces.ProvinciaDAO;

public class ProvinciaDAOFactory {

	public static ProvinciaDAO getProvinciaDAOimpl() {
		return new ProvinciaDAOimpl();
	}
}
