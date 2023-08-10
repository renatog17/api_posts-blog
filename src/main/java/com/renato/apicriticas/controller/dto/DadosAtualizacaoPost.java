package com.renato.apicriticas.controller.dto;

import java.util.List;

public record DadosAtualizacaoPost(String titulo,
		String urlImg,
		String texto, 
		List<String> tags) {

}
