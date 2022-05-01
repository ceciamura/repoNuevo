
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Tipo_educacion;
import java.util.List;


public interface ITipoEducacionService {
     public List<Tipo_educacion> verTipoEducacion();
    public void crearTipoEducacion (Tipo_educacion edu);
    public void borrarTipoEducacion(Long id);
    public Tipo_educacion buscarTipoEducacion(Long id);
}
