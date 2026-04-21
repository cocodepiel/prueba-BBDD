package com.example.api.api.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.api.models.ObraModel;
import com.example.api.api.services.IObraService;

@RestController
@RequestMapping("/obras")
public class ObraController {
    @Autowired
    private IObraService obraService;

    @GetMapping
    public ArrayList<ObraModel> getAllObras() {
        return this.obraService.getObras();
    }

    @GetMapping("/{id}")
    public Optional<ObraModel> getObraById(@PathVariable Long id) {
        return this.obraService.getById(id);
    }

    // insertar una sola
    @PostMapping
    public ObraModel insertObra(@RequestBody ObraModel obra) {
        return this.obraService.insertObra(obra);
    }

    // insertar varias
    @PostMapping("/all")
    public List<ObraModel> insertMultipleObras(@RequestBody List<ObraModel> obras) {
        List<ObraModel> insertedObras = new ArrayList<>();
        for (ObraModel obra : obras) {
            ObraModel inserted = this.obraService.insertObra(obra);
            insertedObras.add(inserted);
        }
        return insertedObras;
    }
}