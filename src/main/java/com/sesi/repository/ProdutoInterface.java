package com.sesi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.model.Produto;

public interface ProdutoInterface extends JpaRepository<Produto,Integer>{

}
