package com.lp.proyecto_veterinaria.controller;

import com.lp.proyecto_veterinaria.interfaceService.ITratamientoService;
import com.lp.proyecto_veterinaria.model.Tratamiento;
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
public class TratamientoControlador {


    @Autowired
    private ITratamientoService tratamientoService;


    @GetMapping("/listarTratamientos")
    public String listarTratamientos(Model model){

        List<Tratamiento> tratamientos = tratamientoService.listar();
        model.addAttribute("tratamientos",tratamientos);
        return "indexEspecialidad";
    }

    @GetMapping("/nuevoTratamiento/{id}")
    public String agregarTratamiento(@PathVariable int id, Model model){
        model.addAttribute("tratamiento",new Tratamiento());
        return "formTratamiento";
    }

    @PostMapping("/guardarTratamiento")
    public String guardarTratamiento(@Valid Tratamiento t, Model model){
        tratamientoService.save(t);
        return "redirect:/listarTratamientos";
    }

    @GetMapping("/editarTratamiento/{id_tratamiento}")
    public String editarTratamiento(@PathVariable int id_tratamiento, Model model){
        Optional<Tratamiento> tratamiento = tratamientoService.listarId(id_tratamiento);
        model.addAttribute("tratamiento",tratamiento);
        return "formTratamiento";
    }

    @GetMapping("/eliminarTratamiento/{id_tratamiento}")
    public String eliminarTratamiento(@PathVariable int id_tratamiento,Model model){
        tratamientoService.delete(id_tratamiento);
        return "redirect:/listarTratamientos";
    }

}
