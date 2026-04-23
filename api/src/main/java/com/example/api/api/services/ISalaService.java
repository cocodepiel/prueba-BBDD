package com.example.api.api.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.api.api.models.ObraModel;
import com.example.api.api.models.SalaModel;

public interface ISalaService {
        //CRUD
    //C --> Create (INSERT INTO...)
    //R --> Read (SELECT * FROM ...)
    //U --> Update (UPDATE SET...)
    //D --> Delete (DELETE FROM / WHERE ...)

    SalaModel insertSala(SalaModel sala);

    ArrayList<SalaModel> getSalas();
    Optional<SalaModel> getById(Long id);

    ArrayList<ObraModel> getObrasBySalaId(Long salaId);
    
}
