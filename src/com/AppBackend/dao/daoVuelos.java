package com.AppBackend.dao;
import java.util.List;

import com.AppBackend.domain.Vuelo;

public interface daoVuelos {
	
	    public void addVuelo(Vuelo vuelo);
	    public Vuelo updateVuelo(Vuelo vuelo, int idVuelo);
	    public void deleteVuelo(int idVuelo);
	    public List<Vuelo> findAllvuelos();
	    public Vuelo getVuelo(int idVuelo); /*throws NoSuchUserException*/

}
