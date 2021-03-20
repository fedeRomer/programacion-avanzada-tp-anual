package com.dao.daoFactories;

import com.dao.daoImplementations.LineaAereaDAOimpl;
import com.dao.daoInterfaces.LineaAereaDAO;

public class LineaAereaDAOFactory {

	public static LineaAereaDAO getLineaAereaDAOimpl() {
		return new LineaAereaDAOimpl();
	}
}
