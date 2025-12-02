package com.bazarsarah.sistema.modelos;

import java.time.LocalDateTime;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="vendas")
public class Venda implements Serializable{
	private static final long serialVersionUID = 1l;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long venda_id;
	private String codigo;
	private String forma_pagamento;
	private Integer valor_total;
	public Long getVenda_id() {
		return venda_id;
	}
	public void setVenda_id(Long venda_id) {
		this.venda_id = venda_id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	public Integer getValor_total() {
		return valor_total;
	}
	public void setValor_total(Integer valor_total) {
		this.valor_total = valor_total;
	}
	public LocalDateTime getData_hora() {
		return data_hora;
	}
	public void setData_hora(LocalDateTime data_hora) {
		this.data_hora = data_hora;
	}
	private LocalDateTime data_hora;
	
	
	

	
	
}
