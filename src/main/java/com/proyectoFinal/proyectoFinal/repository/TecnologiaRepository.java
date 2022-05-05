
package com.proyectoFinal.proyectoFinal.repository;

import com.proyectoFinal.proyectoFinal.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long>{

   
    
}
