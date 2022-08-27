package ItoDesign.proyectoEmpresa.controller;

import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.services.ServicesEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerEmpresa {
    @Autowired                                                            // Sirve para simplificar el new la instanciacion
    ServicesEmpresa servicesEmpresa;

    @ResponseBody
    //http://8080/localhost/empresa/crearEmpresa
    @RequestMapping(value="/Users/harcr/Documents/Ito-Design/proyectoEmpresa/crear")

    public String visualDatosEmpresa(){

        DomainEmpresa datosEmpresa = new DomainEmpresa();

        datosEmpresa.setNombreEmpresa("Indega.sa");
        datosEmpresa.setSector("Alimentos");
        datosEmpresa.setNit("1190989234");



       return servicesEmpresa.crearEmpresa(datosEmpresa);
    }

}
