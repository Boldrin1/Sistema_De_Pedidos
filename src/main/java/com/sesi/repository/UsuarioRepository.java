package com.sesi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

}
