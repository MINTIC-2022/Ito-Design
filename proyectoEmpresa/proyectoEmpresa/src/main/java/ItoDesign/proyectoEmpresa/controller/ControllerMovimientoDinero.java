package ItoDesign.proyectoEmpresa.controller;

import ItoDesign.proyectoEmpresa.Repository.EntityMovimientoDinero;
import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainMovimientoDinero;
import ItoDesign.proyectoEmpresa.services.ServicesEmpresa;
import ItoDesign.proyectoEmpresa.services.ServicesMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ControllerMovimientoDinero {
    @Autowired                                                            // Sirve para simplificar el new la instanciacion
    ServicesMovimientoDinero ServicesMovimientoDinero;

    @ResponseBody
    // http://localhost:8080//Users/joao/Documents/Ito-Design/proyectoEmpresa/ingreso
    @RequestMapping(value="/Users/joao/Documents/Ito-Design/proyectoEmpresa/ingreso")

    public String visualDatosIngresos(){

        DomainMovimientoDinero datosIngreso = new DomainMovimientoDinero();   // Se instancia la clase empresa

        datosIngreso.setIngreso(900000);        //

        return ServicesMovimientoDinero.ingresoDinero(datosIngreso);
    }
   @RequestMapping(value="/Users/joao/Documents/Ito-Design/proyectoEmpresa/Egreso")

    public String visualDatosEgreso(){

        DomainMovimientoDinero datosEgreso = new DomainMovimientoDinero();   // Se instancia la clase empresa

        datosEgreso.setEgresos(900000);        //

        return ServicesMovimientoDinero.egresoDinero(datosEgreso);
    }

    @GetMapping(path="/udea/mintic/visualizarTotalCompras",produces = MediaType.APPLICATION_JSON_VALUE)

        public ResponseEntity<Object> visualizarTotalCompras(){
            ServicesMovimientoDinero.visualizarTotalCompras();

        return new  ResponseEntity <Object>(ServicesMovimientoDinero.visualizarTotalCompras(), HttpStatus.OK);
    }

}
