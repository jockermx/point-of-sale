/**
 * 
 */
package com.dark.pointofsale.core.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @author el_jocker
 * Entidad que mapea la tabla users
 */
@Entity
@Table(name = "users")
@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6826592828119162921L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser", nullable = false)
	private Integer idUser;
	
	@Column(name = "user", nullable = false, length = 70)
	private String user;
	
	@Column(name = "password", nullable = false, length = 100)
	private String password;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "lastName", nullable = false, length = 50)
	private String lastName;
	
	@Column(name = "email", nullable = false, length = 70)
	private String email;
	
	@Column(name = "role", nullable = false)
	private Integer role;
	
	@Column(name = "status", nullable = false)
	private Boolean status;
	
	@Column(name = "creationDate", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@Nullable
	private Date creationDate;
}
