package com.example.demo.Jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cus")
public class CustomerController {
	
	@Autowired
	CustomerService Customerservice;
	@PostMapping("/post")
	public String get(@RequestBody CustomerModel customermodel) {
		
		return Customerservice.getting( customermodel );
	}
	
	@GetMapping("/get")
	public List geting() {
		return Customerservice.geting( );
	}
	
	@PutMapping("/put")
	public String puting(@RequestBody CustomerModel customermodel) {
		return Customerservice.geting(customermodel );
	}

	@DeleteMapping("/del")
	public String deleting(@RequestBody CustomerModel customermodel) {
		return Customerservice.del(customermodel );
	}
	
//	@DeleteMapping("/deln")
//	public String deletingn(@RequestBody CustomerModel customermodel) {
//		return Customerservice.dele(customermodel );
//	}
	
}
