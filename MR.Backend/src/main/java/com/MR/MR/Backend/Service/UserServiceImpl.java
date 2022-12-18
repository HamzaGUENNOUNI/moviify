package com.MR.MR.Backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MR.MR.Backend.Model.User;
import com.MR.MR.Backend.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User checkUser = userRepository.findByAddress(user.getAddress());
		if(checkUser != null) throw new IllegalStateException("user already exist");
		
		return userRepository.save(user);
	}
	public List<User>getAllUsers(){
		return userRepository.findAll();
	}
	

	
	
}
