package com.renato.apicriticas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renato.apicriticas.domain.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
