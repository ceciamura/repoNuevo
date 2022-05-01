
package com.proyectoFinal.proyectoFinal.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="sexo")
@Getter
@Setter

public class Sexo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column (name="sexo")
    private String sexo;

    public Sexo() {
    }

    public Sexo(Long id, String sexo) {
        this.id = id;
        this.sexo = sexo;
    }
    
    
    
}
