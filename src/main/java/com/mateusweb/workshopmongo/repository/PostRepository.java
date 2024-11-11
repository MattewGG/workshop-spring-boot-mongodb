package com.mateusweb.workshopmongo.repository;

import com.mateusweb.workshopmongo.domain.Post;
import com.mateusweb.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
