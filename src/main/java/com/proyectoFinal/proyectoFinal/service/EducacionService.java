
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Educacion;
import com.proyectoFinal.proyectoFinal.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
     @Autowired
     public EducacionRepository eduRepo;
     

    @Override
    public List<Educacion> verEducacion() {
       return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
         eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
          eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
           return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public Educacion editarEducacionConId(Educacion edu, Long id) {
         Educacion educacionModificada= eduRepo.findById(id).orElse(null);
        
         educacionModificada.setNombreEducacion(edu.getNombreEducacion());
         educacionModificada.setFechaInicio(edu.getFechaInicio());
         educacionModificada.setFechaFin(edu.getFechaFin());
         educacionModificada.setPersona_id(edu.getPersona_id());
         educacionModificada.setTipoEducacion(edu.getTipoEducacion());
         
       
        return eduRepo.save(educacionModificada);
                 
        
    
    }
    
    
}
