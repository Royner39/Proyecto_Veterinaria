package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cliente")
public class Cliente extends Persona{

    @OneToMany()
    @JoinTable(name = "cliente_mascota",joinColumns = @JoinColumn(name = "cedula_cliente"),inverseJoinColumns = @JoinColumn(name = "id_mascota"))
    List<Mascota> mascotas;
    @OneToMany
    @JoinTable(name = "cliente_factura_tienda",joinColumns = @JoinColumn(name = "cedula_cliente"),inverseJoinColumns = @JoinColumn(name = "id_factura_tienda"))
    private List<Factura_Tienda> facturas_tienda;
    @OneToMany
    @JoinTable(name = "cliente_factura_hospital",joinColumns = @JoinColumn(name = "cedula_cliente"),inverseJoinColumns = @JoinColumn(name = "id_factura_hospital"))
    private List<Factura_Hospital> facturas_hospital;


    public Cliente(){

    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Factura_Tienda> getFacturas_tienda() {
        return facturas_tienda;
    }

    public void setFacturas_tienda(List<Factura_Tienda> facturas_tienda) {
        this.facturas_tienda = facturas_tienda;
    }

    public List<Factura_Hospital> getFacturas_hospital() {
        return facturas_hospital;
    }

    public void setFacturas_hospital(List<Factura_Hospital> facturas_hospital) {
        this.facturas_hospital = facturas_hospital;
    }
}
