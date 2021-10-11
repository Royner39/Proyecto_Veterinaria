package com.lp.proyecto_veterinaria.interfaceService;

import com.lp.proyecto_veterinaria.model.Servicio;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IServicioService {
    List<Servicio> listar();
    Optional<Servicio> listarId(int id_servicio);
    int save(Servicio s);
    void delete(int id_servicio);
}
