package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Alianza;
import com.exceptions.NoSuchIdException;

public interface AlianzaDAO {
	
	public void addAlianza(Alianza alianza);
	public Alianza updateAlianza(Alianza alianza);
	public void deleteAlianza(int id);
	public List<Alianza> findAllAlianza();
	public Alianza getAlianza(int id) throws NoSuchIdException;
	
	
}
