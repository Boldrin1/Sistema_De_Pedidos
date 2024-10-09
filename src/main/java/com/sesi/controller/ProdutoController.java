package com.sesi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.sesi.model.Produto;
import com.sesi.service.ProdutoService;



@Controller
@RequestMapping("/home")
public class ProdutoController {

	private ProdutoService produtoService;
	
	
	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}



	@GetMapping
	public String home(Model modelo) {
		modelo.addAttribute("produtos",produtoService.listarProdutos());
		return "home";
	}
	
	@GetMapping("/adicionarProduto")
	public String ADproduto() {
		return "adicionarProduto";
	}
	
	@PostMapping("/salvar")
	public String salvarProduto(@ModelAttribute Produto produto) {
		produtoService.adicionarProduto(produto);
		return "redirect:/home";
	}
	
   @GetMapping("/editarProduto/{id}")
   public String editarProdutoForm(@PathVariable Long id, Model model) {
       Produto produto = produtoService.encontrarProdutoPorId(id);
       model.addAttribute("produto", produto);
       return "editarProduto"; 
   }
   
   @PostMapping("/salvarEditar")
   public String salvarEditar(@ModelAttribute Produto produto){
	       if (produtoService.encontrarProdutoPorId(produto.getId()) != null) {
	           produtoService.atualizarProduto(produto);
	       }
	       return "redirect:/home"; 
   }
   
   @GetMapping("/excluir/{id}")
   public String excluirProduto(@PathVariable Integer id) {
       produtoService.excluirProduto(id);
       return "redirect:/home"; // Redireciona para a página inicial após excluir
   }
	
}
