package com.sesi.model;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @ManyToOne
     private Produto produto;
	 
	 private int quantidade;
	 
	 private Date data;
	 
	 private float valor;
	 
	 @Enumerated(EnumType.STRING)
	 private Status status;
	 
	 public void mudarStatus(Status status) {
		 
	 }

	 
	 
	public Pedido(Produto produto, int quantidade, Date data, float valor, Status status) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;
		this.valor = valor;
		this.status = status;
	}

	
	
	public Pedido() {
	}
	
	
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	 
	 
	 
}
