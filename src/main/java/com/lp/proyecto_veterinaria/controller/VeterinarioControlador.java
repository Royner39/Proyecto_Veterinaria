package com.lp.proyecto_veterinaria.controller;

import com.lp.proyecto_veterinaria.interfaceService.IVeterinarioService;
import com.lp.proyecto_veterinaria.model.Veterinario;
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
public class VeterinarioControlador {


    @Autowired
    private IVeterinarioService veterinarioService;


    @GetMapping("/listarVeterinarios")
    public String listarVeterinarios(Model model){
        List<Veterinario> veterinarios = veterinarioService.listar();
        model.addAttribute("veterinarios",veterinarios);
        return "indexVeterinario";
    }

    @GetMapping("/nuevoVeterinario")
    public String agregarVeterinario(Model model){
        model.addAttribute("veterinario",new Veterinario());
        return "formVeterinario";
    }

    @PostMapping("/guardarVeterinario")
    public String guardarVeterinario(@Valid Veterinario v, Model model){
        veterinarioService.save(v);
        return "redirect:/listarVeterinarios";
    }

    @GetMapping("/editarVeterinario/{cedula}")
    public String editarVeterinario(@PathVariable int cedula,Model model){
        Optional<Veterinario> veterinario = veterinarioService.listarId(cedula);
        model.addAttribute("veterinario",veterinario);
        return "formVeterinario";
    }

    @GetMapping("/eliminarVeterinario/{cedula}")
    public String eliminarVeterinario(@PathVariable int cedula,Model model){
        veterinarioService.delete(cedula);
        return "redirect:/listarVeterinarios";
    }

}
