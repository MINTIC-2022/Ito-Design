package ItoDesign.proyectoEmpresa.controller;

import ItoDesign.proyectoEmpresa.Repository.EntityPersona;
import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainPersona;
import ItoDesign.proyectoEmpresa.services.ServicePersona;
import ItoDesign.proyectoEmpresa.services.ServicesEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/persona")
public class ControllerPersona {
    @Autowired                                                            // Sirve para simplificar el new la instanciacion
    ServicePersona servicesPersona;

    //@ResponseBody

    @GetMapping(path = "/udea/mintic/listarTodosPersona", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> listartodo(){
        return  new ResponseEntity<Object>(servicesPersona.listarTodosPersona(), HttpStatus.OK)  ;
    }

    @PostMapping(path = "/udea/mintic/insertarPersona", consumes =  MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <Boolean> insertarPersona (@RequestBody EntityPersona persona){

        return new ResponseEntity<Boolean>(servicesPersona.insertaPersona(persona), HttpStatus.OK);

    }

    @PatchMapping(path = "/udea/mintic/actualizarTodoPersona", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarTodoPersona(@RequestBody EntityPersona persona){

        servicesPersona.actualizarTodoPersona(persona);

    }

    @DeleteMapping(path = "/udea/mintic/borrarPersona/{id}")
    public void borrarPersona(@PathVariable Long id){
        servicesPersona.borrarPersona(id);
    }

}
