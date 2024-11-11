package com.mateusweb.workshopmongo.services;

import com.mateusweb.workshopmongo.domain.Post;
import com.mateusweb.workshopmongo.domain.User;
import com.mateusweb.workshopmongo.dto.UserDTO;
import com.mateusweb.workshopmongo.repository.PostRepository;
import com.mateusweb.workshopmongo.repository.UserRepository;
import com.mateusweb.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
