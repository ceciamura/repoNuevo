
package com.proyectoFinal.proyectoFinal.service;

import com.proyectoFinal.proyectoFinal.model.Users;
import com.proyectoFinal.proyectoFinal.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<Users> verUsers() {
         return userRepo.findAll();
    }

    @Override
    public void crearUser(Users user) {
          userRepo.save(user);
    }

    @Override
    public void borrarUser(Long id) {
         userRepo.deleteById(id);
    }

    @Override
    public Users buscarUser(Long id) {
         return userRepo.findById(id).orElse(null);

    }
    //falta update
}
