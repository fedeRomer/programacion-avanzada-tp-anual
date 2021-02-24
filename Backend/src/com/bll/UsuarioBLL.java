package com.bll;

import java.io.IOException;
import java.sql.SQLException;

import com.dao.daoFactories.UsuarioDAOFactory;
import com.dao.daoInterfaces.UsuarioDAO;
import com.domain.Usuario;

public class UsuarioBLL {

	public boolean validatePassword(Usuario u) throws SQLException, IOException {
		// validate con db
		
		UsuarioDAO usuarioDAO = UsuarioDAOFactory.getUsuarioDAOimpl();
		
		u = usuarioDAO.getUsuario(u.getUsername(), u.getPassword());
		
		if (u != null) {
			
			return true;
			
		} else {
			
			return false;
			
		}

		// return true; -> mockear para validar sesion
	}

}
