package com.renato.apicriticas.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.renato.apicriticas.controller.dto.DadosAtualizacaoPost;
import com.renato.apicriticas.controller.dto.DadosCriacaoPost;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Post")
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String urlImg;
	@Column(length = 1000)
	private String texto;
	@ElementCollection
	private List<String> tags = new ArrayList<String>();
	private Boolean ativo;


	public Post(String titulo, String urlImg, String texto, List<String> tags) {
		super();
		this.titulo = titulo;
		this.urlImg = urlImg;
		this.texto = texto;
		this.tags = tags;
		this.ativo = true;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(DadosCriacaoPost dados) {
		this.texto = dados.texto();
		this.titulo = dados.titulo();
		this.urlImg = dados.urlImg();
		this.tags = dados.tags();
		this.ativo = true;
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public String getTexto() {
		return texto;
	}

	public List<String> getTags() {
		return tags;
	}

	public Boolean getAtivo() {
		return ativo;
	}
	public void excluir() {
		this.ativo = false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}

	public void atualizarInformacoes(DadosAtualizacaoPost dados) {
		if(dados.texto()!=null) {
			this.texto = dados.texto();
		}
		if(dados.titulo()!=null) {
			this.titulo = dados.titulo();
		}
		if(dados.texto()!=null) {
			this.texto = dados.texto();
		}
		if(dados.tags()!=null) {
			this.tags = dados.tags();
		}
	}

}
