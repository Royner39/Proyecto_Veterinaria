package com.lp.proyecto_veterinaria.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "factura_tienda")
public class Factura_Tienda {

    @Id
    @Column(name = "id_factura_tienda")
    private Integer id_factura_tienda;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "total_factura")
    private Double total_factura;

    @OneToMany
    @JoinTable(name = "producto_vendido_factura",joinColumns = @JoinColumn(name = "id_factura_tienda"),inverseJoinColumns = @JoinColumn(name = "id_producto_vendido"))
    private List<Producto_Vendido> productos_vendidos;

    @ManyToOne
    @JoinTable(name = "expediente_factura_tienda",joinColumns = @JoinColumn(name = "id_factura_tienda"),inverseJoinColumns = @JoinColumn(name = "id_expediente"))
    private Expediente expediente;
    @ManyToOne
    @JoinTable(name = "cliente_factura_tienda",joinColumns = @JoinColumn(name = "id_factura_tienda"),inverseJoinColumns = @JoinColumn(name = "cedula_cliente"))
    private Cliente cliente;

    public Factura_Tienda(){

    }

    public Integer getId_factura_tienda() {
        return id_factura_tienda;
    }

    public void setId_factura_tienda(Integer id_factura_tienda) {
        this.id_factura_tienda = id_factura_tienda;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Producto_Vendido> getProductos_vendidos() {
        return productos_vendidos;
    }

    public void setProductos_vendidos(List<Producto_Vendido> productos_vendidos) {
        this.productos_vendidos = productos_vendidos;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public Double getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(Double total_factura_tienda) {
        this.total_factura = total_factura_tienda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
