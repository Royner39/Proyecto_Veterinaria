package com.lp.proyecto_veterinaria.controler;

import com.lp.proyecto_veterinaria.interfaceService.IPersonaService;
import com.lp.proyecto_veterinaria.model.Persona;
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
public class Controlador {


    @Autowired
    private IPersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas = service.listar();
        model.addAttribute("personas",personas);
        return "index";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("persona",new Persona());
        return "form";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid Persona p, Model model){
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id,Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona",persona);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id,Model model){
        service.delete(id);
        return "redirect:/listar";
    }

}
