package com.sesi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProdutoController {

	@GetMapping("/home")
	public String mostrarHome() {
		return "home";
	}
}
