package com.dao.daoFactories;

import com.dao.daoImplementations.DireccionDAOimpl;
import com.dao.daoInterfaces.DireccionDAO;

public class DireccionDAOFactory {

	public static DireccionDAO getDireccionDAOimpl() {
		return new DireccionDAOimpl();
	}
}
