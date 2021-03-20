package com.dao.daoFactories;

import com.dao.daoImplementations.PasajeroFrecuenteDAOimpl;
import com.dao.daoInterfaces.PasajeroFrecuenteDAO;

public class PasajeroFrecuenteDAOFactory {

	public static PasajeroFrecuenteDAO getPasajeroFrecuenteDAOimpl() {
		return new PasajeroFrecuenteDAOimpl();
	}
}
