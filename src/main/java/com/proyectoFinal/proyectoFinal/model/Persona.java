/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoFinal.proyectoFinal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;



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
    
    @Temporal (TemporalType.DATE)
    @Column (name="fechaNac")
    private Date fechaNac;
    
    @Column (name="domicilio")
    private String domicilio;
    
    @Column (name="email")
    private String email;
    
    @Column (name="urlFoto")
    private String urlFoto;
    
    @ManyToOne
    @JoinColumn(name="id_sexo")
    private Sexo id_sexo;
     
    @OneToOne
    @JoinColumn(name="fk_user")
    private Users user;
    
    
    
  
    
    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, Date fechaNac, String domicilio, String email, String urlFoto, Sexo id_sexo, Users user) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.email = email;
        this.urlFoto = urlFoto;
        this.id_sexo = id_sexo;
        this.user = user;
    }

    

    
}
