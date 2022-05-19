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
@Table(name="SoftSkill")
public class SoftSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name="id")
    private Long id;
    
    @Column (name="softSkill")
    @JsonProperty("softSkills")
  
    private String softSkill;

    @Override
    public String toString() {
        return "SoftSkills{" + "softSkill=" + softSkill + '}';
    }
    
   
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona_id;

    public SoftSkills() {
    }

    public SoftSkills(Long id, String softSkill, Persona persona_id) {
        this.id = id;
        this.softSkill = softSkill;
        this.persona_id = persona_id;
    }

    

    

 

   
    
}
