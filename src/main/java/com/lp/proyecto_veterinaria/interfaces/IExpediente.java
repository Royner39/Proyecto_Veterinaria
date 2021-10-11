package com.lp.proyecto_veterinaria.interfaces;


import com.lp.proyecto_veterinaria.model.Expediente;
import org.springframework.data.repository.CrudRepository;

public interface IExpediente extends CrudRepository<Expediente,Integer> {
}
