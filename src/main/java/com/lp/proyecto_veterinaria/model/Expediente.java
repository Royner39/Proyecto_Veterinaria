package com.lp.proyecto_veterinaria.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="expediente")
public class Expediente {

        @Id
        @Column(name="id_expediente")
        private int id_expediente;
        @OneToOne
        @JoinTable(name = "mascota_expediente",joinColumns = @JoinColumn(name = "id_expediente"),inverseJoinColumns = @JoinColumn(name = "id_mascota"))
        Mascota mascota;
        @OneToMany
        @JoinTable(name = "tratamiento_expediente",joinColumns = @JoinColumn(name = "id_expediente"),inverseJoinColumns = @JoinColumn(name = "id_tratamiento"))
        List<Tratamiento> tratamientos;
        @OneToMany
        @JoinTable(name = "expediente_factura_tienda",joinColumns = @JoinColumn(name = "id_expediente"),inverseJoinColumns = @JoinColumn(name = "id_factura_tienda"))
        private List<Factura_Tienda> facturas_tienda;

        public Expediente(){
        }


        public int getId_expediente() {
                return id_expediente;
        }

        public void setId_expediente(int id_expediente) {
                this.id_expediente = id_expediente;
        }

        public Mascota getMascota() {
                return mascota;
        }

        public void setMascota(Mascota mascota) {
                this.mascota = mascota;
        }

        public List<Tratamiento> getTratamientos() {
                return tratamientos;
        }

        public void setTratamientos(List<Tratamiento> tratamientos) {
                this.tratamientos = tratamientos;
        }

        public List<Factura_Tienda> getFacturas_tienda() {
                return facturas_tienda;
        }

        public void setFacturas_tienda(List<Factura_Tienda> facturas_tienda) {
                this.facturas_tienda = facturas_tienda;
        }
}
