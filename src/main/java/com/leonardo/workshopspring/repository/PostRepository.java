package com.leonardo.workshopspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leonardo.workshopspring.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
