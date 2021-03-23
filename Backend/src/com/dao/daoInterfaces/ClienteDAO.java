package com.dao.daoInterfaces;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import com.domain.Cliente;
import com.exceptions.NoSuchIdException;

public interface ClienteDAO {
	
	    public Boolean addCliente(Cliente cliente) throws SQLException, IOException;
	    public Boolean updateCliente(Cliente cliente) throws SQLException, IOException;
	    public Boolean deleteCliente(int id) throws SQLException, IOException;
	    public List<Cliente> findAllCliente() throws SQLException, IOException;
	    public Cliente getCliente(int id) throws NoSuchIdException, SQLException, IOException;
	    

}
