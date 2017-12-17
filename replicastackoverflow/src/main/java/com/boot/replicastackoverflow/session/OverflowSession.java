package com.boot.replicastackoverflow.session;

import org.springframework.stereotype.Component;

@Component
public class OverflowSession {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
