package com.lp.proyecto_veterinaria.interfaces;

import com.lp.proyecto_veterinaria.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona extends CrudRepository<Persona,Integer> {
}
