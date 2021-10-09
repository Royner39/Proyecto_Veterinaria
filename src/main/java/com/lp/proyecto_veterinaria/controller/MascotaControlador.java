package com.lp.proyecto_veterinaria.controller;

import com.lp.proyecto_veterinaria.interfaceService.IMascotaService;
import com.lp.proyecto_veterinaria.model.Cliente;
import com.lp.proyecto_veterinaria.model.Mascota;
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
public class MascotaControlador {


    @Autowired
    private IMascotaService mascotaService;


    @GetMapping("/verMascotas/{cliente}")
    public String listarMascotas(Model model, Cliente cliente){
        List<Mascota> mascotas = mascotaService.listarByCliente(cliente);
        model.addAttribute("mascotas",mascotas);
        return "indexMascota";
    }

    @GetMapping("/nuevaMascota")
    public String agregarCliente(Model model){
        model.addAttribute("mascota",new Mascota());
        return "formMascota";
    }

    @PostMapping("/guardarMascota")
    public String guardarMascota(@Valid Mascota m, Model model){
        mascotaService.save(m);
        return "redirect:/verMascotas/{cliente}";
    }

    @GetMapping("/editarMascota/{id}")
    public String editarMascota(@PathVariable int id, Model model){
        Optional<Mascota> mascota = mascotaService.listarId(id);
        model.addAttribute("mascota",mascota);
        return "formMascota";
    }

    @GetMapping("/eliminarMascota/{id}")
    public String eliminarCliente(@PathVariable int id,Model model){
        mascotaService.delete(id);
        return "redirect:/verMascotas/{cliente}";
    }

}
