package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Aeropuerto;
import com.exceptions.NoSuchIdException;

public interface AeropuertoDAO {
	
	public Boolean addAeropuerto(Aeropuerto aeropuerto) throws SQLException, IOException;
	public Boolean updateAeropuerto(Aeropuerto aeropuerto) throws SQLException, IOException;
	public Boolean deleteAeropuerto(int id) throws SQLException, IOException;
	public List<Aeropuerto> findAllAeropuertos() throws SQLException, IOException;
	public Aeropuerto getAeropuerto(int id) throws NoSuchIdException, SQLException, IOException;
}
