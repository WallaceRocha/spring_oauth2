package com.example.springsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsocial.model.Produtos;
import com.example.springsocial.service.ProdutosService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private ProdutosService produtosService;
	
	@GetMapping("/testString")
    public List<Produtos> getTestString() {
        return produtosService.findAllProdutos();
    }
	
	@GetMapping("/testStringx")
    public Produtos getTestStringx() throws ObjectNotFoundException {
        return produtosService.findById(1);
    }

}
