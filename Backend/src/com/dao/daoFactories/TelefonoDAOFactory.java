package com.dao.daoFactories;

import com.dao.daoImplementations.AeropuertoDAOimpl;
import com.dao.daoInterfaces.AeropuertoDAO;

public class TelefonoDAOFactory {

	public static AeropuertoDAO getAeropuertoDAOimpl() {
		return new AeropuertoDAOimpl();
	}
}
