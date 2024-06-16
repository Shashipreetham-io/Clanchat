package net.app.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.app.pack.entity.LoginUser;
import net.app.pack.entity.User;
import net.app.pack.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public User registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	} 
	
	@PostMapping("/loginUser")
	public ResponseEntity<User> loginUser(@RequestBody LoginUser loginUser){
		return userService.loginUser(loginUser);
	}
	
	@GetMapping("/getAllUsers")
	List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/getUserById/{id}")
	public Optional<User> getUserById(@PathVariable Integer id){
		return userService.getUserById(id);
		
	}
	
	
	

	

}
