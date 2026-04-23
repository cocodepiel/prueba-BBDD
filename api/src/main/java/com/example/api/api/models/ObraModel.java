package com.example.api.api.models;

import jakarta.persistence.*;

@Entity
@Table(name="Obra")
public class ObraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_obra")
    private Long id;

    @Column
    private String nombre; // DAW, SMR, etc.
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_sala") // Nombre de la columna física en la tabla de MySQL
    private SalaModel sala;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioModel usuario;

    public SalaModel getSala() { 
        return sala;
    }
    public void setSala(SalaModel sala) {
        this.sala = sala; 
    }

    public UsuarioModel getUsuario() { 
        return usuario;
    }
    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario; 
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
