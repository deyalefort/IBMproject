package com.project.servidor.repository;

import java.util.List;

import com.project.servidor.entities.Cliente;

public interface IClienteDao {
	
	List<Cliente>getAllClientes(); 
	void addCliente(Cliente cliente); 
	
	
}
