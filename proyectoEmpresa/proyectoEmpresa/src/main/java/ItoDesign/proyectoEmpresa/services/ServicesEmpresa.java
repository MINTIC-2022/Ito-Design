package ItoDesign.proyectoEmpresa.services;

import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import org.springframework.stereotype.Service;
@Service
public class ServicesEmpresa {


    public String crearEmpresa(DomainEmpresa empresa){

      String confCrearEmpresa = "La Empresa con Nombre: "+ empresa.getNombreEmpresa()+" ubicada en la "+empresa.getDireccion()+" telefono "+empresa.getTelefono()+" con nit: "+empresa.getNit()+" fue creada correctamente";


        return confCrearEmpresa;
    }

}
