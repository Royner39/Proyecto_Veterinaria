package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;

@Entity
@Table(name = "producto_vendido")
public class Producto_Vendido {

    @Id
    @Column(name = "id_producto_vendido")
    private Integer id_producto_vendido;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "precio_neto")
    private double precio_neto;

    @OneToOne
    @JoinTable(name = "producto_vendido_producto",joinColumns = @JoinColumn(name = "id_producto_vendido"),inverseJoinColumns = @JoinColumn(name = "id_producto_tienda"))
    private Producto_Tienda producto;

    @ManyToOne
    @JoinTable(name = "producto_vendido_factura",joinColumns = @JoinColumn(name = "id_producto_vendido"),inverseJoinColumns = @JoinColumn(name = "id_factura_tienda"))
    private Factura_Tienda factura_tienda;



    public Producto_Vendido(){

    }

    public Integer getId_producto_vendido() {
        return id_producto_vendido;
    }

    public void setId_producto_vendido(Integer id_producto_vendido) {
        this.id_producto_vendido = id_producto_vendido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_neto() {
        return precio_neto;
    }

    public void setPrecio_neto(double precio_neto) {
        this.precio_neto = precio_neto;
    }

    public Producto_Tienda getProducto() {
        return producto;
    }

    public void setProducto(Producto_Tienda producto) {
        this.producto = producto;
    }

    public Factura_Tienda getFactura_tienda() {
        return factura_tienda;
    }

    public void setFactura_tienda(Factura_Tienda factura_tienda) {
        this.factura_tienda = factura_tienda;
    }
}
