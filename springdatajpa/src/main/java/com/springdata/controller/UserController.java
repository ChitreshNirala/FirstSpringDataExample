package com.springdata.controller;

import java.util.List;

import javax.naming.directory.InvalidAttributeValueException;

import org.apache.catalina.User;
import org.apache.tomcat.util.http.fileupload.InvalidFileNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdata.exception.InvalidException;
import com.springdata.model.Users;
import com.springdata.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/findAll")
	public List<Users> findAll(){
		
		return userRepository.findAll();
	} 
	
	@GetMapping(value="/{name}")
	public Users findByName( @PathVariable String name) {
		return userRepository.findByName(name);
	}
	
	@PostMapping(value="/load")
	public Users load(@RequestBody final Users users) {
		if(StringUtils.isEmpty(users.getSalary()))
			throw new InvalidException("Salary fied is required");
			
		userRepository.save(users);
		
		return userRepository.findByName(users.getName());
	}
	
	
}
