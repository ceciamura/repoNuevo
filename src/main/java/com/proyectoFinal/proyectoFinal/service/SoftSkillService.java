
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.SoftSkill;
import com.proyectoFinal.proyectoFinal.repository.SoftSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillService implements ISoftSkillService {
 @Autowired
     public SoftSkillRepository softRepo;
    
    
    @Override
    public List<SoftSkill> verSoftSkills() {
        return softRepo.findAll();
    }

    @Override
    public void crearSoftSkills(SoftSkill soft) {
          softRepo.save(soft);
    }

    @Override
    public void borrarSoftSkills(Long id) {
         softRepo.deleteById(id);
    }

    @Override
    public SoftSkill buscarSoftSkills(Long id) {
         return softRepo.findById(id).orElse(null);

    }

    @Override
    public void editarSoftSkills(SoftSkill soft) {
           softRepo.save(soft);

    }

    @Override
    public SoftSkill editarSoftSkillsConId(SoftSkill soft, Long id) {

      SoftSkill softSkillsModificada= softRepo.findById(id).orElse(null);
        
         softSkillsModificada.setSoftSkill(soft.getSoftSkill());
       
       
        return softRepo.save(softSkillsModificada);
    }
    
    
}
