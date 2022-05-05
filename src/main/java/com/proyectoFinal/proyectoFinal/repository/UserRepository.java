
package com.proyectoFinal.proyectoFinal.repository;


import com.proyectoFinal.proyectoFinal.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>{

    public Users findByEmailUsuario(String emailUsuario);  

    public Users findByEmailUsuarioAndContrasenia(String emailUsuario, String contrasenia);
    
}
