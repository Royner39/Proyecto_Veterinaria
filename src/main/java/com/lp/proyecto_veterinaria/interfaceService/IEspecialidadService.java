package com.lp.proyecto_veterinaria.interfaceService;

import com.lp.proyecto_veterinaria.model.Especialidad;
import com.lp.proyecto_veterinaria.model.Veterinario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IEspecialidadService {

    List<Especialidad> listar();
    List<Especialidad> listarByVeterinario(Veterinario veterinario);
    Optional<Especialidad> listarId(int id);
    Optional<Veterinario> listarVetId(int cedula);
    int save(Especialidad e);
    void delete(int id);

}
