package com.boot.replicastackoverflow.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boot.replicastackoverflow.entity.LoginEntity;

public interface AuthenticationRepository extends CrudRepository<LoginEntity, String> {
	
	@Query("select t.username from LoginEntity t where t.username=?1 and t.password=?2")
	public LoginEntity validateUser(String u,String p);

}
