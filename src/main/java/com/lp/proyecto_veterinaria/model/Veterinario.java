package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="veterinario")
public class Veterinario extends Persona{

    @Column(name="numero_colegiado")
    private Integer num_colegiado;
    @Column(name = "horario_atencion")
    private String horario_atencion;
    @ManyToMany()
    @JoinTable(name = "especialidad_veterinario",joinColumns = @JoinColumn(name = "cedula_veterinario"),inverseJoinColumns = @JoinColumn(name = "id_especialidad"))
    List<Especialidad> especialidades;
    @OneToMany()
    @JoinTable(name = "tratamiento_veterinario",joinColumns = @JoinColumn(name = "cedula_veterinario"),inverseJoinColumns = @JoinColumn(name = "id_tratamiento"))
    private List<Tratamiento> tratamientos;

    public Veterinario(){

    }

    public Integer getNum_colegiado() {
        return num_colegiado;
    }

    public void setNum_colegiado(Integer num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public String getHorario_atencion() {
        return horario_atencion;
    }

    public void setHorario_atencion(String horario_atencion) {
        this.horario_atencion = horario_atencion;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }


    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }
}
