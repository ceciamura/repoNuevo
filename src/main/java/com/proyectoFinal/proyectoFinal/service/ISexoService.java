
package com.proyectoFinal.proyectoFinal.service;


import com.proyectoFinal.proyectoFinal.model.Sexo;
import java.util.List;


public interface ISexoService {
   
    public List<Sexo> verSexo();
    public void crearSexo (Sexo sexo);
    public void borrarSexo (Long id);
    public Sexo buscarSexo (Long id);
    public void editarSexo(Sexo sexo);
}
