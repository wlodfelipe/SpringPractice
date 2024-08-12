package com.clothing_store.Service;

import com.clothing_store.Entity.ProdutoEntity;
import com.clothing_store.Repository.FuncionarioRepository;
import com.clothing_store.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoEntity save(ProdutoEntity produtoEntity){
        return produtoRepository.save(produtoEntity);
    }

    public List<ProdutoEntity> produtoPorPreco(){
        return produtoRepository.produtoPorPreco();
    }

    public String delete(Long id){
        try {
            produtoRepository.deleteById(id);
            return "Deletado";
        } catch (Exception error){
            return "Erro ao deletar";
        }
    }
}
