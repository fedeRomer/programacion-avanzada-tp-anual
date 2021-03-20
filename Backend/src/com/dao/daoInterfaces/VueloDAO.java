package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Vuelo;
import com.exceptions.NoSuchIdException;

public interface VueloDAO {
	
    public Boolean addVuelo(Vuelo vuelo) throws SQLException, IOException;
    public Boolean updateVuelo(Vuelo vuelo) throws SQLException, IOException;
    public Boolean deleteVuelo(int idVuelo) throws SQLException, IOException;
    public List<Vuelo> findAllvuelos() throws SQLException, IOException;
    public Vuelo getVuelo(int idVuelo) throws NoSuchIdException, SQLException, IOException;


}
