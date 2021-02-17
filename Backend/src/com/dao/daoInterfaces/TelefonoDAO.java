package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Telefono;
import com.exceptions.NoSuchIdException;

public interface TelefonoDAO {

    public void addTelefono(Telefono Telefono);
    public Telefono updateTelefono(Telefono Telefono);
    public void deleteTelefono(int id);
    public List<Telefono> findAllTelefono();
    public Telefono getTelefono(int id) throws NoSuchIdException;
}
