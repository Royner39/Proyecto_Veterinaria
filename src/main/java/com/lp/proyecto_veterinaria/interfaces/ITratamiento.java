package com.lp.proyecto_veterinaria.interfaces;


import com.lp.proyecto_veterinaria.model.Tratamiento;
import org.springframework.data.repository.CrudRepository;

public interface ITratamiento extends CrudRepository<Tratamiento,Integer> {
}
