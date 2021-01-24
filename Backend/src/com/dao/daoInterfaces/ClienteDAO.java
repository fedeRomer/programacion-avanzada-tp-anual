package com.dao.daoInterfaces;
import java.util.*;

import com.exceptions.NoSuchIdException;
import com.domain.Cliente;

public interface ClienteDAO {
	
	    public void addCliente(Cliente cliente);
	    public Cliente updateCliente(Cliente usuario);
	    public void deleteCliente(int idUsuario);
	    public List<Cliente> findAllCliente();
	    public Cliente getCliente(int idUsuario) throws NoSuchIdException;
	    

}
