package com.example.api.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.api.models.ObraModel;
import com.example.api.api.repositories.IObraRepository;

@Service
public class ObraService implements IObraService {
    @Autowired
    private IObraRepository obraRepository; 

    @Override
    public ObraModel insertObra(ObraModel obra) {
        return this.obraRepository.save(obra);
    }

    @Override
    public ArrayList<ObraModel> getObras() {
        return (ArrayList<ObraModel>) this.obraRepository.findAll();
    }

    @Override
    public Optional<ObraModel> getById(Long id) {
        return this.obraRepository.findById(id);
    }

    @Override
    public ArrayList<ObraModel> getObrasBySalaId(Long salaId) {
        return (ArrayList<ObraModel>) this.obraRepository.findBySala_Id(salaId);
    }

}
