
package com.proyectoFinal.proyectoFinal.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name="tipoEducacion")
public class Tipo_educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
    
    @Column (name="nombreTipoEducacion")
    private String nombreTipoEducacion;
    
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "tipoEducacion_educacion",
            joinColumns = {@JoinColumn(name = "tipoEducacion_id")},
            inverseJoinColumns = {@JoinColumn(name = "educacion_id")}
    )
    private Set<Educacion> educaciones;


    public Tipo_educacion() {
    }

    public Tipo_educacion(Long id, String nombreTipoEducacion, Set<Educacion> educaciones) {
        this.id = id;
        this.nombreTipoEducacion = nombreTipoEducacion;
        this.educaciones = educaciones;
    }

  
}