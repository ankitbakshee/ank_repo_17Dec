package com.boot.replicastackoverflow.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logindata")
public class LoginEntity implements Serializable {

	private static final long serialVersionUID = -40855305726412876L;
	@Id
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginEntity(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	

}
