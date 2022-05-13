
package com.proyectoFinal.proyectoFinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    
  
    
  //@ManyToMany(mappedBy="tipoEducaciones")
  //@JsonIgnore
 //private Collection<Educacion> educaciones = new HashSet();


    public Tipo_educacion() {
    }
    
    
    
    
    

    public Tipo_educacion(Long id, String nombreTipoEducacion) {
        this.id = id;
        this.nombreTipoEducacion = nombreTipoEducacion;
        //this.educaciones = educaciones;
        
    }

  
}