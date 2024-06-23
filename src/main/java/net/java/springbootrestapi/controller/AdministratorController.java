package net.java.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springbootrestapi.entity.User;
import net.java.springbootrestapi.service.AdministratorService;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {
	
	private AdministratorService administratorService;
	
	@Autowired
	public AdministratorController(AdministratorService administratorService)
	{
		this.administratorService = administratorService;
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User u = administratorService.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(u);
	}

	@GetMapping("/usersAdminist")
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> users = administratorService.getAllUser();
		return ResponseEntity.ok(users);
	}
	
	
}
