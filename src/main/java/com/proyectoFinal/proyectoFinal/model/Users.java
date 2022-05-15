
package com.proyectoFinal.proyectoFinal.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="users")
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name="id")
    private Long id;
    
    @Column (name="emailUsuario")
    private String emailUsuario;
    
    @Column (name="contrasenia")
    private String contrasenia;
    
    //Mapeo con persona
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="fk_persona")
    private Persona persona;
    

    public Users() {
    }

    public Users(Long id, String emailUsuario, String contrasenia, Persona persona) {
        this.id = id;
        this.emailUsuario = emailUsuario;
        this.contrasenia = contrasenia;
        this.persona = persona;
    } 

    

    
    
   
    

    
    
}

