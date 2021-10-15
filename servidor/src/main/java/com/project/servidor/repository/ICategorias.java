package com.project.servidor.repository;

import com.project.servidor.entities.Cliente;

public interface ICategorias {
	
	String shopping(Cliente cliente);
	String travels(Cliente cliente);
	String help(Cliente cliente);
	String myBusiness(Cliente cliente);
	String sports(Cliente cliente);
	String myStyle(Cliente cliente);
}
