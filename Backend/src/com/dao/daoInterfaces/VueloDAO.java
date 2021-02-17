package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Vuelo;
import com.exceptions.NoSuchIdException;

public interface VueloDAO {
	
    public void addVuelo(Vuelo vuelo);
    public Vuelo updateVuelo(Vuelo vuelo);
    public void deleteVuelo(int idVuelo);
    public List<Vuelo> findAllvuelos();
    public Vuelo getVuelo(int idVuelo) throws NoSuchIdException;


}
