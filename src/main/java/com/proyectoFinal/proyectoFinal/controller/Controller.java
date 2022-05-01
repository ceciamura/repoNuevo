
package com.proyectoFinal.proyectoFinal.controller;

import com.proyectoFinal.proyectoFinal.model.Educacion;
import com.proyectoFinal.proyectoFinal.model.Experiencia_laboral;
import com.proyectoFinal.proyectoFinal.model.Persona;
import com.proyectoFinal.proyectoFinal.model.Proyecto;
import com.proyectoFinal.proyectoFinal.model.Sexo;
import com.proyectoFinal.proyectoFinal.model.Tecnologia;
import com.proyectoFinal.proyectoFinal.model.Tipo_educacion;
import com.proyectoFinal.proyectoFinal.model.Tipo_trabajo;

import com.proyectoFinal.proyectoFinal.model.Users;
import com.proyectoFinal.proyectoFinal.service.IEducacionService;
import com.proyectoFinal.proyectoFinal.service.IExperienciaLaboralService;
import com.proyectoFinal.proyectoFinal.service.IPersonaService;
import com.proyectoFinal.proyectoFinal.service.IProyectoService;
import com.proyectoFinal.proyectoFinal.service.ISexoService;
import com.proyectoFinal.proyectoFinal.service.ITecnologiaService;
import com.proyectoFinal.proyectoFinal.service.ITipoEducacionService;
import com.proyectoFinal.proyectoFinal.service.ITipoTrabajoService;
import com.proyectoFinal.proyectoFinal.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
 
  //Controller persona  
    @Autowired
    private IPersonaService persoServ;
   
   @PostMapping("/new/persona")
   public void crearPersona (@RequestBody Persona pers){
      persoServ.crearPersona(pers);
   }
   
   @GetMapping("/ver/personas")
   @ResponseBody 
   public  List<Persona> verPersonas(){
        return persoServ.verPersonas();
   }
   
   @DeleteMapping("/delete/{id}")
   public void borrarPersona(@PathVariable Long id){
       persoServ.borrarPersona(id);
   }
   //agregar update persona 
   
    //------------------------------------------------------------------------- 
   //Controller Sexo
   
   @Autowired
   private ISexoService sexoServ;
   
   @PostMapping("/new/sexo")
   public void crearSexo(@RequestBody Sexo sexo){
       sexoServ.crearSexo(sexo);
       
   }
   
   @GetMapping("/ver/sexo")
   @ResponseBody
   public List<Sexo> verSexo(){
       return sexoServ.verSexo();
   }
   
   @DeleteMapping("/deleteSexo/{id}")
   public void borrarSexo(@PathVariable Long id){
       sexoServ.borrarSexo(id);
   }
   //agregar update sexo
   
    //------------------------------------------------------------------------- 
   //Controller User
   
   @Autowired
   private IUserService userServ;
   
   @PostMapping("/new/user")
   public void crearUser(@RequestBody Users user){
       userServ.crearUser(user);
       
   }
   
   @GetMapping("/ver/user")
   @ResponseBody
   public List<Users> verUsers(){
       return userServ.verUsers();
   }
   
   @DeleteMapping("/deleteUser/{id}")
   public void borrarUser(@PathVariable Long id){
       userServ.borrarUser(id);
   }
   //agregar update sexo
   
    //------------------------------------------------------------------------- 
   //Controller Proyecto
   
   @Autowired
   private IProyectoService proyServ;
   
   @PostMapping("/new/proyecto")
   public void crearProyecto(@RequestBody Proyecto proy){
       proyServ.crearProyecto(proy);
       
   }
   
   @GetMapping("/ver/proyecto")
   @ResponseBody
   public List<Proyecto> verProyectos(){
       return proyServ.verProyectos();
   }
   
   @DeleteMapping("/deleteProyecto/{id}")
   public void borrarProyecto(@PathVariable Long id){
       proyServ.borrarProyecto(id);
   }
   //agregar update proyecto
   
   //------------------------------------------------------------------------- 
   //Controller Tecnologia
   
   @Autowired
   private ITecnologiaService tecnoServ;
   
   @PostMapping("/new/tecnologia")
   public void crearTecnologia(@RequestBody Tecnologia tecno){
       tecnoServ.crearTecnologia(tecno);
       
   }
   
   @GetMapping("/ver/tecnologia")
   @ResponseBody
   public List<Tecnologia> verTecnologias(){
       return tecnoServ.verTecnologias();
   }
   
   @DeleteMapping("/deleteTecnologia/{id}")
   public void borrarTecnologia(@PathVariable Long id){
       tecnoServ.borrarTecnologia(id);
   }
   //agregar update tecnologia
   
    //------------------------------------------------------------------------- 
   //Controller Experiencia Laboral
   
   @Autowired
   private IExperienciaLaboralService expoServ;
   
   @PostMapping("/new/experienciaLab")
   public void crearExperienciaLaboral(@RequestBody Experiencia_laboral expo){
       expoServ.crearExperienciaLaboral(expo);
       
   }
   
   @GetMapping("/ver/experienciaLab")
   @ResponseBody
   public List<Experiencia_laboral> verExperienciaLaboral(){
       return expoServ.verExperienciaLaboral();
   }
   
   @DeleteMapping("/deleteExperiencia/{id}")
   public void borrarExperienciaLaboral(@PathVariable Long id){
       expoServ.borrarExperienciaLaboral(id);
   }
   //agregar update tecnologia
   
   //------------------------------------------------------------------------- 
   //Controller Experiencia Laboral
   
   @Autowired
   private ITipoEducacionService tipoEduServ;
   
   @PostMapping("/new/tipoEdu")
   public void crearTipoEducacion(@RequestBody Tipo_educacion edu){
       tipoEduServ.crearTipoEducacion(edu);
       
   }
   
   @GetMapping("/ver/tipoEdu")
   @ResponseBody
   public List<Tipo_educacion> verTipoEducacion(){
       return tipoEduServ.verTipoEducacion();
   }
   
   @DeleteMapping("/deleteTipoEdu/{id}")
   public void borrarTipoEducacion(@PathVariable Long id){
       tipoEduServ.borrarTipoEducacion(id);
   }
   //agregar update tecnologia
   
   //------------------------------------------------------------------------- 
   //Controller TipoTrabajo
   
  @Autowired
  private ITipoTrabajoService tipoTrabServ;
   
   @PostMapping("/new/tipoTrabajo")
   public void crearTipoTrabajo(@RequestBody Tipo_trabajo tipoTrab){
     tipoTrabServ.crearTipoTrabajo(tipoTrab);
   }
   
   @GetMapping("/ver/tipoTrabajo")
   @ResponseBody 
   public List<Tipo_trabajo> verTipTrabjos(){
       return tipoTrabServ.verTipoTrabajos();
   }
   
   @DeleteMapping("/deleteTipoTrabajo/{id}")
   public void borrarTipoTrabjo(@PathVariable Long id){
       tipoTrabServ.borrarTipoTrabajo(id);
   }
   //agregar update tecnologia
   
   //------------------------------------------------------------------------- 
   //Controller Educacion
   
  @Autowired
  private IEducacionService eduServ;
   
   @PostMapping("/new/educacion")
   public void crearEducacion(@RequestBody Educacion edu){
     eduServ.crearEducacion(edu);
   }
   
   @GetMapping("/ver/educacion")
   @ResponseBody 
   public List<Educacion> verEducacion(){
       return eduServ.verEducacion();
   }
   
   @DeleteMapping("/deleteEducacion/{id}")
   public void borrarEducacion(@PathVariable Long id){
       eduServ.borrarEducacion(id);
   }
   //agregar update educacion
   
}

