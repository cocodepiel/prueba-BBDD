package com.example.api.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.api.models.UsuarioModel;
import com.example.api.api.repositories.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public UsuarioModel insertUsuario(UsuarioModel usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public ArrayList<UsuarioModel> getUsuarios() {
        return (ArrayList<UsuarioModel>) this.usuarioRepository.findAll();
    }

    @Override
    public Optional<UsuarioModel> getById(Long id) {
        return this.usuarioRepository.findById(id);
    }

}
