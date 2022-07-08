/**
 * 
 */
package com.dark.pointofsale.core.service;

import java.util.List;

import com.dark.pointofsale.core.persistence.entity.User;

/**
 * @author el_jocker
 *
 */
public interface UserService {
	
	/**
	 * Retorna lista de usuarios activos
	 * @return List<User>
	 */
	List<User> getAllActive();
	
	/**
	 * Inserta un nuevo usuario
	 * @param user
	 * @return boolean
	 */
	User add(User user);
}
