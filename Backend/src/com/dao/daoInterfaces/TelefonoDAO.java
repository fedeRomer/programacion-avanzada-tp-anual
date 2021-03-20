package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Telefono;
import com.exceptions.NoSuchIdException;

public interface TelefonoDAO {

    public Boolean addTelefono(Telefono Telefono) throws IOException, SQLException;
    public Boolean updateTelefono(Telefono Telefono) throws IOException, SQLException;
    public Boolean deleteTelefono(int id) throws IOException, SQLException;
    public List<Telefono> findAllTelefono() throws IOException, SQLException;
    public Telefono getTelefono(int id) throws NoSuchIdException, IOException, SQLException;
}
