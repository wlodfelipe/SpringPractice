package com.clothing_store.Service;

import com.clothing_store.Entity.ClienteEntity;
import com.clothing_store.Entity.FuncionarioEntity;
import com.clothing_store.Repository.ClienteRepository;
import com.clothing_store.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioEntity save(FuncionarioEntity funcionarioEntity){
        return funcionarioRepository.save(funcionarioEntity);
    }

    public FuncionarioEntity findbyName(String nome){
        return funcionarioRepository.findbyName(nome);
    }

    public String delete(Long id){
        try {
            funcionarioRepository.deleteById(id);
            return "Deletado";
        } catch (Exception error){
            return "Erro ao deletar";
        }
    }
}
