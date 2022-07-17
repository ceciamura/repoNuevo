
package com.proyectoFinal.proyectoFinal.controller;

import com.proyectoFinal.proyectoFinal.enums.tipoExperiencia;
import com.proyectoFinal.proyectoFinal.model.Educacion;
import com.proyectoFinal.proyectoFinal.model.Experiencia_laboral;
import com.proyectoFinal.proyectoFinal.model.Persona;
import com.proyectoFinal.proyectoFinal.model.Proyecto;
import com.proyectoFinal.proyectoFinal.model.Sexo;
import com.proyectoFinal.proyectoFinal.model.HardSkills;
import com.proyectoFinal.proyectoFinal.model.SoftSkill;
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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.proyectoFinal.proyectoFinal.service.IHardSkillsService;
import com.proyectoFinal.proyectoFinal.service.ISoftSkillService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController

//@CrossOrigin(origins="https://argprogceciamura.web.app")
@RequestMapping("/api/")
public class Controller {
 
  //Controller persona  
    @Autowired
    private IPersonaService persoServ;
    
   
   
   @PostMapping("persona/new")
   public void crearPersona (@RequestBody Persona pers){
      persoServ.crearPersona(pers);
  }
   
   @GetMapping( "persona/buscar/{id}")
   public Persona buscarPersona(@PathVariable Long id) {
   return persoServ.buscarPersona(id);
	}
   
   
   @GetMapping("persona/ver")
   @ResponseBody 
   public  List<Persona> verPersonas(){
        return persoServ.verPersonas();
   }
   
   
   @DeleteMapping("persona/delete/{id}")
   public void borrarPersona(@PathVariable Long id){
       persoServ.borrarPersona(id);
   }
  
    @PutMapping("persona/edit")
   public void editarPersona(@RequestBody Persona per){
       persoServ.editarPersona(per);
   }
   
    @PutMapping("persona/editar/{id}")
   public Persona editarPersonaConId(@RequestBody Persona per, @PathVariable Long id){
       return persoServ.editarPersonaConId(per, id);
   }
  
    //------------------------------------------------------------------------- 
   //Controller Sexo
   
   @Autowired
   private ISexoService sexoServ;
   
   @PostMapping("sexo/new")
   public void crearSexo(@RequestBody Sexo sexo){
       sexoServ.crearSexo(sexo);
       
      
   }
   
   @GetMapping("sexo/ver")
   @ResponseBody
   public List<Sexo> verSexo(){
       return sexoServ.verSexo();
   }
   @GetMapping( "sexo/buscar/{id}")
   public Sexo buscarSexo(@PathVariable Long id) {
   return sexoServ.buscarSexo(id);
	}
   
   @DeleteMapping("sexo/delete/{id}")
   public void borrarSexo(@PathVariable Long id){
       sexoServ.borrarSexo(id);
   }
   
   
     @PutMapping("sexo/edit")
   public void editarSexo(@RequestBody Sexo sexo){
     sexoServ.editarSexo(sexo);
   }
   
    //------------------------------------------------------------------------- 
   //Controller User
   
   @Autowired
   private IUserService userServ;   
   
   @PostMapping("user/new")
   //@ResponseBody
   public  void crearUser(@RequestBody Users user){
       userServ.crearUser(user);
   }
   
   @GetMapping("user/ver")
   @ResponseBody
   public List<Users> verUsers(){
       return userServ.verUsers();
   }
   
   @GetMapping( "user/buscar/{id}")
   public Users buscarUser(@PathVariable Long id) {
   return userServ.buscarUser(id);
	}
   
   @DeleteMapping("user/delete/{id}")
   public void borrarUser(@PathVariable Long id){
       userServ.borrarUser(id);
   }
   
   @PutMapping("user/edit")
   public void editarUser(@RequestBody Users u){
       userServ.editarUser(u);
   }
   
   
   @GetMapping("user/email/{emailUsuario}")
   @ResponseBody
   public Users emailUsuario(@PathVariable  String emailUsuario){
        return userServ.findByEmailUsuario(emailUsuario);
   }
   
    @PostMapping("user/login")
    @ResponseBody
    public Users login(@RequestBody Users u){
    return(userServ.findByEmailUsuarioAndContrasenia(u.getEmailUsuario(), u.getContrasenia()));
}
   
  
   
    
   
    //------------------------------------------------------------------------- 
   //Controller Proyecto
   
   @Autowired
   private IProyectoService proyServ;
   
   @PostMapping("proyecto/new")
   public void crearProyecto(@RequestBody Proyecto proy){
       proyServ.crearProyecto(proy);
       
   }
   
