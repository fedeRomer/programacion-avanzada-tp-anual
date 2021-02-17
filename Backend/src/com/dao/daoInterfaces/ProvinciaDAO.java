package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Provincia;
import com.exceptions.NoSuchIdException;

public interface ProvinciaDAO {

    public void addProvincia(Provincia Provincia);
    public Provincia updateProvincia(Provincia Provincia);
    public void deleteProvincia(int id);
    public List<Provincia> findAllProvincia();
    public Provincia getProvincia(int id) throws NoSuchIdException;
}
