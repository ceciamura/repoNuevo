/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.SoftSkills;
import com.proyectoFinal.proyectoFinal.repository.SoftSkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillsService implements ISoftSkillsService {
    @Autowired
     public SoftSkillsRepository softRepo;

    @Override
    public List<SoftSkills> verSoftSkills() {
         return softRepo.findAll();

    }

    @Override
    public void crearSoftSkills(SoftSkills soft) {
          softRepo.save(soft);
    }

    @Override
    public void borrarSoftSkills(Long id) {
           softRepo.deleteById(id);
    }

    @Override
    public SoftSkills buscarSoftSkills(Long id) {
         return softRepo.findById(id).orElse(null);
    }

    @Override
    public void editarSoftSkills(SoftSkills soft) {
              softRepo.save(soft);
    }

    @Override
    public SoftSkills editarSoftSkillsConId(SoftSkills soft, Long id) {
 SoftSkills softSkillsModificada= softRepo.findById(id).orElse(null);
        
         softSkillsModificada.setSoftSkill(soft.getSoftSkill());        
       
        return softRepo.save(softSkillsModificada);
    }
    
}
