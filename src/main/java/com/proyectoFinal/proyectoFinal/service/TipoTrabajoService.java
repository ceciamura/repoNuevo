
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Tipo_trabajo;
import com.proyectoFinal.proyectoFinal.repository.TipoTrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class TipoTrabajoService implements ITipoTrabajoService {

    @Autowired
    public TipoTrabajoRepository tipoTrabRepo;
    @Override
    public List<Tipo_trabajo> verTipoTrabajos() {
        return tipoTrabRepo.findAll();
    }

    @Override
    public void crearTipoTrabajo(Tipo_trabajo tipoTrab) {
       tipoTrabRepo.save(tipoTrab);
    }

    @Override
    public void borrarTipoTrabajo(Long id) {
      tipoTrabRepo.deleteById(id);

    }

    @Override
    public Tipo_trabajo buscarTipoTrabajo(Long id) {
            return tipoTrabRepo.findById(id).orElse(null);
        }
    
}
