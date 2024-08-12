package com.clothing_store.Service;

import com.clothing_store.Entity.ClienteEntity;
import com.clothing_store.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteEntity> findBetweenAge(){
        return clienteRepository.findBetweenAge();
    }

    public ClienteEntity save(ClienteEntity clienteEntity){
        return clienteRepository.save(clienteEntity);
    }

    public ClienteEntity update(ClienteEntity clienteEntity, Long id){
        clienteEntity.setId(id);
        return clienteRepository.save(clienteEntity);
    }

    public String delete(Long id){
        try {
            clienteRepository.deleteById(id);
            return "Deletado";
        } catch (Exception error){
            return "Erro ao deletar";
        }
    }

    public ClienteEntity findbyName(String nome){
        return clienteRepository.findbyName(nome);
    }

    public List<ClienteEntity> findAll(){
        return clienteRepository.findAll();
    }
}
