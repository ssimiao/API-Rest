package com.produtos.apirest.service;

import com.produtos.apirest.model.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public Produto searchByID(Short ID){
        Optional<Produto> resultado = produtoRepository.findById(ID);
        if(!resultado.isPresent())
            throw new RuntimeException("Categoria Não encontrada");
        return resultado.get();
    }

    public List<Produto> listAll(){
        return produtoRepository.findAll();
    }

    public Produto save(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto delete(Produto produto){
        produtoRepository.delete(produto);
        return produto;
    }
}
