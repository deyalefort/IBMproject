package com.project.servidor.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.servidor.constants.Constants;
import com.project.servidor.entities.Cliente;
import com.project.servidor.service.IClienteService;

@RestController
@RequestMapping(Constants.CLIENTE)
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService; 
	
	@GetMapping("/get-clientes")
	public List<Cliente> getAllClientes(){
		return clienteService.getAllClientes();
	}
	
	@PostMapping("/add-cliente")
	public String addCliente(@RequestBody Cliente cliente) {
		return clienteService.postCliente(cliente);
	}
}
