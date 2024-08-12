package com.clothing_store.Service;

import com.clothing_store.Entity.ClienteEntity;
import com.clothing_store.Entity.FuncionarioEntity;
import com.clothing_store.Entity.VendaEntity;
import com.clothing_store.Entity.VendaEntity;
import com.clothing_store.Repository.ClienteRepository;
import com.clothing_store.Repository.FuncionarioRepository;
import com.clothing_store.Repository.VendaRepository;
import com.clothing_store.Repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    public VendaEntity save(VendaEntity VendaEntity){
        return vendaRepository.save(VendaEntity);
    }

    public List<VendaEntity> vendaTop10(){
        return vendaRepository.vendaTop10();
    }

    public String delete(Long id){
        try {
            vendaRepository.deleteById(id);
            return "Deletado";
        } catch (Exception error){
            return "Erro ao deletar";
        }
    }
}
