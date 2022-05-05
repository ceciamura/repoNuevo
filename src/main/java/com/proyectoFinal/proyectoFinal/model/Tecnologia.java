
package com.proyectoFinal.proyectoFinal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

@Getter
@Setter
@Entity
@Table(name="tecnologia")
public class Tecnologia {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="id")
private Long id;

@Column(name="nombre")
private String nombre;


 @ManyToMany(mappedBy="tecnologias")
 @JsonIgnore
 private Collection<Proyecto> Proyecto = new HashSet();

 
 



    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        //this.proyectos = proyectos;
    }


}