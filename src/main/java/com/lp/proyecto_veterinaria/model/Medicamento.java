package com.lp.proyecto_veterinaria.model;


import javax.persistence.*;

@Entity
@Table(name= "medicamentos_hospital")
public class Medicamento {
    @Id
    @Column(name = "id_medicamento")
    private Integer id_medicamento;
    @Column(name = "nombre_medicamento")
    private String nombre;
    @Column(name = "cantidad_medicamento_inventario")
    private Integer cant_inv_medicamento;
    @Column(name = "costo_medicamento")
    private Double precio;
    @ManyToOne()
    @JoinTable(name = "tratamiento_medicamento",joinColumns = @JoinColumn(name = "id_medicamento"),inverseJoinColumns = @JoinColumn(name = "id_tratamiento"))
    private Tratamiento tratamiento;
    @OneToOne
    @JoinTable(name = "medicamento_vendido_medicamento",joinColumns = @JoinColumn(name = "id_medicamento"),inverseJoinColumns = @JoinColumn(name = "id_medicamento_vendido"))
    private Medicamento_Vendido medicamento_vendido;

    public Medicamento(){
    }

    public Medicamento(Integer id_medicamento, String nombre, Integer cant_inv_medicamento, Double precio) {
        this.id_medicamento = id_medicamento;
        this.nombre = nombre;
        this.cant_inv_medicamento = cant_inv_medicamento;
        this.precio = precio;
    }

    public Integer getId_medicamento() {
        return id_medicamento;
    }

    public void setId_medicamento(Integer id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCant_inv_medicamento() {
        return cant_inv_medicamento;
    }

    public void setCant_inv_medicamento(Integer cant_inv_medicamento) {
        this.cant_inv_medicamento = cant_inv_medicamento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Medicamento_Vendido getMedicamento_vendido() {
        return medicamento_vendido;
    }

    public void setMedicamento_vendido(Medicamento_Vendido medicamento_vendido) {
        this.medicamento_vendido = medicamento_vendido;
    }
}
