package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Pasaporte;
import com.exceptions.NoSuchIdException;

public interface PasaporteDAO {

    public Boolean addPasaporte(Pasaporte Pasaporte) throws SQLException, IOException;
    public Boolean updatePasaporte(Pasaporte Pasaporte) throws SQLException, IOException;
    public Boolean deletePasaporte(int id) throws SQLException, IOException;
    public List<Pasaporte> findAllPasaporte() throws SQLException, IOException;
    public Pasaporte getPasaporte(int id) throws NoSuchIdException, SQLException, IOException;
}
