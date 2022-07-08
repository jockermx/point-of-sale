/**
 * 
 */
package com.dark.pointofsale.core.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dark.pointofsale.core.persistence.entity.User;

/**
 * @author el_jocker
 * Repositorio User
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
