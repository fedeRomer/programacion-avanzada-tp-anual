package com.dao.daoInterfaces;

import java.util.List;

import com.domain.LineaAerea;
import com.exceptions.NoSuchIdException;

public interface LineaAereaDAO {

	public void addLineaAerea(LineaAerea lineaAerea);
    public LineaAerea updateLineaAerea(LineaAerea lineaAerea);
    public void deleteLineaAerea(int id);
    public List<LineaAerea> findAllLineaAerea();
    public LineaAerea getLineaAerea(int id) throws NoSuchIdException;
}
