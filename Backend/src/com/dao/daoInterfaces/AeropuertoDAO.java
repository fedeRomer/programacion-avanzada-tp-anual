package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Aeropuerto;
import com.exceptions.NoSuchIdException;

public interface AeropuertoDAO {
	
	public void addAeropuerto(Aeropuerto aeropuerto);
	public Aeropuerto updateAeropuerto(Aeropuerto aeropuerto);
	public void deleteAeropuerto(int id);
	public List<Aeropuerto> findAllAeropuertos();
	public Aeropuerto getAeropuerto(int id) throws NoSuchIdException;
}
