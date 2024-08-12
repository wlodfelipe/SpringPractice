package com.clothing_store.Controller;

import com.clothing_store.Entity.ProdutoEntity;
import com.clothing_store.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/save")
    public ProdutoEntity save(@RequestBody ProdutoEntity produtoEntity){
        return produtoService.save(produtoEntity);
    }

    @GetMapping("/produtoPorPreco")
    public List<ProdutoEntity> produtoPorPreco(){
        return produtoService.produtoPorPreco();
    }
}
