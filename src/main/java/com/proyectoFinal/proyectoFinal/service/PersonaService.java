
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Persona;
import com.proyectoFinal.proyectoFinal.repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class PersonaService implements IPersonaService{

     @Autowired
     public PersonaRepository persoRepo;
    
     
     
    @Override
    public List<Persona> verPersonas() {
      return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
         persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

     @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public Persona editarPersonaConId(Persona per, Long id) {
         Persona personaModificada= persoRepo.findById(id).orElse(null);
        
         personaModificada.setNombre(per.getNombre());
         personaModificada.setApellido(per.getApellido());
         personaModificada.setDomicilio(per.getDomicilio());
         personaModificada.setEmail(per.getEmail());
         personaModificada.setUrlFoto(per.getUrlFoto());
       
        return persoRepo.save(personaModificada);
                 
        
    
    }

    
}
