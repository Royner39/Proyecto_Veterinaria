package com.lp.proyecto_veterinaria.interfaceService;


import com.lp.proyecto_veterinaria.model.Cliente;
import com.lp.proyecto_veterinaria.model.Medicamento;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IMedicamentoService {
    List<Medicamento> listar();
    Optional<Medicamento> listarId(int id_medicamento);
    int save(Medicamento m);
    void delete(int id_medicamento);

}
