package com.dao.daoInterfaces;
import java.util.*;

import com.domain.Cliente;
import com.exceptions.NoSuchIdException;

public interface ClienteDAO {
	
	    public void addCliente(Cliente cliente);
	    public Cliente updateCliente(Cliente cliente);
	    public void deleteCliente(int id);
	    public List<Cliente> findAllCliente();
	    public Cliente getCliente(int id) throws NoSuchIdException;
	    

}
