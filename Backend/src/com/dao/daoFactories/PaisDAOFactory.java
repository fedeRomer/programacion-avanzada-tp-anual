package com.dao.daoFactories;

import com.dao.daoImplementations.PaisDAOimpl;
import com.dao.daoInterfaces.PaisDAO;

public class PaisDAOFactory {

	public static PaisDAO getPaisDAOimpl() {
		return new PaisDAOimpl();
	}
}
