package springbootvalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springbootvalidation.model.Users;
import springbootvalidation.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/create")
	public Users createUser(@RequestBody Users user){
		
		return userRepository.save(user);
	}

}
