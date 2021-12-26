package com.CaseStudy.loginservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.CaseStudy.loginservice.model.Userdb;

public interface UserRepository extends MongoRepository<Userdb, Integer> {

	
	
	
	

}