package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;

@Entity
@Table(name = "producto_tienda")
public class Producto_Tienda {

    @Id
    @Column(name = "id_producto")
    private Integer id_producto;
    @Column(name = "nombre_producto")
    private String nombre_producto;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "cantidad_inventario")
    private Integer cantidad_inventario;
    @Column(name = "precio_producto")
    private Double precio_producto;

    @OneToOne
    @JoinTable(name = "producto_vendido_producto",joinColumns = @JoinColumn(name = "id_producto"),inverseJoinColumns = @JoinColumn(name = "id_producto_vendido"))
    private Producto_Vendido producto_vendido;

    public Producto_Tienda(){

    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad_inventario() {
        return cantidad_inventario;
    }

    public void setCantidad_inventario(Integer cantidad_inventario) {
        this.cantidad_inventario = cantidad_inventario;
    }

    public Double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public Producto_Vendido getProducto_vendido() {
        return producto_vendido;
    }

    public void setProducto_vendido(Producto_Vendido producto_vendido) {
        this.producto_vendido = producto_vendido;
    }
}
