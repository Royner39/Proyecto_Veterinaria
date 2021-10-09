package com.lp.proyecto_veterinaria.interfaces;

import com.lp.proyecto_veterinaria.model.Veterinario;
import org.springframework.data.repository.CrudRepository;

public interface IVeterinario extends CrudRepository<Veterinario,Integer> {
}
