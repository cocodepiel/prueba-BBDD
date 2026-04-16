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

import com.example.api.api.models.UsuarioModel;
import com.example.api.api.services.IUsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    //Crear ENDPOINT (WebMethod) de tipo GET
    @GetMapping
    public ArrayList<UsuarioModel> getAllUsuarios(){
        return this.usuarioService.getUsuarios();
    }   

    @GetMapping("/{id}")
    public Optional<UsuarioModel> getUsuarioById(@PathVariable Long id){
        return this.usuarioService.getById(id);
    }

    @PostMapping
    public UsuarioModel insertUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.insertUsuario(usuario);
    }

}
