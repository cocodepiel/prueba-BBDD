package com.example.api.api.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.api.api.models.ObraModel;

public interface IObraService {
       //CRUD
    //C --> Create (INSERT INTO...)
    //R --> Read (SELECT * FROM ...)
    //U --> Update (UPDATE SET...)
    //D --> Delete (DELETE FROM / WHERE ...)

    ObraModel insertObra(ObraModel obra);

    ArrayList<ObraModel> getObras();
    Optional<ObraModel> getById(Long id);

    ArrayList<ObraModel> getObrasBySalaId(Long salaId);
    
}
