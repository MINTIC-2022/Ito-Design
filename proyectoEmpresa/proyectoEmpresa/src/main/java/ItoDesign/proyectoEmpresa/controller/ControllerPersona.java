package ItoDesign.proyectoEmpresa.controller;

import ItoDesign.proyectoEmpresa.Repository.EntityUsuario;
import ItoDesign.proyectoEmpresa.services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/persona")
public class ControllerPersona {
    @Autowired                                                            // Sirve para simplificar el new la instanciacion
    ServiceUsuario servicesPersona;

    //@ResponseBody

    @GetMapping(path = "/udea/mintic/listarTodosUsuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> listartodo(){
        return  new ResponseEntity<Object>(servicesPersona.listarTodosUsuario(), HttpStatus.OK)  ;
    }

    @PostMapping(path = "/udea/mintic/insertarUsuario", consumes =  MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <Boolean> insertarUsuario (@RequestBody EntityUsuario persona){

        return new ResponseEntity<Boolean>(servicesPersona.insertaUsuario(persona), HttpStatus.OK);

    }

    @GetMapping(path="/udea/mintic/visualizarFilaUsuarioJPA/{id}",produces = MediaType.APPLICATION_JSON_VALUE)

    public  ResponseEntity<Object>visualizarFilaUsuarioJPA( @PathVariable  Long id){
        return new  ResponseEntity <Object>(servicesPersona.visualizarIdPersonaJPA(id), HttpStatus.OK);
    }



    @PatchMapping(path = "/udea/mintic/actualizarParcialUsuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> actualizarParcialUsuarioJPA(@RequestBody EntityUsuario persona){

        return new ResponseEntity<Object>(servicesPersona.actualizarParcialUsuarioJPA(persona), HttpStatus.OK);

    }

    @DeleteMapping(path = "/udea/mintic/borrarUsuario/{id}")
    public ResponseEntity<Boolean> borrarUsuario(@PathVariable Long id){
        servicesPersona.borrarPersona(id);
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

}
