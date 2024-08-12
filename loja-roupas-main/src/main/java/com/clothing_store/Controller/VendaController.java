package com.clothing_store.Controller;

import com.clothing_store.Entity.VendaEntity;
import com.clothing_store.Entity.VendaEntity;
import com.clothing_store.Service.VendaService;
import com.clothing_store.Service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/venda")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @PostMapping("/save")
    public VendaEntity save(@RequestBody VendaEntity vendaEntity){
        return vendaService.save(vendaEntity);
    }

    @GetMapping("/top10")
    public List<VendaEntity> vendaTop10(){
        return vendaService.vendaTop10();
    }
}
