package com.leonardo.workshopspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.workshopspring.domain.User;
import com.leonardo.workshopspring.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private	UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
}
