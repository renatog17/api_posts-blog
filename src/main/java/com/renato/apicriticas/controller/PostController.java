package com.renato.apicriticas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Post>> getFilmes(){
		List<Post> posts = postRepository.findAll();
		return ResponseEntity.ok(posts);
	}
}