   @GetMapping("proyecto/ver")
   @ResponseBody
   public List<Proyecto> verProyectos(){
       return proyServ.verProyectos();
   }
   
   @GetMapping( "proyecto/buscar/{id}")
   public Proyecto buscarProyecto(@PathVariable Long id) {
   return proyServ.buscarProyecto(id);
	}
   
   
   @DeleteMapping("proyecto/delete/{id}")
   public void borrarProyecto(@PathVariable Long id){
       proyServ.borrarProyecto(id);
   }
  
   @PutMapping("proyecto/edit")
   public void editarProyecto(@RequestBody Proyecto proy){
      proyServ.editarProyecto(proy);
   }
   
   //------------------------------------------------------------------------- 
   //Controller Tecnologia
   
   @Autowired
   private ITecnologiaService tecnoServ;
   
  
   
   @GetMapping("tecnologia/ver")
   @ResponseBody
   public List<Tecnologia> verTecnologias(){
       return tecnoServ.verTecnologias();
   }
   
    @PostMapping("tecnologia/new")
   public void crearTecnologia(@RequestBody Tecnologia tecno){
       tecnoServ.crearTecnologia(tecno);
       
   }
   
   @GetMapping( "tecnologia/buscar/{id}")
   public Tecnologia buscarTecnologia(@PathVariable Long id) {
   return tecnoServ.buscarTecnologia(id);
	}
   
   @DeleteMapping("tecnologia/delete/{id}")
   public void borrarTecnologia(@PathVariable Long id){
       tecnoServ.borrarTecnologia(id);
   }
   
   @PutMapping("tecnologia/edit")
   public void editarTecnologia(@RequestBody Tecnologia tecno){
     tecnoServ.editarTecnologia(tecno);
   }
   
    //------------------------------------------------------------------------- 
   //Controller Experiencia Laboral
   
   @Autowired
   private IExperienciaLaboralService expoServ;
   
   @PostMapping("experiencia/new")
   public void crearExperienciaLaboral(@RequestBody Experiencia_laboral expo){
       System.out.println(expo.toString());
       expoServ.crearExperienciaLaboral(expo);
       
   }
   
   @GetMapping("experiencia/ver")
   @ResponseBody
   public List<Experiencia_laboral> verExperienciaLaboral(){
       return expoServ.verExperienciaLaboral();
   }
   
   @GetMapping( "experiencia/buscar/{id}")
   public Experiencia_laboral buscarExperienciaLaboral(@PathVariable Long id) {
   return expoServ.buscarExperienciaLaboral(id);
	}
   
   @DeleteMapping("experiencia/delete/{id}")
   public void borrarExperienciaLaboral(@PathVariable Long id){
       expoServ.borrarExperienciaLaboral(id);
   }
   
    @PutMapping("experiencia/edit")
   public void editarExperiencia(@RequestBody Experiencia_laboral expe){
      expoServ.editarExperiencia(expe);
   }
   
    

   //------------------------------------------------------------------------- 
   //Controller Experiencia Laboral
   
   @Autowired
   private ITipoEducacionService tipoEduServ;
   
   @PostMapping("tipoEdu/new")
   public void crearTipoEducacion(@RequestBody Tipo_educacion edu){
       tipoEduServ.crearTipoEducacion(edu);
       
   }
   
   @GetMapping("tipoEdu/ver")
   @ResponseBody
   public List<Tipo_educacion> verTipoEducacion(){
       return tipoEduServ.verTipoEducacion();
   }
   
   @GetMapping( "tipoEdu/buscar/{id}")
   public Tipo_educacion buscarTipoEducacion(@PathVariable Long id) {
   return tipoEduServ.buscarTipoEducacion(id);
	}
   
   @DeleteMapping("tipoEdu/delete/{id}")
   public void borrarTipoEducacion(@PathVariable Long id){
       tipoEduServ.borrarTipoEducacion(id);
   }
 
   @PutMapping("tipoEdu/edit")
   public void editarTipoEducacion(@RequestBody Tipo_educacion tipoEdu){
     tipoEduServ.editarTipoEducacion(tipoEdu);
   }
   
   //------------------------------------------------------------------------- 
   //Controller TipoTrabajo
   
  @Autowired
  private ITipoTrabajoService tipoTrabServ;
   
   @PostMapping("tipoTrabajo/new")
   public void crearTipoTrabajo(@RequestBody Tipo_trabajo tipoTrab){
     tipoTrabServ.crearTipoTrabajo(tipoTrab);
   }
   
