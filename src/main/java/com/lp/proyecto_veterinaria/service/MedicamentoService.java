package com.lp.proyecto_veterinaria.service;

import com.lp.proyecto_veterinaria.interfaceService.IMedicamentoService;
import com.lp.proyecto_veterinaria.interfaces.IMedicamento;
import com.lp.proyecto_veterinaria.model.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicamentoService implements IMedicamentoService {
    @Autowired
    private IMedicamento data;

    @Override
    public List<Medicamento> listar() {
        return (List<Medicamento>)data.findAll();
    }

    @Override
    public Optional<Medicamento> listarId(int id_medicamento) {
        return data.findById(id_medicamento);
    }


    @Override
    public int save(Medicamento m) {
        int res = 0;
        Medicamento medicamento = data.save(m);
        if (!medicamento.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id_medicamento) {
        data.deleteById(id_medicamento);
    }
}
