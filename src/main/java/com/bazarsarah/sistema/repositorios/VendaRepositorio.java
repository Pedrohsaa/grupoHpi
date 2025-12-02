package com.bazarsarah.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bazarsarah.sistema.modelos.Venda;

public interface VendaRepositorio extends JpaRepository <Venda, Long> {
	
}
