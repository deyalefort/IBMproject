package com.project.servidor.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.project.servidor.constants.Constants;
import com.project.servidor.entities.Cliente;
@Repository
public class ClienteDaoImp implements IClienteDao{
	
	@Autowired 
	JdbcTemplate template;

	@Override
	public List<Cliente> getAllClientes() {
		
		String query = "SELECT * FROM tclientes";
		
		return this.template.query(query, new RowMapper<Cliente>() {
            public Cliente mapRow(ResultSet rs, int i) throws SQLException {
            	Cliente cliente = new Cliente();
            	cliente.setIdCliente(rs.getLong("ID_CLIENTE"));
            	cliente.setYourPassion(rs.getString("YOUR_PASSION"));
            	cliente.setMonthSalary(rs.getDouble("MONTH_SALARY"));
            	cliente.setAge(rs.getInt("CLIENT_AGE"));
            	cliente.setTypeCreditCard(rs.getString("CREDIT_CARD"));
            	System.out.println(""+cliente.toString());
            	return cliente;
            	
            }
        });
	}

	@Override
	public void addCliente(Cliente cliente) {
		
		setCreditCard(cliente);
		String query = "INSERT INTO tclientes (YOUR_PASSION, MONTH_SALARY, CLIENT_AGE, CREDIT_CARD) VALUES (?, ?, ?, ?)";
		this.template.update(query, cliente.getYourPassion(), cliente.getMonthSalary(), cliente.getAge(), cliente.getTypeCreditCard());
	}
	
	public void setCreditCard(Cliente cliente) {
		
		CategoriasImp categoria= new CategoriasImp(); 
		String opMyPassion= cliente.getYourPassion().toLowerCase(); 
		
		switch(opMyPassion) {	
			case "shopping":
				cliente.setTypeCreditCard(categoria.shopping(cliente));
				break; 
				
			case "travels": 
				cliente.setTypeCreditCard(categoria.travels(cliente));
				break; 
				
			case "help":
				cliente.setTypeCreditCard(categoria.help(cliente)); 
				break; 	
			case "my business":
				cliente.setTypeCreditCard(categoria.myBusiness(cliente));
				break; 
			case "sports": 
				cliente.setTypeCreditCard(categoria.sports(cliente));
				 break; 
				 
			case "my style": 
				cliente.setTypeCreditCard(categoria.myStyle(cliente));
				break; 
				
			default: cliente.setTypeCreditCard(Constants.ERRORCATEGORIA);
				break; 
		
		}
		
	}
}
