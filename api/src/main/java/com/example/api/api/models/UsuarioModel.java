package com.example.api.api.models;

import jakarta.persistence.*;

@Entity
@Table(name="Usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;
    
    @Column
    private String nombre; // Usuario 1, Usuario 2, etc.

    private String apellido1;

    // CONSTRUCTORES (OPCIONALES)
    /*public UsuarioModel() {}

    public UsuarioModel(String nombre) {
        this.nombre = nombre;
    }*/

    // OBTENEDORES
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido1() {
        return apellido1;
    }

    // ESTABLECEDORES
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

}
