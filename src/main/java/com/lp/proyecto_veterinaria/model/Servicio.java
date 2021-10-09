package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;

@Entity
@Table(name = "servicios_hospital")
public class Servicio {

    @Id
    @Column(name = "id_servicio")
    private Integer id_servicio;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private Double precio;

    @ManyToOne
    @JoinTable(name = "servicio_factura_hospital",joinColumns = @JoinColumn(name = "id_servicio"),inverseJoinColumns = @JoinColumn(name = "id_factura_hospital"))
    private Factura_Hospital factura_hospital;

    public Servicio(){

    }


    public Integer getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Integer id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Factura_Hospital getFactura_hospital() {
        return factura_hospital;
    }

    public void setFactura_hospital(Factura_Hospital factura_hospital) {
        this.factura_hospital = factura_hospital;
    }
}
