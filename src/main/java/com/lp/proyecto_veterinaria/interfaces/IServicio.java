package com.lp.proyecto_veterinaria.interfaces;


import com.lp.proyecto_veterinaria.model.Servicio;
import org.springframework.data.repository.CrudRepository;

public interface IServicio extends CrudRepository<Servicio,Integer> {
}
