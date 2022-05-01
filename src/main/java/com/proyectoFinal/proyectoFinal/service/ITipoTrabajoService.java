
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Tipo_trabajo;
import java.util.List;


public interface ITipoTrabajoService {
    public List<Tipo_trabajo> verTipoTrabajos();
    public void crearTipoTrabajo (Tipo_trabajo tipoTrab);
    public void borrarTipoTrabajo (Long id);
    public Tipo_trabajo buscarTipoTrabajo (Long id);
}
