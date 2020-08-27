package com.AppBackend.dao.daoInterfaces;

import java.util.List;

import com.AppBackend.domain.Aerolinea;
import com.AppBackend.exceptions.NoSuchIdException;

public interface AerolineaDAO {
	
	public void addAerolinea(Aerolinea a);
	public Aerolinea updateAerolinea(Aerolinea a);
	public void deleteAerolinea(int idAerolinea);
	public List<Aerolinea> findAllAerolinea();
	public Aerolinea getAerolinea(int aerolinea) throws NoSuchIdException;

}
