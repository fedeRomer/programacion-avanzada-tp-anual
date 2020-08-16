package com.AppBackend.ModelDAO;
import com.AppBackend.Domain.Cliente;
import java.util.*;

public interface daoCliente {
	
	    public void addCliente(Cliente cliente);
	    public Cliente updateCliente(Cliente usuario, String dniUsuario);
	    public void deleteCliente(String dni);
	    public List<Cliente> findAllCliente();
	    public Cliente getCliente(String dni); /*throws NoSuchUserException*/

}
