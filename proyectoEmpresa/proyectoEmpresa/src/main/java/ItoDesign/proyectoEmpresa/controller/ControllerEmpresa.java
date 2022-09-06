package ItoDesign.proyectoEmpresa.controller;

import ItoDesign.proyectoEmpresa.Repository.EntityEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.services.ServicesEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value="/enterprises")
public class ControllerEmpresa {
    @Autowired
    ServicesEmpresa servicesEmpresa;


    @GetMapping(path="/udea/mintic/visualizarTodoJPA",produces = MediaType.APPLICATION_JSON_VALUE)

         public ResponseEntity<Object> visualizarTodoJPA(){
     return new  ResponseEntity <Object>(servicesEmpresa.visualizarTodosJPA(), HttpStatus.OK);
    }


    @PostMapping(path ="/udea/mintic/agregarEmpresaJPA",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)

       public ResponseEntity<Boolean> agregarEmpresa(@RequestBody EntityEmpresa empresa){
    return new ResponseEntity<Boolean>(servicesEmpresa.agregarEmpresa(empresa),HttpStatus.OK);
    }


    @PutMapping(path = "/udea/mintic/actualizarTotalJPA",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)

       public ResponseEntity<Boolean> actualizarTotalJPA(@RequestBody EntityEmpresa empresa){
    return new ResponseEntity<Boolean>( servicesEmpresa.actualizarTotalJPA(empresa), HttpStatus.OK);
}


    @GetMapping(path="/udea/mintic/visualizarFilaJPA/{id}",produces = MediaType.APPLICATION_JSON_VALUE)

        public  ResponseEntity<Object>visualizarTodoIdJPA( @PathVariable  Long id){
    return new  ResponseEntity <Object>(servicesEmpresa.visualizarIdJPA(id), HttpStatus.OK);
    }

    @PatchMapping(path = "/udea/mintic/actualizaParcialJPA",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)

       public ResponseEntity<Object> actualizaParcialJPA(@RequestBody EntityEmpresa empresa){
    return new ResponseEntity<Object>(servicesEmpresa.actualizarParcialJPA(empresa),HttpStatus.OK);
}

    @DeleteMapping(path = "/udea/mintic/eliminarEmpresaJPA/{id}")

        public ResponseEntity<Object> eliminarEmpresa(@PathVariable Long id){
            servicesEmpresa.eliminarEmpresa( id);
     return new ResponseEntity<Object>(HttpStatus.OK);
}


}
