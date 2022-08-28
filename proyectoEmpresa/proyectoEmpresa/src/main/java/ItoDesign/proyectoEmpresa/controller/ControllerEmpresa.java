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
   // http://localhost:8080/Users/harcr/Documents/Ito-Design/proyectoEmpresa/crear
    @RequestMapping(value="/Users/harcr/Documents/Ito-Design/proyectoEmpresa/crear")

    public String visualDatosEmpresa(){

        DomainEmpresa datosEmpresa = new DomainEmpresa();   // Se instancia la clase empresa

        datosEmpresa.setNombreEmpresa("Indega.sa");        //  se modifica el nombre de la clase empresa
        datosEmpresa.setDireccion("avenida 2b # 75An -37");//  se modifica la direccion de la clase empresa
        datosEmpresa.setTelefono(2224415);                 //  se modifica el telefono de la clase empresa
        datosEmpresa.setSector("Alimentos");               //  se agrega el sector como complemento
        datosEmpresa.setNit(10121234);                     //  se modifica el nit de la empresa



       return servicesEmpresa.crearEmpresa(datosEmpresa);
    }

}
