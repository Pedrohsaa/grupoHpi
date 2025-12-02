package com.bazarsarah.sistema.controle;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bazarsarah.sistema.repositorios.EstoqueRepositorio;

@Controller
public class EstoqueControle {
	
	@Autowired 
	private EstoqueRepositorio estoqueRepositorio;
	
	@GetMapping("/estoque")
	public ModelAndView cadastrar(Item item) {
		ModelAndView mv = new ModelAndView("/administrativo/estoque/estoque.html");
		mv.addObject("Item", item);
		return mv;
	}

}
