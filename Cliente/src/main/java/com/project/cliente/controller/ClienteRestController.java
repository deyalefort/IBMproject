package com.project.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.cliente.model.Cliente;
import com.project.cliente.service.IClienteServicio;

@RestController
public class ClienteRestController {
	
	@Autowired
	IClienteServicio clienteServicio; 
	
	@GetMapping("/get-all-clientes")
	public List<Cliente> getAllClientes(){
		return clienteServicio.getAllClientes();
	}
	
	@PostMapping("/add-cliente")
	public String addCliente(@RequestBody Cliente cliente) {
		return clienteServicio.addCliente(cliente);
	}
}
