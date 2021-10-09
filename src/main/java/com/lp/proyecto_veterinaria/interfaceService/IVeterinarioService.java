package com.lp.proyecto_veterinaria.interfaceService;

import com.lp.proyecto_veterinaria.model.Veterinario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IVeterinarioService {
    List<Veterinario> listar();
    Optional<Veterinario> listarId(int cedula);
    int save(Veterinario v);
    void delete(int cedula);
}
