
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Tecnologia;
import java.util.List;


public interface ITecnologiaService {
    public List<Tecnologia> verTecnologias();
    public void crearTecnologia (Tecnologia tecno);
    public void borrarTecnologia(Long id);
    public Tecnologia buscarTecnologia(Long id);
}
