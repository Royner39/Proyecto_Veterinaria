package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;

@Entity
@Table(name = "medicamento_vendido")
public class Medicamento_Vendido {
    @Id
    @Column(name ="id_factura_hospital")
    private int id_factura_hospital;
    @Column(name = "cantidad_resetada")
    private Integer cantidad_resetada;
    @Column(name = "precio_neto")
    private Integer precio_neto;

    @OneToOne
    @JoinTable(name = "medicamento_vendido_medicamento",joinColumns = @JoinColumn(name = "id_medicamento_vendido"),inverseJoinColumns = @JoinColumn(name = "id_medicamento"))
    private Medicamento medicamento;
    @ManyToOne
    @JoinTable(name = "medicamento_vendido_factura",joinColumns = @JoinColumn(name = "id_medicamento_vendido"),inverseJoinColumns = @JoinColumn(name = "id_factura_hospital"))
    private Factura_Hospital factura_hospital;

    public Medicamento_Vendido(){

    }

    public int getId_factura_hospital() {
        return id_factura_hospital;
    }

    public void setId_factura_hospital(int id_factura_hospital) {
        this.id_factura_hospital = id_factura_hospital;
    }

    public Integer getCantidad_resetada() {
        return cantidad_resetada;
    }

    public void setCantidad_resetada(Integer cantidad_resetada) {
        this.cantidad_resetada = cantidad_resetada;
    }

    public Integer getPrecio_neto() {
        return precio_neto;
    }

    public void setPrecio_neto(Integer precio_neto) {
        this.precio_neto = precio_neto;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Factura_Hospital getFactura_hospital() {
        return factura_hospital;
    }

    public void setFactura_hospital(Factura_Hospital factura_hospital) {
        this.factura_hospital = factura_hospital;
    }
}
