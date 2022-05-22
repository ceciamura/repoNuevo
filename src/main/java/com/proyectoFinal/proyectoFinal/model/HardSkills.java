/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoFinal.proyectoFinal.model;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="HardSkill")
public class HardSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
   
    
    @Column (name="porcentaje")
    private Integer porcentaje;
    
    @Column (name="nombreHard")
    private String nombreHard;
    
    @Column (name="logo")
    private String logo;
    
    @Column(name="colorExterno")
    private String colorExterno;
    
    @Column(name="colorInterno")
    private String colorInterno;
   
    
   
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id;

    public HardSkills() {
    }

    public HardSkills(Long id,  Integer porcentaje, String nombreHard, String logo, String colorExterno, String colorInterno, Persona persona_id) {
        this.id = id;
        
        this.porcentaje = porcentaje;
        this.nombreHard = nombreHard;
        this.logo = logo;
        this.colorExterno = colorExterno;
        this.colorInterno = colorInterno;
        this.persona_id = persona_id;
    }

    
  

   
    

   
  

    

    

 

   
    
}
