package com.MR.MR.Backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MR.MR.Backend.Model.User;
import com.MR.MR.Backend.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	 @PostMapping("/add")
	    public String add(@RequestBody User user){
	        userService.saveUser(user);
	        return "New User is added";
	    }
	 @GetMapping("/getAll")
	    public List<User>list(){
	        return userService.getAllUsers();
	    }

	
}
