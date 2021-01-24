package com.dao.daoInterfaces;
import java.util.List;

import com.exceptions.NoSuchIdException;
import com.domain.Vuelo;

public interface VuelosDAO {
	
	    public void addVuelo(Vuelo vuelo);
	    public Vuelo updateVuelo(Vuelo vuelo);
	    public void deleteVuelo(int idVuelo);
	    public List<Vuelo> findAllvuelos();
	    public Vuelo getVuelo(int idVuelo) throws NoSuchIdException;

}
