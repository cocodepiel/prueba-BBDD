package com.example.api.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.api.api.models.ObraModel;

public interface IObraService {
    //CRUD
    //C --> Create (INSERT INTO Obra...)
    //R --> Read (SELECT * FROM ...)
    //U --> Update (UPDATE Obra SET...)
    //D --> Delete (DELETE FROM Obra WHERE ...)

    //C --> Create (INSERT INTO Obra...)
    ObraModel insertObra(ObraModel obra);

    //R --> Select * from Obras
    ArrayList<ObraModel> getObras();
    Optional<ObraModel> getById(Long id);
    
}
