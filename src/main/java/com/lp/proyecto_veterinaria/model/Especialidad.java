package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_especialidad")
    private int id_especialidad;

    @Column(name="nombre_especialidad")
    private String nombre_especialidad;

    @ManyToMany()
    @JoinTable(name = "especialidad_veterinario",joinColumns = @JoinColumn(name = "id_especialidad"),inverseJoinColumns = @JoinColumn(name = "cedula_veterinario"))
    List<Veterinario> veterinarios;

    public Especialidad(){

    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }


    public void setVeterinarios(List<Veterinario> veterinario) {
        this.veterinarios = veterinario;
    }
}
