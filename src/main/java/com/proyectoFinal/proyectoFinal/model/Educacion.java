
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
    
    //@Column (name="tipoEducacion")
    //private String tipoEducacion;
    
    @Temporal (TemporalType.DATE)
    @Column (name="fechaFin")
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id;
    
   //@ManyToMany
   //private Collection<Tipo_educacion> tipoEducaciones = new HashSet();
    
   @ManyToOne
   @JoinColumn(name="tipoeducacion_id")
  //  @JsonBackReference
   private Tipo_educacion tipoEducacion;
    
    public Educacion() {
    }

    public Educacion(Long id, String nombreEducacion, Date fechaInicio, Date fechaFin, Persona persona_id, Tipo_educacion tipoEducacion) {
        this.id = id;
        this.nombreEducacion = nombreEducacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.persona_id = persona_id;
        this.tipoEducacion = tipoEducacion;
    }

    
   

    
    
    
}