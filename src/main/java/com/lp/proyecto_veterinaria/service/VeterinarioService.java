package com.lp.proyecto_veterinaria.service;

import com.lp.proyecto_veterinaria.interfaceService.IVeterinarioService;
import com.lp.proyecto_veterinaria.interfaces.IVeterinario;
import com.lp.proyecto_veterinaria.model.Veterinario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService implements IVeterinarioService {
    @Autowired
    private IVeterinario data;

    @Override
    public List<Veterinario> listar() {
        return (List<Veterinario>)data.findAll();
    }

    @Override
    public Optional<Veterinario> listarId(int cedula) {
        return data.findById(cedula);
    }

    @Override
    public int save(Veterinario v) {
        int res = 0;
        Veterinario veterinario = data.save(v);
        if (!veterinario.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int cedula) {
        data.deleteById(cedula);
    }
}
