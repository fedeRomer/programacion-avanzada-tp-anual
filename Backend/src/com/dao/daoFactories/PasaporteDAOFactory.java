package com.dao.daoFactories;

import com.dao.daoImplementations.PasaporteDAOimpl;
import com.dao.daoInterfaces.PasaporteDAO;

public class PasaporteDAOFactory {

	public static PasaporteDAO getPasaporteDAOimpl() {
		return new PasaporteDAOimpl();
	}
}
