
package com.proyectoFinal.proyectoFinal.repository;

import com.proyectoFinal.proyectoFinal.model.Experiencia_laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository<Experiencia_laboral, Long> {
    
}
