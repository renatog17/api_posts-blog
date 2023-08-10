package com.renato.apicriticas.controller.dto;

import java.util.List;

public record DadosCriacaoPost(String titulo,
		String urlImg,
		String texto, 
		List<String> tags
		){

}
