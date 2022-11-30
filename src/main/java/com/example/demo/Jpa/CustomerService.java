package com.example.demo.Jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired 
	CustomerJpa customerjpa;

	public String getting(CustomerModel customermodel) {
		
		 customerjpa.save(customermodel);
		 
		 return "insert";
	}

	public List geting() {
		
		 return  customerjpa.findAll();
		 
		
	}


	public String geting(CustomerModel customermodel) {
		customerjpa.save(customermodel);
		 
		 return "insert";
	}

	public String del(CustomerModel customermodel) {
		customerjpa.delete(customermodel);
		 
		 return "insert";
	}

//	public String dele(CustomerModel customermodel) {
//		customerjpa.findAllByCname(customermodel);
//		 
//		 return "insert";
//}
}
