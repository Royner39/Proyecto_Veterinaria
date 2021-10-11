package com.lp.proyecto_veterinaria.interfaceService;

import com.lp.proyecto_veterinaria.model.Tratamiento;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ITratamientoService {
    List<Tratamiento> listar();
    Optional<Tratamiento> listarId(int id_tratamiento);
    int save(Tratamiento t);
    void delete(int id_tratamiento);
}
