/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.proyectoFinal.proyectoFinal.enums;


public enum tipoExperiencia {
    FULLTIME("FullTime"),
    FREELANCE("Freelance");
    
   private tipoExperiencia(String texto){
       this.texto=texto;
   }
   private String texto;
   
   public String getTexto(){
    return this.texto;
}
}
