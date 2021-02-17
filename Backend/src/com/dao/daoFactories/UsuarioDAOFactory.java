package com.dao.daoFactories;

import com.dao.daoImplementations.UsuarioDAOimpl;
import com.dao.daoInterfaces.UsuarioDAO;

public class UsuarioDAOFactory {

	public static UsuarioDAO getUsuarioDAOimpl() {
		return new UsuarioDAOimpl();
	}
}
