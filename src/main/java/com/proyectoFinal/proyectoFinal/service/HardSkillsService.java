/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.HardSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectoFinal.proyectoFinal.repository.HardSkillsRepository;

@Service
public class HardSkillsService implements IHardSkillsService {
    @Autowired
     public HardSkillsRepository hardRepo;

    @Override
    public List<HardSkills> verHardSkills() {
         return hardRepo.findAll();

    }

    @Override
    public void crearHardSkills(HardSkills hard) {
          hardRepo.save(hard);
    }

    @Override
    public void borrarHardSkills(Long id) {
           hardRepo.deleteById(id);
    }

    @Override
    public HardSkills buscarHardSkills(Long id) {
         return hardRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHardSkills(HardSkills hard) {
              hardRepo.save(hard);
    }

    @Override
    public HardSkills editarHardSkillsConId(HardSkills hard, Long id) {
 HardSkills hardSkillsModificada= hardRepo.findById(id).orElse(null);
        
         hardSkillsModificada.setLogo(hard.getLogo());
         hardSkillsModificada.setNombreHard(hard.getNombreHard());
         hardSkillsModificada.setColorExterno(hard.getColorExterno());
         hardSkillsModificada.setColorInterno(hard.getColorInterno());
         hardSkillsModificada.setPorcentaje(hard.getPorcentaje());
       
        return hardRepo.save(hardSkillsModificada);
    }
    
}
