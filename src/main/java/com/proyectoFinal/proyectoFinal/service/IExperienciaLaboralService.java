
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.enums.tipoExperiencia;
import com.proyectoFinal.proyectoFinal.model.Experiencia_laboral;
import java.util.List;


public interface IExperienciaLaboralService {
    
    public List<Experiencia_laboral> verExperienciaLaboral();
    public void crearExperienciaLaboral (Experiencia_laboral exper);
    public void borrarExperienciaLaboral (Long id);
    public Experiencia_laboral buscarExperienciaLaboral (Long id);
    public void editarExperiencia(Experiencia_laboral expe);

    //public List<String> enumToStringList(Class<tipoExperiencia> aClass);
}
