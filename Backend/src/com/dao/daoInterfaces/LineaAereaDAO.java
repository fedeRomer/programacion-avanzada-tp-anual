package com.dao.daoInterfaces;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.domain.LineaAerea;
import com.exceptions.NoSuchIdException;

public interface LineaAereaDAO {

	public Boolean addLineaAerea(LineaAerea lineaAerea) throws SQLException, IOException;
    public Boolean updateLineaAerea(LineaAerea lineaAerea) throws SQLException, IOException;
    public Boolean deleteLineaAerea(int id) throws SQLException, IOException;
    public List<LineaAerea> findAllLineaAerea() throws SQLException, IOException;
    public LineaAerea getLineaAerea(int id) throws NoSuchIdException, SQLException, IOException;
}
