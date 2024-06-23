package net.java.springbootrestapi.service;

import java.util.List;

import net.java.springbootrestapi.entity.User;

public interface AdministratorService {
	User createUser(User user);
	List<User> getAllUser();
	
}
