
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Proyecto;
import com.proyectoFinal.proyectoFinal.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectoRepository proyRep;
    
    @Override
    public List<Proyecto> verProyectos() {
          return proyRep.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proy) {
          proyRep.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
         proyRep.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
          return proyRep.findById(id).orElse(null);
    }
    
}
