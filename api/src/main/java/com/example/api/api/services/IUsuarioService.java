package com.example.api.api.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.api.api.models.UsuarioModel;

public interface IUsuarioService {
        //CRUD
    //C --> Create (INSERT INTO...)
    //R --> Read (SELECT * FROM ...)
    //U --> Update (UPDATE SET...)
    //D --> Delete (DELETE FROM / WHERE ...)

    UsuarioModel insertUsuario(UsuarioModel usuario);


    ArrayList<UsuarioModel> getUsuarios();
    Optional<UsuarioModel> getById(Long id);
    
}
