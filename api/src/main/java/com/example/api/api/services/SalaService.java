package com.example.api.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.api.models.ObraModel;
import com.example.api.api.models.SalaModel;
import com.example.api.api.repositories.IObraRepository;
import com.example.api.api.repositories.ISalaRepository;

@Service
public class SalaService implements ISalaService {
    @Autowired
    private ISalaRepository salaRepository;

    @Autowired
    private IObraRepository obraRepository;

    @Override
    public SalaModel insertSala(SalaModel sala) {
        return this.salaRepository.save(sala);
    }

    @Override
    public ArrayList<SalaModel> getSalas() {
        return (ArrayList<SalaModel>) this.salaRepository.findAll();
    }

    @Override
    public Optional<SalaModel> getById(Long id) {
        return this.salaRepository.findById(id);
    }

    @Override
    public ArrayList<ObraModel> getObrasBySalaId(Long salaId) {
        return (ArrayList<ObraModel>) this.obraRepository.findBySala_Id(salaId);
    }

}
