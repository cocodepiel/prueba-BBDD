package com.example.api.api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.api.api.models.SalaModel;
import com.example.api.api.services.ISalaService;

@RestController
@RequestMapping("/salas")
public class SalaController {
    @Autowired
    private ISalaService salaService;

    //Crear ENDPOINT (WebMethod) de tipo GET
    @GetMapping
    public ArrayList<SalaModel> getAllSalas(){
        return this.salaService.getSalas();
    }   

    @GetMapping("/{id}")
    public Optional<SalaModel> getSalaById(@PathVariable Long id){
        return this.salaService.getById(id);
    }

    @PostMapping
    public SalaModel insertSala(@RequestBody SalaModel sala){
        return this.salaService.insertSala(sala);
    }

}
