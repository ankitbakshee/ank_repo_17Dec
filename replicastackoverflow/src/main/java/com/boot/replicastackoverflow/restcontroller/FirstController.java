package com.boot.replicastackoverflow.restcontroller;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.replicastackoverflow.entity.LoginEntity;
import com.boot.replicastackoverflow.service.AuthorizationService;
import com.boot.replicastackoverflow.session.OverflowSession;

@RestController
public class FirstController {

	@Autowired
	private AuthorizationService authorizationService;
	
	@Autowired
	private OverflowSession overflowSession;
	
	private String userToken;
	
	@PostMapping(path="/test",consumes=MediaType.TEXT_PLAIN, produces=MediaType.TEXT_PLAIN)
	@ResponseBody
	public String testMessage(@RequestBody String value) {
		Object userDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
		System.out.println(userDetails.toString()+"LOgged in value");
		System.out.println("inside controller login value: "+ value);
		userToken = authorizationService.loginAuthentication(value);
		return userToken;
	}
	
	@GetMapping(path="/home", produces=MediaType.TEXT_PLAIN)
	@ResponseBody
    public String home() {
		System.out.println(overflowSession.getUsername()+ "home");
        return overflowSession.getUsername();
    }

    @GetMapping(path="/", produces=MediaType.APPLICATION_JSON)
    @ResponseBody
    public List<LoginEntity> admin() {
    	return authorizationService.getLoginData();
        //return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }
}
