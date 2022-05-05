
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Users;
import java.util.List;


public interface IUserService {
    public List<Users> verUsers();
    public void crearUser (Users user);
    public void borrarUser (Long id);
    public Users buscarUser (Long id);
    public Users findByEmailUsuario(String emailUsuario);
     public Users findByEmailUsuarioAndContrasenia(String emailUsuario, String contrasenia);
   
    
}
