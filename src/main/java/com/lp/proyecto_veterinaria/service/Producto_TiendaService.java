package com.lp.proyecto_veterinaria.service;

import com.lp.proyecto_veterinaria.interfaceService.IProducto_TiendaService;
import com.lp.proyecto_veterinaria.interfaces.IProducto_Tienda;
import com.lp.proyecto_veterinaria.model.Producto_Tienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class Producto_TiendaService implements IProducto_TiendaService {

    @Autowired
    private IProducto_Tienda data;

    @Override
    public List<Producto_Tienda> listar() {
        return (List<Producto_Tienda>)data.findAll();
    }

    @Override
    public Optional<Producto_Tienda> listarId(int id_producto) {
        return data.findById(id_producto);
    }


    @Override
    public int save(Producto_Tienda p) {
        int res = 0;
        Producto_Tienda producto = data.save(p);
        if (!producto.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id_producto) {
        data.deleteById(id_producto);
    }
}
