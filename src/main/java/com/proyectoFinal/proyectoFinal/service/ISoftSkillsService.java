/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.SoftSkills;
import java.util.List;

public interface ISoftSkillsService {
     public List<SoftSkills> verSoftSkills();
    public void crearSoftSkills(SoftSkills soft);
    public void borrarSoftSkills (Long id);
    public SoftSkills buscarSoftSkills (Long id);
    public void editarSoftSkills(SoftSkills soft);
    public SoftSkills  editarSoftSkillsConId(SoftSkills soft, Long id);
}
