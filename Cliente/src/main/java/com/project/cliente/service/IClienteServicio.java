package com.project.cliente.service;

import java.util.List;

import com.project.cliente.model.Cliente;

public interface IClienteServicio {
	
	List<Cliente> getAllClientes();
	String addCliente(Cliente persona);
}
