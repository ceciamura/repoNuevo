
package com.proyectoFinal.proyectoFinal.service;


import com.proyectoFinal.proyectoFinal.model.Sexo;
import com.proyectoFinal.proyectoFinal.repository.SexoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SexoService implements ISexoService {

    @Autowired
    public SexoRepository sexoRepo;

    @Override
    public List<Sexo> verSexo() {
        return sexoRepo.findAll();
    }

    @Override
    public void crearSexo(Sexo sexo) {
            sexoRepo.save(sexo);
    }

    @Override
    public void borrarSexo(Long id) {
         sexoRepo.deleteById(id);
    }

    @Override
    public Sexo buscarSexo(Long id) {
        return sexoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarSexo(Sexo sexo) {
       sexoRepo.save(sexo);
    }
    
}
