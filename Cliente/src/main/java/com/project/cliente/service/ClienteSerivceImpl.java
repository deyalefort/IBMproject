package com.project.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.cliente.feign.IClienteFeign;
import com.project.cliente.model.Cliente;

@Service
public class ClienteSerivceImpl implements IClienteServicio{
	
	@Autowired
	IClienteFeign clienteFeign; 
	
	@Override
	public List<Cliente> getAllClientes() {
		
		return clienteFeign.getResponseGet();
	}

	@Override
	public String addCliente(Cliente persona) {
		return clienteFeign.getResponsePost(persona);
	}

}
