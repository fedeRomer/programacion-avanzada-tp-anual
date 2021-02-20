package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Usuario;
import com.exceptions.NoSuchIdException;

public interface UsuarioDAO {

    public Boolean addUsuario(Usuario Usuario);
    public Usuario updateUsuario(Usuario Usuario);
    public Boolean deleteUsuario(int id);
    public List<Usuario> findAllUsuario();
    public Usuario getUsuario(int id) throws NoSuchIdException;
    public Usuario getUsuario(String user, String password);
}
