package com.leonardo.workshopspring.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.workshopspring.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Jane Doe","janedoe@email.com");
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(maria));
		
		return ResponseEntity.ok().body(list);
	}

}
