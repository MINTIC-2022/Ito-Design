package itoDesign.proyectoEmpresa.Services;

import itoDesign.proyectoEmpresa.Domain.DomainEmpresa;
import org.springframework.stereotype.Service;
@Service
public class ServicesEmpresa {


 public String crearEmpresa(DomainEmpresa empresa){

     String datosEmpresa="la Empresa con Nombre "+empresa.getNombre()+"con Nit: "+empresa.getNit()+"fue creada correctamente";



     return datosEmpresa;
 }



}
