package com.renato.apicriticas.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.renato.apicriticas.controller.dto.DadosAtualizacaoPost;
import com.renato.apicriticas.controller.dto.DadosCriacaoPost;
import com.renato.apicriticas.controller.dto.DadosDetalhamentoPost;
import com.renato.apicriticas.domain.Post;
import com.renato.apicriticas.repository.PostRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	private PostRepository postRepository;

	@CrossOrigin
	@GetMapping
	public Page<Post> getFilmes(@PageableDefault(size = 4) Pageable paginacao) {
		return postRepository.findAllByAtivoTrue(paginacao);
	}

	@PostMapping
	@Transactional
	public ResponseEntity<DadosDetalhamentoPost> postPost(@RequestBody DadosCriacaoPost dados,
			UriComponentsBuilder uriBuilder) {
		Post post = new Post(dados);
		postRepository.save(post);
		URI uri = uriBuilder.path("posts/{id}").buildAndExpand(post.getId()).toUri();
		return ResponseEntity.created(uri).body(new DadosDetalhamentoPost(post));
	}

	@GetMapping("/{id}")
	public ResponseEntity<DadosDetalhamentoPost> getPost(@PathVariable Long id) {
		Post post = postRepository.getReferenceById(id);
		if (!post.getAtivo()) {
			throw new EntityNotFoundException();
		}
		return ResponseEntity.ok(new DadosDetalhamentoPost(post));
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<DadosDetalhamentoPost> putPost(@PathVariable Long id,
			@RequestBody DadosAtualizacaoPost dados) {
		Post post = postRepository.getReferenceById(id);
		post.atualizarInformacoes(dados);
		return ResponseEntity.ok(new DadosDetalhamentoPost(post));
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> deletePost(@PathVariable Long id){
		Post post = postRepository.getReferenceById(id);
		post.excluir();
		return ResponseEntity.noContent().build();
	}
	
}
