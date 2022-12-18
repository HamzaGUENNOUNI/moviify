package com.MR.MR.Backend.Service;

import java.util.List;

import com.MR.MR.Backend.Model.User;

public interface UserService {
	public User saveUser(User user);
	public  List<User>getAllUsers();

}
