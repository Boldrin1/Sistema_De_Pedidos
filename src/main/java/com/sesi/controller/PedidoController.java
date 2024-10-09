package com.sesi.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.model.Pedido;
import com.sesi.service.PedidoService;
import com.sesi.service.ProdutoService;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService;
    private final ProdutoService produtoService;

    public PedidoController(PedidoService pedidoService, ProdutoService produtoService) {
        this.pedidoService = pedidoService;
        this.produtoService = produtoService;
    }

    @GetMapping("/novo/{id}")
    public String novoPedido(Model model) {
        model.addAttribute("produtos", produtoService.listarProdutos());
        return "Pedido"; 
    }

    @PostMapping("/salvar")
    public String salvarPedido(@ModelAttribute Pedido pedido) {
        pedidoService.salvarPedido(pedido);
        return "redirect:/home"; 
    }
}
