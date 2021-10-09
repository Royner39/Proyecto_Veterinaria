package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "factura_hospital")
public class Factura_Hospital {
    @Id
    @Column(name = "id_factura_hospital")
    private Integer id_factura_hospital;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "total_factura")
    private Double total_factura;

    @OneToMany
    @JoinTable(name = "medicamento_vendido_factura",joinColumns = @JoinColumn(name = "id_factura_hospital"),inverseJoinColumns = @JoinColumn(name = "id_medicamento_vendido"))
    private List<Medicamento_Vendido> medicamentos_vendidos;
    @OneToMany
    @JoinTable(name = "servicio_factura_hospital",joinColumns = @JoinColumn(name = "id_factura_hospital"),inverseJoinColumns = @JoinColumn(name = "id_servicio"))
    private List<Servicio> servicios;

    @ManyToOne
    @JoinTable(name = "cliente_factura_hospital",joinColumns = @JoinColumn(name = "id_factura_hospital"),inverseJoinColumns = @JoinColumn(name = "cedula_cliente"))
    private Cliente cliente;

    public Factura_Hospital(){

    }

    public Integer getId_factura_hospital() {
        return id_factura_hospital;
    }

    public void setId_factura_hospital(Integer id_factura_hospital) {
        this.id_factura_hospital = id_factura_hospital;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(Double total_factura) {
        this.total_factura = total_factura;
    }

    public List<Medicamento_Vendido> getMedicamentos_vendidos() {
        return medicamentos_vendidos;
    }

    public void setMedicamentos_vendidos(List<Medicamento_Vendido> medicamentos_vendidos) {
        this.medicamentos_vendidos = medicamentos_vendidos;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
