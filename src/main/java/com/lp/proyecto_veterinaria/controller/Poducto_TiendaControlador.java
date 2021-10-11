package com.lp.proyecto_veterinaria.controller;

import com.lp.proyecto_veterinaria.interfaceService.IProducto_TiendaService;
import com.lp.proyecto_veterinaria.model.Producto_Tienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Poducto_TiendaControlador {


    @Autowired
    private IProducto_TiendaService productoService;


    @GetMapping("/listarProductos")
    public String listarProductos(Model model){
        List<Producto_Tienda> productos = productoService.listar();
        model.addAttribute("productos",productos);
        return "indexProducto";
    }


    @GetMapping("/nuevoProducto")
    public String agregarProducto(Model model){
        model.addAttribute("producto",new Producto_Tienda());
        return "formProducto";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(@Valid Producto_Tienda p, Model model){
        productoService.save(p);
        return "redirect:/listarProductos";
    }

    @GetMapping("/editarProducto/{id_producto}")
    public String editarProducto(@PathVariable int id_producto, Model model){
        Optional<Producto_Tienda> producto = productoService.listarId(id_producto);
        model.addAttribute("producto",producto);
        return "formProducto";
    }

    @GetMapping("/eliminarProducto/{id_producto}")
    public String eliminarProducto(@PathVariable int id_producto,Model model){
        productoService.delete(id_producto);
        return "redirect:/listarProductos";
    }
}
