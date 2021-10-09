package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="mascota")
public class Mascota {

    @Id
    @Column(name = "id_mascota")
    private Integer id_mascota;
    @Column(name = "tipo_mascota")
    private String tipo;
    @Column(name = "nombre_mascota")
    private String nombre;
    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;
    @OneToOne
    @JoinTable(name = "mascota_expediente",joinColumns = @JoinColumn(name = "id_mascota"),inverseJoinColumns = @JoinColumn(name = "id_expediente"))
    private Expediente expediente;
    @ManyToOne()
    @JoinTable(name = "cliente_mascota",joinColumns = @JoinColumn(name = "id_mascota"),inverseJoinColumns = @JoinColumn(name = "cedula_cliente"))
    private Cliente cliente;

    public Mascota(){

    }

    public Integer getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Integer id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public int getCliente() {
        return cliente.getCedula();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
