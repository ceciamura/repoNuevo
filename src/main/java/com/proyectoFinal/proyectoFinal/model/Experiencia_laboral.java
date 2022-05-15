
package com.proyectoFinal.proyectoFinal.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.proyectoFinal.proyectoFinal.enums.tipoExperiencia;
import java.util.Collection;

import java.util.Date;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
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
    @Column (name="nombre_experiencia")
    private String nombre_experiencia;
    
    @Column (name="es_actual")
    private boolean es_actual;
   
    
   
    @Temporal(javax.persistence.TemporalType.DATE)
     @Column (name="fecha_inicio")
     @JsonFormat(pattern="yyyy-MM-dd")
    private Date fecha_inicio;
    
    
   
     
  
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name="fecha_fin")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fecha_fin;
     
     
    @Column (name="descripcion")
    private String descripcion;
    
    // @Column (name="tipoExperiencia")
    // private tipoExperiencia tipoExperiencia;
   
    @ManyToOne
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id;
    
    
    
   @ManyToOne
   @JoinColumn(name="tipoTrabajo_id")
  //  @JsonBackReference
   private Tipo_trabajo tipoTrabajos;
    
   

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Long id, String nombre_experiencia, boolean es_actual, Date fecha_inicio, Date fecha_fin, String descripcion, Persona persona_id, Tipo_trabajo tipoTrabajos) {
        this.id = id;
        this.nombre_experiencia = nombre_experiencia;
        this.es_actual = es_actual;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.persona_id = persona_id;
        this.tipoTrabajos = tipoTrabajos;
    }

   

  

   

   
   

  



    

   
    
    
     
}
