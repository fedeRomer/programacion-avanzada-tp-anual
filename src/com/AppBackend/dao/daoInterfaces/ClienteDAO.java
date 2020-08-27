package com.AppBackend.dao.daoInterfaces;
import java.util.*;

import com.AppBackend.exceptions.NoSuchIdException;
import com.AppBackend.domain.Cliente;

public interface ClienteDAO {
	
	    public void addCliente(Cliente cliente);
	    public Cliente updateCliente(Cliente usuario);
	    public void deleteCliente(int idUsuario);
	    public List<Cliente> findAllCliente();
	    public Cliente getCliente(int idUsuario) throws NoSuchIdException;
	    

}
