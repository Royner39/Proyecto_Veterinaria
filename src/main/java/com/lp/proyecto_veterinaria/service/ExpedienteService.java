package com.lp.proyecto_veterinaria.service;

import com.lp.proyecto_veterinaria.interfaceService.IExpedienteService;
import com.lp.proyecto_veterinaria.interfaces.IExpediente;
import com.lp.proyecto_veterinaria.model.Expediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpedienteService implements IExpedienteService {

    @Autowired
    private IExpediente data;

    @Override
    public List<Expediente> listar() {
        return (List<Expediente>)data.findAll();
    }

    @Override
    public Optional<Expediente> listarId(int id_expediente) {
        return data.findById(id_expediente);
    }


    @Override
    public int save(Expediente e) {
        int res = 0;
        Expediente expediente = data.save(e);
        if (!expediente.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id_expediente) {
        data.deleteById(id_expediente);
    }
}
