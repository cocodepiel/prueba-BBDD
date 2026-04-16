package com.example.api.api.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.api.api.models.SalaModel;

public interface ISalaService {
    //CRUD
    //C --> Create (INSERT INTO Sala...)
    //R --> Read (SELECT * FROM ...)
    //U --> Update (UPDATE Sala SET...)
    //D --> Delete (DELETE FROM Sala WHERE ...)

    //C --> Create (INSERT INTO Sala...)
    SalaModel insertSala(SalaModel sala);

    //R --> Select * from Salas
    ArrayList<SalaModel> getSalas();
    Optional<SalaModel> getById(Long id);
    
}
