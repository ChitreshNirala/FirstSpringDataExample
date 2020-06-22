package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository repository;
	
	@GetMapping("/bulkcreate")
	public String bulkCreate() {
		repository.save(new Customer( "Jack", "Daniel"));
		
		repository.saveAll(Arrays.asList(new Customer("Priti", "Patrick"),
				new Customer("James", "Patrick"),
				new Customer("Chitresh", "Nirala")));
		
		return "customer are created";
		
	}
	
	@PostMapping("/create")
	public String create(@RequestBody Customer customer) {
		
		repository.save(new Customer(customer.getFirstName(), customer.getLastName()));
		return "customer is created";
	}
	
	@GetMapping("/findAll")
	public List<Customer> findAll(){
		List<Customer> customers = repository.findAll();
		List<Customer> customerUI = new ArrayList<Customer>();
		for (Customer customer : customers) {
			customerUI.add(new Customer(customer.getId(),customer.getFirstName(),customer.getLastName()));
			
		}
		return customerUI;
	} 
	
	@RequestMapping("/serach/{id}")
	public String search( @PathVariable long id) {
		String customer="";
		customer = repository.findById(id).toString();
		return customer;
	}
	
	@RequestMapping("/searchByFirstName/{firstName}")
	public List<Customer> fetchDataByFirstName(@PathVariable String firstName) {
		List<Customer> customers= repository.findByFirstName(firstName);
		List<Customer> customerUI = new ArrayList<Customer>();
		for (Customer customer : customers) {
			customerUI.add(new Customer(customer.getId(),customer.getFirstName(),customer.getLastName()));
		}
		return customerUI;
		
	}

}
