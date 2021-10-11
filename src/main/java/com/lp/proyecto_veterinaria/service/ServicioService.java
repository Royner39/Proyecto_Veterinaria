package com.lp.proyecto_veterinaria.service;

import com.lp.proyecto_veterinaria.interfaceService.IServicioService;
import com.lp.proyecto_veterinaria.interfaces.IServicio;
import com.lp.proyecto_veterinaria.model.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService implements IServicioService {
    @Autowired
    private IServicio data;

    @Override
    public List<Servicio> listar() {
        return (List<Servicio>)data.findAll();
    }

    @Override
    public Optional<Servicio> listarId(int id_servicio) {
        return data.findById(id_servicio);
    }


    @Override
    public int save(Servicio s) {
        int res = 0;
        Servicio servicio = data.save(s);
        if (!servicio.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id_servicio) {
        data.deleteById(id_servicio);
    }
}
