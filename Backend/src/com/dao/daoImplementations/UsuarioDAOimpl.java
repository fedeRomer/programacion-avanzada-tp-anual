package com.dao.daoImplementations;

import java.util.List;

import com.dao.daoInterfaces.UsuarioDAO;
import com.domain.Usuario;
import com.exceptions.NoSuchIdException;

public class UsuarioDAOimpl implements UsuarioDAO{

	@Override
	public Boolean addUsuario(Usuario Usuario) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public Usuario updateUsuario(Usuario Usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAllUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUsuario(int id) throws NoSuchIdException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUsuario(String user, String password) {
		// TODO Auto-generated method stub
		return null;
	}


}
