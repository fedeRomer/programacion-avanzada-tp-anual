package com.AppBackend.ModelDAO;
import com.tpFinal.Cliente;

public interface daoCliente {
	
	public void addcliente();
	
	    public void addUsuario(Cliente cliente);
	    public Cliente updateUsuario(Cliente usuario, String dniUsuario);
	    public void deleteUsuario(String dni);
	    public List<Cliente> findAll();
	    public Cliente getUsuario(String dni) throws NoSuchUserException;

}
