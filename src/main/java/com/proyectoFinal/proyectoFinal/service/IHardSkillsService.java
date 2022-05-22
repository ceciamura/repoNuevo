/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.HardSkills;
import java.util.List;

public interface IHardSkillsService {
     public List<HardSkills> verHardSkills();
    public void crearHardSkills(HardSkills hard);
    public void borrarHardSkills (Long id);
    public HardSkills buscarHardSkills (Long id);
    public void editarHardSkills(HardSkills hard);
    public HardSkills  editarHardSkillsConId(HardSkills hard, Long id);
}
