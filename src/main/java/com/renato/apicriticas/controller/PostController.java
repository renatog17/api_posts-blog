package com.renato.apicriticas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renato.apicriticas.domain.Post;
import com.renato.apicriticas.repository.PostRepository;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	private PostRepository postRepository;
	
	@CrossOrigin
	@GetMapping
	public Page<Post> getFilmes( @PageableDefault(size = 4) Pageable paginacao){
		return postRepository.findAll(paginacao);
	}
}
