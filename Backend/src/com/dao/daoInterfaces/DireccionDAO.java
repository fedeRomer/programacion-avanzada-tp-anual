package com.dao.daoInterfaces;

import java.util.List;

import com.domain.Direccion;
import com.exceptions.NoSuchIdException;

public interface DireccionDAO {

	public void addDireccion(Direccion direccion);
    public Direccion updateDireccion(Direccion direccion);
    public void deleteDireccion(int id);
    public List<Direccion> findAllDireccion();
    public Direccion getDireccion(int id) throws NoSuchIdException;
}
