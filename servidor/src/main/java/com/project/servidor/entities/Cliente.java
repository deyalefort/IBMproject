package com.project.servidor.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;



@Entity
@Table(name="tclientes")
@Data
public class Cliente {
	
	@Id // Se usa para poner la llave primaria de mi atributo 
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Se pone la estretegia de incrementar el id.
	@Column(name="id_cliente")
	private Long idCliente;
	
	
	@NotNull
	@Column(name="your_passion")
	private String yourPassion; 
	
	@NotNull
	@Column(name="month_salary")
	private double monthSalary;
	
	@NotNull
	@Column(name="client_age")
	private int age; 
	
	@NotNull
	@Column(name="credit_card")
	private String typeCreditCard;

}

