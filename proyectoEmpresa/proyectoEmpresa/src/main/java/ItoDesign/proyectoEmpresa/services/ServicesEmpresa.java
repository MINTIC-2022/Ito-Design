package ItoDesign.proyectoEmpresa.services;

import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import org.springframework.stereotype.Service;
@Service
public class ServicesEmpresa {


    public String crearEmpresa(DomainEmpresa empresa){

      String confCrearEmpresa = "la Empresa con nombre: "+ empresa.getNombreEmpresa()+"con nit: "+empresa.getNit()+"fue creada correctamente";


        return confCrearEmpresa;
    }

}
