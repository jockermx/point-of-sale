/**
 * 
 */
package com.dark.pointofsale.core.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dark.pointofsale.core.persistence.entity.User;
import com.dark.pointofsale.core.service.UserService;

import lombok.extern.java.Log;

/**
 * @author el_jo
 *
 */
@RestController
@RequestMapping("/api")
@Log
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/all")
    public List<User> getAllActive(){
        return userService.getAllActive();
    }

    @PostMapping("/user/add")
    public User add(
//            @Param("user") String user,
//            @Param("password") String password,
//            @Param("name") String name,
//            @Param("lastName") String lastName,
//            @Param("email") String email,
//            @Param("role") Integer role,
//            @Param("status") Float status
    		@RequestBody User user
    ){
//        User userRequest = new User();
//        userRequest.setUser(user);
//        userRequest.setPassword(password);
//        userRequest.setName(name);
//        userRequest.setLastName(lastName);
//        userRequest.setEmail(email);
//        userRequest.setRole(role);
//        userRequest.setStatus(status);
    	user.setCreationDate(new Date());
    	log.info("---> USER: " + user.toString());
        
        return userService.add(user);
    }

}
