package com.bazarsarah.sistema.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bazarsarah.sistema.modelos.Estoque;

public interface EstoqueRepositorio extends JpaRepository <Estoque, Long> {
	
}
