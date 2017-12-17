package com.boot.replicastackoverflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.replicastackoverflow.entity.LoginEntity;
import com.boot.replicastackoverflow.repository.AuthenticationRepository;
import com.boot.replicastackoverflow.session.OverflowSession;
import com.boot.replicastackoverflow.util.OverflowUtil;

@Service
public class AuthorizationService {

	@Autowired
	private OverflowSession overflowSession;
	
	@Autowired
	private OverflowUtil overflowUtil;
	
	@Autowired
	private AuthenticationRepository authenticationRepo;
	
	public String loginAuthentication(String value) {
		System.out.println("inside service: "+value);
		overflowSession.setUsername(overflowUtil.separateUsername(value));
		System.out.println(authenticationRepo.findOne(overflowSession.getUsername())+":  login");
		return value;
	}
	
	public List<LoginEntity> getLoginData(){
		
		return (List<LoginEntity>) authenticationRepo.findAll();
	}
}
