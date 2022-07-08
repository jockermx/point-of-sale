/**
 * 
 */
package com.dark.pointofsale.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dark.pointofsale.core.persistence.entity.User;
import com.dark.pointofsale.core.persistence.repository.UserRepository;
import com.dark.pointofsale.core.service.UserService;

import lombok.extern.java.Log;

/**
 * @author el_jo
 *
 */
@Service("UserService")
@Log
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllActive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User add(User user) {
		return userRepository.save(user);
	}

}
