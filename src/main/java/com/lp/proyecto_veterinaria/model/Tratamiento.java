package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Tratamiento {

    @Id
    @Column(name = "id_tratamiento")
    private Integer id_tratamiento;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToOne()
    @JoinTable(name = "tratamiento_veterinario",joinColumns = @JoinColumn(name = "id_tratamiento"),inverseJoinColumns = @JoinColumn(name = "cedula_veterinario"))
    private Veterinario medico;
    @OneToMany()
    @JoinTable(name = "tratamiento_medicamento",joinColumns = @JoinColumn(name = "id_tratamiento"),inverseJoinColumns = @JoinColumn(name = "id_medicamento"))
    private List<Medicamento> medicamentos;
    @ManyToOne()
    @JoinTable(name = "tratamiento_expediente",joinColumns = @JoinColumn(name = "id_tratamiento"),inverseJoinColumns = @JoinColumn(name = "id_expediente"))
    private Expediente expediente;

    public Tratamiento(){

    }

    public Integer getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(Integer id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Veterinario getMedico() {
        return medico;
    }

    public void setMedico(Veterinario medico) {
        this.medico = medico;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
}
