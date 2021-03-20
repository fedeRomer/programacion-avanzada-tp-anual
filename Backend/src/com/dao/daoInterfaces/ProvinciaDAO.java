package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Provincia;
import com.exceptions.NoSuchIdException;

public interface ProvinciaDAO {

    public Boolean addProvincia(Provincia Provincia) throws SQLException, IOException;
    public Boolean updateProvincia(Provincia Provincia) throws SQLException, IOException;
    public Boolean deleteProvincia(int id) throws SQLException, IOException;
    public List<Provincia> findAllProvincia() throws SQLException, IOException;
    public Provincia getProvincia(int id) throws NoSuchIdException, SQLException, IOException;
}
