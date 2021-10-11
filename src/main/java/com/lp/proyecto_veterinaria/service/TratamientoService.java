package com.lp.proyecto_veterinaria.service;

import com.lp.proyecto_veterinaria.interfaceService.ITratamientoService;
import com.lp.proyecto_veterinaria.interfaces.ITratamiento;
import com.lp.proyecto_veterinaria.model.Tratamiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TratamientoService implements ITratamientoService {

    @Autowired
    private ITratamiento data;

    @Override
    public List<Tratamiento> listar() {
        return (List<Tratamiento>)data.findAll();
    }

    @Override
    public Optional<Tratamiento> listarId(int id_tratamiento) {
        return data.findById(id_tratamiento);
    }


    @Override
    public int save(Tratamiento t) {
        int res = 0;
        Tratamiento tratamiento = data.save(t);
        if (!tratamiento.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id_tratamiento) {
        data.deleteById(id_tratamiento);
    }
}
