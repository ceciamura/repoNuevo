
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Tecnologia;
import com.proyectoFinal.proyectoFinal.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{

    @Autowired
    public TecnologiaRepository tecnoRepo;
    
    @Override
    public List<Tecnologia> verTecnologias() {
          return tecnoRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologia tecno) {
         tecnoRepo.save(tecno);
    }

    @Override
    public void borrarTecnologia(Long id) {
          tecnoRepo.deleteById(id);
    }

    @Override
    public Tecnologia buscarTecnologia(Long id) {
           return tecnoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarTecnologia(Tecnologia tecno) {
         tecnoRepo.save(tecno);
    }
    
}
