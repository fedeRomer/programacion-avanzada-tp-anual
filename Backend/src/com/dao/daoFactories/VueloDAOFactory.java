package com.dao.daoFactories;

import com.dao.daoImplementations.VueloDAOimpl;
import com.dao.daoInterfaces.VueloDAO;

public class VueloDAOFactory {

	public static VueloDAO getVueloDAOimpl() {
		return new VueloDAOimpl();
	}
}
