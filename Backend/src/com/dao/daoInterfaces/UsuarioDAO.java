package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Usuario;
import com.exceptions.NoSuchIdException;

public interface UsuarioDAO {

    public Boolean addUsuario(Usuario Usuario) throws SQLException, IOException;
    public Boolean updateUsuario(Usuario Usuario) throws SQLException, IOException;
    public Boolean deleteUsuario(int id) throws SQLException, IOException;
    public List<Usuario> findAllUsuario() throws SQLException, IOException;
    public Usuario getUsuario(int id) throws NoSuchIdException, SQLException, IOException;
    public Usuario getUsuario(String user, String password) throws SQLException, IOException;
}
