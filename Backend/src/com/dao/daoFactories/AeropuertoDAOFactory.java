package com.dao.daoFactories;

import com.dao.daoImplementations.AeropuertoDAOimpl;
import com.dao.daoInterfaces.AeropuertoDAO;

public class AeropuertoDAOFactory {

	public static AeropuertoDAO getAeropuertoDAOimpl() {
		return new AeropuertoDAOimpl();
	}
}
