package com.clothing_store.Controller;

import com.clothing_store.Entity.ClienteEntity;
import com.clothing_store.Repository.ClienteRepository;
import com.clothing_store.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/findBetweenAge")
    public List<ClienteEntity> findBetweenAge(){
        return clienteService.findBetweenAge();
    }

    @PostMapping("/save")
    public ClienteEntity save(@RequestBody ClienteEntity clienteEntity){
        return clienteService.save(clienteEntity);
    }

    @GetMapping("/findbyName/{nome}")
    public ClienteEntity findbyName(@PathVariable String nome){
        return clienteService.findbyName(nome);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        try {
            String mensagem = this.clienteService.delete(id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ClienteEntity> update(@RequestBody ClienteEntity clienteEntity, @PathVariable Long id) {
        try {
            ClienteEntity cliente = this.clienteService.update(clienteEntity, id);
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/findAll")
    public List<ClienteEntity> findAll() {
        return clienteService.findAll();
    }
}
