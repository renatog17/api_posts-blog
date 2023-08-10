package com.renato.apicriticas.controller.dto;

import java.util.List;

import com.renato.apicriticas.domain.Post;

public record DadosDetalhamentoPost( Long id,
		String titulo,
		String urlImg,
		String texto,
		List<String> Tags
		) {

	public DadosDetalhamentoPost(Post post) {
		this(post.getId(),
				post.getTitulo(),
				post.getUrlImg(),
				post.getTexto(),
				post.getTags());
	}
}
