package com.lp.proyecto_veterinaria.service;

import com.lp.proyecto_veterinaria.interfaceService.IEspecialidadService;
import com.lp.proyecto_veterinaria.interfaceService.IVeterinarioService;
import com.lp.proyecto_veterinaria.interfaces.IEspecialidad;
import com.lp.proyecto_veterinaria.model.Especialidad;
import com.lp.proyecto_veterinaria.model.Veterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadService implements IEspecialidadService{

    @Autowired
    private IEspecialidad data;

    @Autowired
    private IVeterinarioService vetData;

    @Override
    public List<Especialidad> listar() {
        return (List<Especialidad>)data.findAll();
    }

    @Override
    public List<Especialidad> listarByVeterinario(Veterinario veterinario){
        return veterinario.getEspecialidades();
    }

    @Override
    public Optional<Especialidad> listarId(int id) {
        return data.findById(id);
    }

    public Optional<Veterinario> listarVetId(int cedula) {
        return vetData.listarId(cedula);
    }


    @Override
    public int save(Especialidad e) {
        int res = 0;
        Especialidad especialidad = data.save(e);
        if (!especialidad.equals(null)){
            res=1;
        }
        return res;
    }


    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

}






