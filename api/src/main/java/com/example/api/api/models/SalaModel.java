package com.example.api.api.models;

import jakarta.persistence.*;

@Entity
@Table(name="Sala")
public class SalaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String nombre;


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
