package com.lp.proyecto_veterinaria.interfaceService;


import com.lp.proyecto_veterinaria.model.Cliente;
import com.lp.proyecto_veterinaria.model.Expediente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IExpedienteService {
    List<Expediente> listar();
    Optional<Expediente> listarId(int id_expediente);
    int save(Expediente e);
    void delete(int id_expediente);

}
