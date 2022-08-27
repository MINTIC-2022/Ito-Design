package ItoDesign.proyectoEmpresa.controller;

import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainPersona;
import ItoDesign.proyectoEmpresa.services.ServicePersona;
import ItoDesign.proyectoEmpresa.services.ServicesEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class ControllerPersona {
    @Autowired                                                            // Sirve para simplificar el new la instanciacion
    ServicePersona servicesPersona;

    @ResponseBody
    //http://8080/localhost/empresa/crearEmpresa
    @RequestMapping(value = "/Users/harcr/Documents/Ito-Design/proyectoEmpresa/crear")

    public String visualDatosEmpresa() {

        DomainPersona datosEmpleado = new DomainPersona();

        datosEmpleado.setNombre("Kevin");
        datosEmpleado.setApellido("Lopez");
        datosEmpleado.setId(123456677);


        return servicesPersona.crearEmpleado(datosEmpleado);
    }
}
