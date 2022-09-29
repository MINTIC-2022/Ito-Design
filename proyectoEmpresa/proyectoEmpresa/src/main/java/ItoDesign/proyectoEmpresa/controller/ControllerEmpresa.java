package ItoDesign.proyectoEmpresa.controller;

import ItoDesign.proyectoEmpresa.Repository.EntityEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.services.ServicesEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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


    @PostMapping(path ="/udea/mintic/agregarEmpresaJPA")

       public  RedirectView agregarEmpresa(@ModelAttribute EntityEmpresa empresa, Model modelo){

        modelo.addAttribute (empresa);
        if(servicesEmpresa.agregarEmpresa(empresa).equals(Boolean.TRUE)){
            return  new RedirectView("/crearEmpresa");
        }else{
            return new  RedirectView("/crearEmpresa");
        }
    }




    @PutMapping(path = "/udea/mintic/actualizarTodoJPA")
    public RedirectView actualizarTodoJPA(@ModelAttribute EntityEmpresa empresa, Model modelo) {

        modelo.addAttribute (empresa);
        if(servicesEmpresa.actualizarTotalJPA(empresa).equals(Boolean.TRUE)){
            return  new RedirectView("/visualizarEmpresas");
        }else{
            return new RedirectView("/error");
        }

    }







    @GetMapping(path="/udea/mintic/visualizarFilaJPA/{id}",produces = MediaType.APPLICATION_JSON_VALUE)

        public  ResponseEntity<Object>visualizarTodoIdJPA( @PathVariable  Long id){
    return new  ResponseEntity <Object>(servicesEmpresa.visualizarIdJPA(id), HttpStatus.OK);
    }

    @PatchMapping(path = "/udea/mintic/actualizaParcialJPA",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)

       public ResponseEntity<Object> actualizaParcialJPA(@RequestBody EntityEmpresa empresa){
    return new ResponseEntity<Object>(servicesEmpresa.actualizarParcialJPA(empresa),HttpStatus.OK);
}



    // METODO DELETE PARA TRABAJAR CON TYLIFT
    @DeleteMapping(path = "/udea/mintic/eliminarEmpresaJPA/{id}")
    public RedirectView borrarPersonaJPA(@PathVariable Long id) {

        servicesEmpresa.eliminarEmpresa(id);
        return  new RedirectView("/visualizarEmpresas");
    }


}
