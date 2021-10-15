package com.project.servidor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.servidor.entities.Cliente;
import com.project.servidor.repository.IClienteDao;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao; 
	
	@Override
	public List<Cliente> getAllClientes() {
		
		return clienteDao.getAllClientes();
	}

	@Override
	public String postCliente(Cliente cliente) {
		clienteDao.addCliente(cliente);
		System.out.println(""+cliente.toString());
		return "200 OK - Opciones de tarjeta: "+cliente.getTypeCreditCard();
	}
	
	
}
	