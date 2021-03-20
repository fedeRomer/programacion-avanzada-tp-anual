package com.dao.daoInterfaces;

import java.util.List;

import com.domain.PasajeroFrecuente;
import com.exceptions.NoSuchIdException;

public interface PasajeroFrecuenteDAO {
	
    public void addPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente);
    public PasajeroFrecuente updatePasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente);
    public void deletePasajeroFrecuente(int id);
    public List<PasajeroFrecuente> findAllPasajeroFrecuente();
    public PasajeroFrecuente getPasajeroFrecuente(int id) throws NoSuchIdException;

}
