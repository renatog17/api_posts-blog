package com.renato.apicriticas.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Filme")
@Table(name = "filmes")
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long filmeId;
	private String titulo;
	private LocalDate dataLancamento;
	@OneToMany(mappedBy = "filme", fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<Critica> criticas;

	public Filme() {
		super();
	}
	
	public Filme(String titulo, LocalDate dataLancamento) {
		super();
		this.titulo = titulo;
		this.dataLancamento = dataLancamento;
	}

	public Long getId() {
		return filmeId;
	}

	public String getTitulo() {
		return titulo;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(filmeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		return Objects.equals(filmeId, other.filmeId);
	}
}
