package com.AppBackend.dao;
import java.util.*;

import com.AppBackend.domain.Cliente;

public interface daoCliente {
	
	    public void addCliente(Cliente cliente);
	    public Cliente updateCliente(Cliente usuario, String dniUsuario);
	    public void deleteCliente(String dni);
	    public List<Cliente> findAllCliente();
	    public Cliente getCliente(String dni); /*throws NoSuchUserException*/

}
