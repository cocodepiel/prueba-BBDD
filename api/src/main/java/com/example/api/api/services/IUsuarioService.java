package com.example.api.api.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.api.api.models.UsuarioModel;

public interface IUsuarioService {
    //CRUD
    //C --> Create (INSERT INTO Usuario...)
    //R --> Read (SELECT * FROM ...)
    //U --> Update (UPDATE Usuario SET...)
    //D --> Delete (DELETE FROM Usuario WHERE ...)

    //C --> Create (INSERT INTO Usuario...)
    UsuarioModel insertUsuario(UsuarioModel usuario);

    //R --> Select * from Usuarios
    ArrayList<UsuarioModel> getUsuarios();
    Optional<UsuarioModel> getById(Long id);
    
}
