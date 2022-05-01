
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    
    public List<Proyecto> verProyectos();
    public void crearProyecto (Proyecto proy);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);
    
}
