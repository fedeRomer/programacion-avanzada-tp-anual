package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.PasajeroFrecuente;
import com.exceptions.NoSuchIdException;

public interface PasajeroFrecuenteDAO {
	
    public Boolean addPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) throws SQLException, IOException;
    public Boolean updatePasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) throws SQLException, IOException;
    public Boolean deletePasajeroFrecuente(int id) throws SQLException, IOException;
    public List<PasajeroFrecuente> findAllPasajeroFrecuente() throws SQLException, IOException;
    public PasajeroFrecuente getPasajeroFrecuente(int id) throws NoSuchIdException, SQLException, IOException;

}
