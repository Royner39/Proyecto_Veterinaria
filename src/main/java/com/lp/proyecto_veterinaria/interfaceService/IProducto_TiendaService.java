package com.lp.proyecto_veterinaria.interfaceService;

import com.lp.proyecto_veterinaria.model.Producto_Tienda;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface IProducto_TiendaService {
    List<Producto_Tienda> listar();
    Optional<Producto_Tienda> listarId(int id_producto);
    int save(Producto_Tienda p);
    void delete(int id_producto);
}
