
package com.proyectoFinal.proyectoFinal.repository;

import com.proyectoFinal.proyectoFinal.model.Tipo_educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEducacionRepository extends JpaRepository<Tipo_educacion, Long>{
    
}
