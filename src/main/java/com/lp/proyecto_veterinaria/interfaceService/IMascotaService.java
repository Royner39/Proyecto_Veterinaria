package com.lp.proyecto_veterinaria.interfaceService;

import com.lp.proyecto_veterinaria.model.Cliente;
import com.lp.proyecto_veterinaria.model.Mascota;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IMascotaService {
    List<Mascota> listar();
    List<Mascota> listarByCliente(Cliente cliente);
    Optional<Mascota> listarId(int id_mascota);
    int save(Mascota m);
    void delete(int id_mascota);

}
