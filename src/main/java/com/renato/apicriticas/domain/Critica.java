package com.renato.apicriticas.domain;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "Critica")
@Table(name = "criticas")
public class Critica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String critica;
	@ManyToOne
	@JoinColumn(name = "id_filme")
	private Filme filme;
	private LocalDate dataCritica;
	
	public Critica(String critica, Filme filme, LocalDate dataCritica) {
		super();
		this.critica = critica;
		this.filme = filme;
		this.dataCritica = dataCritica;
	}
	public Critica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public String getCritica() {
		return critica;
	}
	public Filme getFilme() {
		return filme;
	}
	public LocalDate getDataCritica() {
		return dataCritica;
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
		Critica other = (Critica) obj;
		return Objects.equals(id, other.id);
	}
}
