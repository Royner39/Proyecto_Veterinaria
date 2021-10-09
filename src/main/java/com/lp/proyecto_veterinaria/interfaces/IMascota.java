package com.lp.proyecto_veterinaria.interfaces;

import com.lp.proyecto_veterinaria.model.Mascota;
import org.springframework.data.repository.CrudRepository;

public interface IMascota extends CrudRepository<Mascota,Integer> {
}
