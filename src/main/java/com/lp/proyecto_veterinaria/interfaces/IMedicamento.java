package com.lp.proyecto_veterinaria.interfaces;


import com.lp.proyecto_veterinaria.model.Medicamento;
import org.springframework.data.repository.CrudRepository;

public interface IMedicamento extends CrudRepository<Medicamento,Integer> {
}
