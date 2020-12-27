package com.leonardo.workshopspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.workshopspring.domain.Post;
import com.leonardo.workshopspring.repository.PostRepository;
import com.leonardo.workshopspring.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private	PostRepository repo;
	

	
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		if (post == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}else return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
 
}
