package com.project.servidor.repository;

import com.project.servidor.constants.Constants;
import com.project.servidor.entities.Cliente;

public class CategoriasImp implements ICategorias {

	@Override
	public String shopping(Cliente cliente) {
		String typeCreditCard="";
		if(cliente.getMonthSalary() >= 7000 && cliente.getMonthSalary() <= 14999) {
			
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				
				typeCreditCard= Constants.TIPOTARJETA1 + Constants.TIPOTARJETA2; 	
			}else if(cliente.getAge()>=24 && cliente.getAge()<=32) {
				typeCreditCard= Constants.TIPOTARJETA1+Constants.TIPOTARJETA2+Constants.TIPOTARJETA3+Constants.TIPOTARJETA4+
						Constants.TIPOTARJETA5+Constants.TIPOTARJETA6+Constants.TIPOTARJETA7; 	
			}else if(cliente.getAge()>=33 && cliente.getAge()<=75) {
				typeCreditCard= Constants.TIPOTARJETA3+Constants.TIPOTARJETA4+Constants.TIPOTARJETA5+Constants.TIPOTARJETA6+
						Constants.TIPOTARJETA7;
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
				
		}else if(cliente.getMonthSalary() >= 15000 && cliente.getMonthSalary() <= 34999) {
			
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				typeCreditCard= Constants.TIPOTARJETA1+Constants.TIPOTARJETA2; 	
			}else if(cliente.getAge()>=24 && cliente.getAge()<=32) {
				typeCreditCard=Constants.TIPOTARJETA8+Constants.TIPOTARJETA2+Constants.TIPOTARJETA4+Constants.TIPOTARJETA5+
						Constants.TIPOTARJETA6+Constants.TIPOTARJETA7; 	
			}else if(cliente.getAge()>=33 && cliente.getAge()<=75) {
				typeCreditCard= Constants.TIPOTARJETA8+Constants.TIPOTARJETA4+Constants.TIPOTARJETA5+Constants.TIPOTARJETA6+
						Constants.TIPOTARJETA7;
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
			
		}else if(cliente.getMonthSalary() >= 35000 && cliente.getMonthSalary() <= 49999) {
			
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				typeCreditCard= Constants.TIPOTARJETA1+Constants.TIPOTARJETA2; 	
			}else if(cliente.getAge()>=24 && cliente.getAge()<=75) {
				typeCreditCard=Constants.TIPOTARJETA9+Constants.TIPOTARJETA4+Constants.TIPOTARJETA5+
						Constants.TIPOTARJETA6+Constants.TIPOTARJETA7; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
			
			
		}else if(cliente.getMonthSalary() >= 50000) {
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				typeCreditCard= Constants.TIPOTARJETA1+Constants.TIPOTARJETA2; 	
			}else if(cliente.getAge()>=24 && cliente.getAge()<=75) {
				typeCreditCard=Constants.TIPOTARJETA9; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else {
			typeCreditCard=Constants.ERRORMONTO;
		}
		return typeCreditCard;
	}
   //TRAVELS
	@Override
	public String travels(Cliente cliente) {
		String typeCreditCard="";
		if(cliente.getMonthSalary() >= 12000 && cliente.getMonthSalary() <= 29999) {
			if(cliente.getAge()>=18 && cliente.getAge()<=75) {
				
				typeCreditCard= Constants.TIPOTARJETA10;
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
			
		}else if(cliente.getMonthSalary() >= 30000 && cliente.getMonthSalary() <= 34999) {
			
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				typeCreditCard= Constants.TIPOTARJETA10; 	
			}else if(cliente.getAge()>=24 && cliente.getAge()<=75) {
				typeCreditCard=Constants.TIPOTARJETA10+Constants.TIPOTARJETA9; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
			
		}else if(cliente.getMonthSalary() >= 35000 && cliente.getMonthSalary() <= 49999) {
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				typeCreditCard= Constants.TIPOTARJETA10; 	
			}else if(cliente.getAge()>=24 && cliente.getAge()<=75) {
				typeCreditCard=Constants.TIPOTARJETA10+Constants.TIPOTARJETA9; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else if(cliente.getMonthSalary() >= 50000) {
			if(cliente.getAge()>=18 && cliente.getAge()<=22) {
				typeCreditCard= Constants.TIPOTARJETA10; 	
			}else if(cliente.getAge()>=23 && cliente.getAge()<=75) {
				typeCreditCard=Constants.TIPOTARJETA9; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else {
			typeCreditCard=Constants.ERRORMONTO;
		}
		return typeCreditCard;
	}
	//HELP
	@Override
	public String help(Cliente cliente) {
		String typeCreditCard="";
		if(cliente.getMonthSalary() >= 12000) {
			
			if(cliente.getAge()>=18 && cliente.getAge()<=75) {				
				typeCreditCard= Constants.TIPOTARJETA11+Constants.TIPOTARJETA12; 	 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else {
			typeCreditCard=Constants.ERRORMONTO;
		}
		return typeCreditCard;
	}
	//BUSSINES
	@Override
	public String myBusiness(Cliente cliente) {
		String typeCreditCard="";
		if(cliente.getMonthSalary() >= 7000) {
			
			if(cliente.getAge()>=18 && cliente.getAge()<=75) {				
				typeCreditCard= Constants.TIPOTARJETA4+Constants.TIPOTARJETA5+Constants.TIPOTARJETA6+Constants.TIPOTARJETA7; 	 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else {
			typeCreditCard=Constants.ERRORMONTO;
		}
		return typeCreditCard;
	}
	//SPORTS
	@Override
	public String sports(Cliente cliente) {
		String typeCreditCard="";
		if(cliente.getMonthSalary() >= 7000 && cliente.getMonthSalary() <= 34999) {
			
			if(cliente.getAge()>=18 && cliente.getAge()<=75) {				
				typeCreditCard= Constants.TIPOTARJETA13+Constants.TIPOTARJETA14+Constants.TIPOTARJETA18+Constants.TIPOTARJETA15+Constants.TIPOTARJETA16; 	 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else if(cliente.getMonthSalary() >= 35000) {
			if(cliente.getAge()>=18 && cliente.getAge()<=75) {				
				typeCreditCard= Constants.TIPOTARJETA17; 	 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else {
			typeCreditCard=Constants.ERRORMONTO;
		}
		return typeCreditCard;
	}

	@Override
	public String myStyle(Cliente cliente) {
		String typeCreditCard="";
		
		if(cliente.getMonthSalary() >= 7000 && cliente.getMonthSalary() <= 14999) {
			
			if(cliente.getAge()>=18 && cliente.getAge()<=32) {
				typeCreditCard= Constants.TIPOTARJETA1+Constants.TIPOTARJETA2; 	
				
			}else if(cliente.getAge()>=33 && cliente.getAge()<=75) {
				typeCreditCard= Constants.TIPOTARJETA1; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else if(cliente.getMonthSalary() >= 15000 && cliente.getMonthSalary() <= 29999) {
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				typeCreditCard= Constants.TIPOTARJETA1+Constants.TIPOTARJETA2; 	
				
			}else if(cliente.getAge()>=24 && cliente.getAge()<=32) {
				typeCreditCard= Constants.TIPOTARJETA1 +Constants.TIPOTARJETA8+Constants.TIPOTARJETA2; 
				
			}else if(cliente.getAge()>=33 && cliente.getAge()<=75) {
				typeCreditCard= Constants.TIPOTARJETA8; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else if(cliente.getMonthSalary() >= 30000 && cliente.getMonthSalary() <= 34999) {
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				typeCreditCard= Constants.TIPOTARJETA1+Constants.TIPOTARJETA2; 	
				
			}else if(cliente.getAge()>=24 && cliente.getAge()<=32) {
				typeCreditCard= Constants.TIPOTARJETA1 +Constants.TIPOTARJETA9+Constants.TIPOTARJETA2; 
				
			}else if(cliente.getAge()>=33 && cliente.getAge()<=75) {
				typeCreditCard= Constants.TIPOTARJETA9; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else if(cliente.getMonthSalary() >= 35000) {
			if(cliente.getAge()>=18 && cliente.getAge()<=23) {
				typeCreditCard= Constants.TIPOTARJETA1; 	
			}else if(cliente.getAge()>=23 && cliente.getAge()<=75) {
				typeCreditCard=Constants.TIPOTARJETA1+Constants.TIPOTARJETA9; 	
			}else {
				typeCreditCard=Constants.ERROREDAD;
			}
		}else {
			typeCreditCard=Constants.ERRORMONTO;
		}
		return typeCreditCard;
	}

}
