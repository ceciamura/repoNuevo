
package com.proyectoFinal.proyectoFinal.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name="experiencia_laboral")
public class Experiencia_laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
    
    @Column (name="nombreExperiencia")
    private String nombreExperiencia;
    
    @Column (name="es_actual")
    private boolean es_Actual;
    
    @Temporal (TemporalType.DATE)
    @Column (name="fechaInicio")
    private Date fechaInicio;
    
    @Temporal (TemporalType.DATE)
    @Column (name="fechaFin")
    private Date fechaFin;
     
     
    @Column (name="descripcion")
    private String descripcion;
     
    @ManyToOne
    @JoinColumn(name="persona_idPersona")
     private Persona persona_idPersona; 
    
    @ManyToOne
    @JoinColumn(name="tipoDeTrabajo_idTrabajo")
    private Tipo_trabajo tipoDeTrabajo_idTrabajo; 

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Long id, String nombreExperiencia, boolean es_Actual, Date fechaInicio, Date fechaFin, String descripcion, Persona persona_idPersona, Tipo_trabajo tipoDeTrabajo_idTrabajo) {
        this.id= id;
        this.nombreExperiencia = nombreExperiencia;
        this.es_Actual = es_Actual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.persona_idPersona = persona_idPersona;
        this.tipoDeTrabajo_idTrabajo = tipoDeTrabajo_idTrabajo;
    }

   
    
     
     
}
