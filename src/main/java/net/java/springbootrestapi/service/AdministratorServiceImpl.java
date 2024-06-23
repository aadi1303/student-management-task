package net.java.springbootrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springbootrestapi.entity.User;
import net.java.springbootrestapi.repository.UserRepository;

@Service
public class AdministratorServiceImpl implements AdministratorService{

	private UserRepository userRepository;
	
	@Autowired
	public AdministratorServiceImpl(UserRepository userRepository)
	{
		this.userRepository = userRepository;
	}
	@Override
	public User createUser(User user) {
		User createUser = userRepository.save(user);
		return createUser;
	}

	@Override
	public List<User> getAllUser() {
		List<User> users = userRepository.findAll();
		return users;
	}

}
