
package com.proyectoFinal.proyectoFinal.repository;

import com.proyectoFinal.proyectoFinal.model.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoRepository extends JpaRepository<Sexo,Long>{
    
}
