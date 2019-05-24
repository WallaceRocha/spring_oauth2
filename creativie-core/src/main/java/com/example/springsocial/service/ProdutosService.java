package com.example.springsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springsocial.model.Produtos;
import com.example.springsocial.repository.ProdutosRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ProdutosService {
	
	
	@Autowired
	private ProdutosRepository repo;
	
	
	
	public List<Produtos> findAllProdutos() {
		List<Produtos> listOfProdutos = this.repo.findAll();
		
		return listOfProdutos;
	}
	
	public Produtos findById(Integer id) throws ObjectNotFoundException {
		Produtos prod = this.repo.findById(id).orElseThrow(()-> 
		new ObjectNotFoundException("Objeto não encontrado Id: "+id+" tipo: " +Produtos.class.getName())
		);
		return prod;
	}

}
