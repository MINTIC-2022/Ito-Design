package ItoDesign.proyectoEmpresa.controller;

import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainPersona;
import ItoDesign.proyectoEmpresa.services.ServicePersona;
import ItoDesign.proyectoEmpresa.services.ServicesEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/persona/")
public class ControllerPersona {
    @Autowired                                                            // Sirve para simplificar el new la instanciacion
    ServicePersona servicesPersona;

    @ResponseBody

    @GetMapping(path = "/sprint/gestionempresa/lista/empleado", produces = MediaType.APPLICATION_JSON_VALUE)

    public ArrayList<DomainPersona> listaEmpleado(){
        return servicesPersona.listar();
    }


    @PostMapping(path = "/sprint/gestionempresa/crearEmpleado",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <DomainPersona> crearEmpleado(@RequestBody DomainPersona empleado){

        boolean salida = servicesPersona.addEmpleado(empleado);

        if(salida == true){

            return new ResponseEntity<DomainPersona>(empleado, HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
    @PostMapping(path = "/sprint/gestionempresa/crearAdministrador/{tipo}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <DomainPersona> crearPersonaCondicional(@RequestBody DomainPersona administrador, @PathVariable String tipo){

        switch (tipo){
            case "Administrador":
                servicesPersona.addAdministrador(administrador, tipo);
                break;
            default:
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<DomainPersona>(administrador,HttpStatus.OK) ;

    }
}
