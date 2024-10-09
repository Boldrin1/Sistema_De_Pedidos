package com.sesi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sesi.model.Produto;
import com.sesi.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
	
		this.produtoRepository = produtoRepository;
	}
	
    public List<Produto> listarProdutos() {
    	return produtoRepository.findAll();
    }
    
    public Produto adicionarProduto(Produto produto) {
    	return produtoRepository.save(produto);
    }
    
    public Produto encontrarProdutoPorId(Long id) {
        Optional<Produto> optionalProduto = produtoRepository.findById(id);
        return optionalProduto.orElse(null); // Retorna null se não encontrar
    }

    public Produto atualizarProduto(Produto produto) {
    	return produtoRepository.save(produto);
    }
    
    public void excluirProduto(Integer id) {
        produtoRepository.deleteById(id);
    }
}
