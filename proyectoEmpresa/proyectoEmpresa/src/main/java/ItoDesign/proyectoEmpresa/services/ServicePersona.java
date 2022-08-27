package ItoDesign.proyectoEmpresa.services;

import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainPersona;
import org.springframework.beans.factory.annotation.Autowired;

public class ServicePersona {
    //@Autowired
    //DomainPersona empleado;


    public String crearEmpleado(DomainPersona empleado){

        String confCrearEmpleado = "El empleado con nombre: "+ empleado.getNombre()+"y apellido: "+empleado.getApellido()+"con edad de :"+ empleado.getEdad();


        return confCrearEmpleado;
    }
}
