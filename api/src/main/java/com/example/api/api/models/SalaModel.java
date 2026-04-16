package com.example.api.api.models;

import jakarta.persistence.*;

@Entity
@Table(name="Sala")
public class SalaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nombre; // Sala 1, Sala 2, etc.

    // CONSTRUCTORES (OPCIONALES)
    /*public SalaModel() {}

    public SalaModel(String nombre) {
        this.nombre = nombre;
    }*/

    // GETTERS
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
