package com.produtos.apirest.repository;

import com.produtos.apirest.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Short> {
}
