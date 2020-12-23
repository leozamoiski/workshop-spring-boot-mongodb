package com.leonardo.workshopspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.workshopspring.domain.User;
import com.leonardo.workshopspring.dto.UserDTO;
import com.leonardo.workshopspring.repository.UserRepository;
import com.leonardo.workshopspring.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private	UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
	
	public User findById(String id) {
		Optional<User> user = repo.findById(id);
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}else return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
}
