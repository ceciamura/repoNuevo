
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Experiencia_laboral;
import com.proyectoFinal.proyectoFinal.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService{
     
    @Autowired
    public ExperienciaLaboralRepository expeRepo;
    
    @Override
    public List<Experiencia_laboral> verExperienciaLaboral() {
           return expeRepo.findAll();
    }

    @Override
    public void crearExperienciaLaboral(Experiencia_laboral exper) {
             expeRepo.save(exper);
    }

    @Override
    public void borrarExperienciaLaboral(Long id) {
           expeRepo.deleteById(id);
    }

    @Override
    public Experiencia_laboral buscarExperienciaLaboral(Long id) {
           return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(Experiencia_laboral expe) {
            expeRepo.save(expe);
    }
    
}
