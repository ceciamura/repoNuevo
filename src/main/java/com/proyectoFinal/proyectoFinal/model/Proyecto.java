
package com.proyectoFinal.proyectoFinal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="proyecto")

public class Proyecto {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="nombre")
private String nombre;


@Column(name="github")
private String github;

@Column(name="portada")
private String portada;

@Column(name="imagen")
private String imagen;

@Temporal(TemporalType.DATE)
@Column(name="anio")
private Date anio;

    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id;


   @ManyToMany
   private Collection<Tecnologia> tecnologias = new HashSet();



    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String github, String portada, String imagen, Date anio, Persona persona_id) {
        this.id = id;
        this.nombre = nombre;
        this.github = github;
        this.portada = portada;
        this.imagen = imagen;
        this.anio = anio;
        this.persona_id = persona_id;
    }

   

    

   
    


    

   
       
    }
 

   

  
    
     
    



   
   