package com.project.servidor.service;

import java.util.List;

import com.project.servidor.entities.Cliente;

public interface IClienteService {
	
	List<Cliente>getAllClientes(); 
	String postCliente(Cliente cliente); 
	
	
}