   @GetMapping("tipoTrabajo/ver")
   @ResponseBody 
   public List<Tipo_trabajo> verTipoTrabjos(){
       return tipoTrabServ.verTipoTrabajos();
   }
   
   @GetMapping( "tipoTrabajo/buscar/{id}")
   public Tipo_trabajo buscarTipoTrabajo(@PathVariable Long id) {
   return tipoTrabServ.buscarTipoTrabajo(id);
	}
   
   @DeleteMapping("tipoTrabajo/delete/{id}")
   public void borrarTipoTrabjo(@PathVariable Long id){
       tipoTrabServ.borrarTipoTrabajo(id);
   }
   
   @PutMapping("tipoTrabajo/edit")
   public void editarTipoTrabajo(@RequestBody Tipo_trabajo tipoTrab){
     tipoTrabServ.editarTipoTrabajo(tipoTrab);
   }
   
   //------------------------------------------------------------------------- 
   //Controller Educacion
   
  @Autowired
  private IEducacionService eduServ;
   
   @PostMapping("educacion/new")
   public void crearEducacion(@RequestBody Educacion edu){
     eduServ.crearEducacion(edu);
   }
   
   @GetMapping("educacion/ver")
   @ResponseBody 
   public List<Educacion> verEducacion(){
       return eduServ.verEducacion();
   }
   
   @GetMapping( "educacion/buscar/{id}")
   public Educacion buscarEducacion(@PathVariable Long id) {
   return eduServ.buscarEducacion(id);
	}
   
   @DeleteMapping("educacion/delete/{id}")
   public void borrarEducacion(@PathVariable Long id){
       eduServ.borrarEducacion(id);
   }
   
    @PutMapping("educacion/edit")
   public void editarEducacion(@RequestBody Educacion edu){
       eduServ.editarEducacion(edu);
   }
   
  @PutMapping("educacion/editar/{id}")
   public Educacion editarEducacionConId(@RequestBody Educacion edu, @PathVariable Long id){
       return eduServ.editarEducacionConId(edu, id);
   }
  
//---------------------CONTROLLER SOFTSKILLS--------------------------------------//
    @Autowired
  private IHardSkillsService hardServ;
   
   @PostMapping("hard/new")
   public void crearHardSkills(@RequestBody HardSkills hard){
     hardServ.crearHardSkills(hard);
   }
   
   @GetMapping("hard/ver")
   @ResponseBody 
   public List<HardSkills> verHardSkills(){
       
       
       return hardServ.verHardSkills();
   }
   
   @GetMapping( "hard/buscar/{id}")
   public HardSkills buscarHardSkills(@PathVariable Long id) {
   return hardServ.buscarHardSkills(id);
	}
   
   @DeleteMapping("hard/delete/{id}")
   public void borrarHardSkills(@PathVariable Long id){
       hardServ.borrarHardSkills(id);
   }
   
    @PutMapping("hard/edit")
   public void editarHardSkills(@RequestBody HardSkills hard){
       hardServ.editarHardSkills(hard);
   }
   
  @PutMapping("hard/editar/{id}")
   public HardSkills editarHardSkillsConId(@RequestBody HardSkills hard, @PathVariable Long id){
       return hardServ.editarHardSkillsConId(hard, id);
   }
   
   //---------------------CONTROLLER SOFTSKILLS--------------------------------------//
    @Autowired
  private ISoftSkillService softServ;
   
   @PostMapping("soft/new")
   public void crearSoftSkills(@RequestBody SoftSkill soft){
     softServ.crearSoftSkills(soft);
   }
   
   @GetMapping("soft/ver")
   @ResponseBody 
   public List<SoftSkill> verSoftSkills(){ 
       
       return softServ.verSoftSkills();
   }
   
   @GetMapping( "soft/buscar/{id}")
   public SoftSkill buscarSoftSkills(@PathVariable Long id) {
   return softServ.buscarSoftSkills(id);
	}
   
   @DeleteMapping("soft/delete/{id}")
   public void borrarSoftSkills(@PathVariable Long id){
       softServ.borrarSoftSkills(id);
   }
   
    @PutMapping("soft/edit")
   public void editarSoftSkills(@RequestBody SoftSkill soft){
       softServ.editarSoftSkills(soft);
   }
   
  @PutMapping("soft/editar/{id}")
   public SoftSkill editarSoftSkillsConId(@RequestBody SoftSkill soft, @PathVariable Long id){
       return softServ.editarSoftSkillsConId(soft, id);
   }
   
   
   
   
   
   
       
}

