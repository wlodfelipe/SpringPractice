package com.clothing_store.Controller;

import com.clothing_store.Entity.ClienteEntity;
import com.clothing_store.Entity.FuncionarioEntity;
import com.clothing_store.Service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping("/save")
    public FuncionarioEntity save(@RequestBody FuncionarioEntity funcionarioEntity){
        return funcionarioService.save(funcionarioEntity);
    }

    @GetMapping("/findbyName/{nome}")
    public FuncionarioEntity findbyName(@PathVariable String nome){
        return funcionarioService.findbyName(nome);
    }
}
