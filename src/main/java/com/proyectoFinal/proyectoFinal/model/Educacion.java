
package com.proyectoFinal.proyectoFinal.model;

import java.util.Date;
import java.util.Set;
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


@Getter @Setter
@Entity
@Table(name="educacion")
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
    
    @Column (name="nombreEducacion")
    private String nombreEducacion;
    
    @Temporal (TemporalType.DATE)
    @Column (name="fechaInicio")
    private Date fechaInicio;
    
    @Temporal (TemporalType.DATE)
    @Column (name="fechaFin")
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name="persona_idPersona")
    private Persona persona_idPersona; 
    
    @ManyToMany(mappedBy = "educaciones")
     private Set<Tipo_educacion> tiposEducaciones;

    public Educacion() {
    }

    public Educacion(Long id, String nombreEducacion, Date fechaInicio, Date fechaFin, Persona persona_idPersona, Set<Tipo_educacion> tiposEducaciones) {
        this.id= id;
        this.nombreEducacion = nombreEducacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.persona_idPersona = persona_idPersona;
        this.tiposEducaciones = tiposEducaciones;
    }
    
    
}