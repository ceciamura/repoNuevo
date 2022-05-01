
package com.proyectoFinal.proyectoFinal.repository;

import com.proyectoFinal.proyectoFinal.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
    
}
