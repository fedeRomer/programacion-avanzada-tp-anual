package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Pais;
import com.exceptions.NoSuchIdException;

public interface PaisDAO {

    public Boolean addPais(Pais pais) throws SQLException, IOException;
    public Boolean updatePais(Pais pais) throws SQLException, IOException;
    public Boolean deletePais(int id) throws SQLException, IOException;
    public List<Pais> findAllPais() throws SQLException, IOException;
    public Pais getPais(int id) throws NoSuchIdException, SQLException, IOException;
}
