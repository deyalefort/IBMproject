package com.project.cliente.model;

import lombok.Data;

@Data
public class Cliente {
	
	private Long idCliente;
	private String yourPassion;
	private double monthSalary;
	private int age; 
	private String typeCreditCard;

}
