package com.lp.proyecto_veterinaria.service;

import com.lp.proyecto_veterinaria.interfaceService.IMascotaService;
import com.lp.proyecto_veterinaria.interfaces.IMascota;
import com.lp.proyecto_veterinaria.model.Cliente;
import com.lp.proyecto_veterinaria.model.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascota data;

    @Override
    public List<Mascota> listar() {

        return (List<Mascota>)data.findAll();
    }

    public List<Mascota> listarByCliente(Cliente cliente) {

        return cliente.getMascotas();
    }

    @Override
    public Optional<Mascota> listarId(int id_mascota) {
        return data.findById(id_mascota);
    }

    @Override
    public int save(Mascota m) {
        int res = 0;
        Mascota mascota = data.save(m);
        if (!mascota.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id_mascota) {
        data.deleteById(id_mascota);
    }
}

