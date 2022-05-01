
package com.proyectoFinal.proyectoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name="tipo_trabajo")
public class Tipo_trabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
    
    @Column (name="nombreTipoTrabajo")
    private String nombreTipoTrabajo;

    public Tipo_trabajo() {
    }

    public Tipo_trabajo(Long id, String nombreTipoTrabajo) {
        this.id = id;
        this.nombreTipoTrabajo = nombreTipoTrabajo;
    }
    
    
    
}
