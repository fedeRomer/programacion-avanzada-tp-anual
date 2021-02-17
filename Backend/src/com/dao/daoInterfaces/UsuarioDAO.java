package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Usuario;
import com.exceptions.NoSuchIdException;

public interface UsuarioDAO {

    public void addUsuario(Usuario Usuario);
    public Usuario updateUsuario(Usuario Usuario);
    public void deleteUsuario(int id);
    public List<Usuario> findAllUsuario();
    public Usuario getUsuario(int id) throws NoSuchIdException;
}
