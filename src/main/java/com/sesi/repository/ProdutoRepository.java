package com.sesi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Integer>{

	Optional<Produto> findById(Long id);


}
