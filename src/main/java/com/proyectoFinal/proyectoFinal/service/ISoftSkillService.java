
package com.proyectoFinal.proyectoFinal.service;


import com.proyectoFinal.proyectoFinal.model.SoftSkill;
import java.util.List;


public interface ISoftSkillService {
     public List<SoftSkill> verSoftSkills();
    public void crearSoftSkills(SoftSkill soft);
    public void borrarSoftSkills (Long id);
    public SoftSkill buscarSoftSkills (Long id);
    public void editarSoftSkills(SoftSkill soft);
    public SoftSkill  editarSoftSkillsConId(SoftSkill soft, Long id);
}
