package com.sesi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.model.Usuario;
import com.sesi.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

 
    @GetMapping("/Registro")
    public String novoUsuario(Model modelo) {
        modelo.addAttribute("usuario", new Usuario());  
        return "Registro";  
    }

    @PostMapping("/salvar")
    public String salvarUsuario(@ModelAttribute Usuario usuario) {
    	 System.out.println("Cargo do usuário: " + usuario.getTipoUsuario());
        usuarioService.salvarUsuario(usuario);  
        return "redirect:/home";  
    }
}
