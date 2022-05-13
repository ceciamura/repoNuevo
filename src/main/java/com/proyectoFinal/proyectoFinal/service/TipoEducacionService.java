
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Tipo_educacion;
import com.proyectoFinal.proyectoFinal.repository.TipoEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEducacionService implements ITipoEducacionService{

    @Autowired
    public TipoEducacionRepository tipoEduRepo;
    
    
    @Override
    public List<Tipo_educacion> verTipoEducacion() {
        return tipoEduRepo.findAll();

    }

    @Override
    public void crearTipoEducacion(Tipo_educacion edu) {
              tipoEduRepo.save(edu);

    }

    @Override
    public void borrarTipoEducacion(Long id) {
           tipoEduRepo.deleteById(id);
    }

    @Override
    public Tipo_educacion buscarTipoEducacion(Long id) {
           return tipoEduRepo.findById(id).orElse(null);

    }

    @Override
    public void editarTipoEducacion(Tipo_educacion tipoEdu) {
         tipoEduRepo.save(tipoEdu);
    }
    
    
}
