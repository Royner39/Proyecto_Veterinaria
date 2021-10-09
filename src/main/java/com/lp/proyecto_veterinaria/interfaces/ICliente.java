package com.lp.proyecto_veterinaria.interfaces;

import com.lp.proyecto_veterinaria.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ICliente extends CrudRepository<Cliente,Integer> {
}
