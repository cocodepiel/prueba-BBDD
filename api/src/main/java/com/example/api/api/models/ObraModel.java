package com.example.api.api.models;

import jakarta.persistence.*;

@Entity
@Table(name="Obra")
public class ObraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_obra") // <--- Aquí es donde cambias el nombre físico de la tabla
    private Long id;

    @Column
    private String nombre; // DAW, SMR, etc.
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_sala") // Nombre de la columna física en la tabla de MySQL
    private SalaModel sala;

    @ManyToOne
    @JoinColumn(name = "id_usuario") // Nombre de la columna física en la tabla de MySQL
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

    // CONSTRUCTORES (OPCIONALES)
    /*public CicloFormativoModel() {}

    public CicloFormativoModel(String nombre) {
        this.nombre = nombre;
    }*/

    // GETTERS
    //decripcion    


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    // SETTERS
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
