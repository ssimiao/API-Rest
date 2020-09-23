package com.produtos.apirest.controller;

import com.produtos.apirest.model.Produto;
import com.produtos.apirest.service.ProdutoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@Api(value = "Api Rest")
@CrossOrigin(origins = "*")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/{id}")
    @ApiOperation(value = "Retorna um produto")
    public Produto listById(@PathVariable Short id){
        return produtoService.searchByID(id);
    }

    @GetMapping
    @ApiOperation(value = "Retorna uma lista de produtos")
    public List<Produto> listAll(){
        return produtoService.listAll();
    }

    @PostMapping
    @ApiOperation(value = "Salva um produto")
    public Produto insert(@RequestBody Produto produto){
        return produtoService.save(produto);
    }

    @PutMapping
    @ApiOperation(value = "Edita um produto")
    public Produto edit(@RequestBody Produto produto){
        return produtoService.save(produto);
    }

    @DeleteMapping
    @ApiOperation(value = "Deleta um produto")
    public Produto delete(@RequestBody Produto produto){
        return produtoService.delete(produto);
    }
}
