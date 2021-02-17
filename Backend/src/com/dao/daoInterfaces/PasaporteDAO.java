package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Pasaporte;
import com.exceptions.NoSuchIdException;

public interface PasaporteDAO {

    public void addPasaporte(Pasaporte Pasaporte);
    public Pasaporte updatePasaporte(Pasaporte Pasaporte);
    public void deletePasaporte(int id);
    public List<Pasaporte> findAllPasaporte();
    public Pasaporte getPasaporte(int id) throws NoSuchIdException;
}
