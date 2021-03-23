package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Direccion;
import com.exceptions.NoSuchIdException;

public interface DireccionDAO {

	public Boolean addDireccion(Direccion direccion) throws SQLException, IOException;
    public Boolean updateDireccion(Direccion direccion) throws SQLException, IOException;
    public Boolean deleteDireccion(int id) throws SQLException, IOException;
    public List<Direccion> findAllDireccion() throws SQLException, IOException;
    public Direccion getDireccion(int id) throws NoSuchIdException, SQLException, IOException;
}
