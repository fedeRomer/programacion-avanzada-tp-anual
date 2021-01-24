package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.Aerolinea;
import com.exceptions.NoSuchIdException;

public interface AerolineaDAO {
	
	public boolean addAerolinea(Aerolinea a) throws IOException, SQLException;
	public Aerolinea updateAerolinea(Aerolinea a);
	public void deleteAerolinea(int idAerolinea) throws SQLException, IOException;
	public List<Aerolinea> findAllAerolinea() throws SQLException, IOException;
	public Aerolinea getAerolinea(int aerolinea) throws NoSuchIdException;

}
