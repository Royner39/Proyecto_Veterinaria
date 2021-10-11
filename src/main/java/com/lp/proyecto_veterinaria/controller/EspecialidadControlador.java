package com.lp.proyecto_veterinaria.controller;

import com.lp.proyecto_veterinaria.interfaceService.IEspecialidadService;
import com.lp.proyecto_veterinaria.model.Especialidad;
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
public class EspecialidadControlador {


    @Autowired
    private IEspecialidadService especialidadService;


    @GetMapping("/listarEspecialidades/{cedula}")
    public String listarEspecialidades(@PathVariable int cedula, Veterinario veterinario,Model model){
        Optional<Veterinario> v = especialidadService.listarVetId(cedula);
        veterinario = v.get();
        List<Especialidad> especialidades = especialidadService.listarByVeterinario(veterinario);
        model.addAttribute("especialidades",especialidades);
        return "indexEspecialidad";
    }

    @GetMapping("/nuevaEspecialidad")
    public String agregarEspecialidad(Model model){
        model.addAttribute("especialidad",new Especialidad());
        return "formEspecialidad";
    }

    @PostMapping("/guardarEspecialidad")
    public String guardarEspecialidad(@Valid Especialidad e, Model model){
        especialidadService.save(e);
        return "redirect:/listarEspecialidades/{cedula}";
    }

    @GetMapping("/editarEspecialidad/{id_especialidad}")
    public String editarEspecialidad(@PathVariable int id, Model model){
        Optional<Especialidad> especialidad = especialidadService.listarId(id);
        model.addAttribute("especialidad",especialidad);
        return "formEspecialidad";
    }

    @GetMapping("/eliminarEspecialidad/{id_especialidad}")
    public String eliminarEspecialidad(@PathVariable int id,Model model){
        especialidadService.delete(id);
        return "redirect:/listarEspecialidades/{cedula}";
    }

}
