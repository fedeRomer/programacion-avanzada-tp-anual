package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Pais;
import com.exceptions.NoSuchIdException;

public interface PaisDAO {

    public void addPais(Pais pais);
    public Pais updatePais(Pais pais);
    public void deletePais(int id);
    public List<Pais> findAllPais();
    public Pais getPais(int id) throws NoSuchIdException;
}
