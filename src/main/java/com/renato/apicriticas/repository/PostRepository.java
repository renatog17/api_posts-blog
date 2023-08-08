package com.renato.apicriticas.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.apicriticas.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

	Page<Post> findAll(Pageable page);
}
