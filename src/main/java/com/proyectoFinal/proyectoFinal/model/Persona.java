
package com.proyectoFinal.proyectoFinal.model;



import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;



@Getter @Setter
@Entity
@Table(name="persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name="id")
    private Long id;
    
    @Column (name="nombre")
    private String nombre;
    
    @Column (name="apellido")
    private String apellido;
    
    //@Temporal (TemporalType.DATE)
    //@Column (name="fechaNac")
    //private Date fechaNac;
    
    @Column (name="domicilio")
    private String domicilio;
    
    @Column (name="email")
    private String email;
    
    @Column (name="urlFoto")
    private String urlFoto;
    
    
    @ManyToOne
    @JoinColumn(name="fk_sexo")
    private Sexo fk_sexo;
     
   
 @OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch= FetchType.LAZY)
 @JsonManagedReference
  private List<Experiencia_laboral> experiencias;
 
 @OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch= FetchType.LAZY)
 @JsonManagedReference
  private List<Educacion> educaciones;
 
 @OneToMany(cascade=CascadeType.ALL, mappedBy="persona_id", fetch= FetchType.LAZY)
 @JsonManagedReference
  private List<Proyecto> proyectos;
  
  
   
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String domicilio, String email, String urlFoto, Sexo fk_sexo, List<Experiencia_laboral> experiencias, List<Educacion> educaciones, List<Proyecto> proyectos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.email = email;
        this.urlFoto = urlFoto;
        this.fk_sexo = fk_sexo;
        this.experiencias = experiencias;
        this.educaciones = educaciones;
        this.proyectos = proyectos;
    }

    

   

   

    
}
