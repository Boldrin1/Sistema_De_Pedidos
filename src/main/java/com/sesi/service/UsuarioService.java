package com.sesi.service;

import org.springframework.stereotype.Service;

import com.sesi.model.Usuario;
import com.sesi.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
	private final UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}



	public Usuario salvarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
