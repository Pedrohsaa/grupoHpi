package com.bazarsarah.sistema.modelos;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="vendas")
public class Estoque implements Serializable{
	private static final long serialVersionUID = 1l;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long produto_id;
	private String nome;
	private String descricao;
	private Integer preco;
	private long quantidade_estoque;
	private Boolean ativo;
	public Long getProduto_id() {
		return produto_id;
	}
	public void setProduto_id(Long produto_id) {
		this.produto_id = produto_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getPreco() {
		return preco;
	}
	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	public long getQuantidade_estoque() {
		return quantidade_estoque;
	}
	public void setQuantidade_estoque(long quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
