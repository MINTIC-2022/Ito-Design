package ItoDesign.proyectoEmpresa.services;

import ItoDesign.proyectoEmpresa.Repository.EntityEmpresa;
import ItoDesign.proyectoEmpresa.Repository.RepositoryEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class ServicesEmpresa {

    @Autowired
    RepositoryEmpresa repositoryEmpresa;

    public String crearEmpresa(DomainEmpresa empresa){

      String confCrearEmpresa = "La Empresa con Nombre: "+ empresa.getNombreEmpresa()+" ubicada en la "+empresa.getDireccion()+" telefono "+empresa.getTelefono()+" con nit: "+empresa.getNit()+" fue creada correctamente";


        return confCrearEmpresa;
    }

    //METODO VISUALIZAR, SE RELACIONA CON EL Getmapping
   public  List<EntityEmpresa>  visualizarTodosJPA(){

       List <EntityEmpresa> list = repositoryEmpresa.findAll();

    return list;
   }


   public boolean agregarEmpresa(EntityEmpresa empresa){

       try {
           repositoryEmpresa.save(empresa); // SI SE EJECUTA BIEN GUADA Y EN LA PARTE INFERIOR RETORNA UN TRE
       } catch (Exception E) {
           return Boolean.FALSE;// SI NO RETORNA FALSE
       }
       return Boolean.TRUE;
   }

public Boolean actualizarTotalJPA(EntityEmpresa empresa){

    try {
        repositoryEmpresa.save(empresa); // SI SE EJECUTA BIEN GUADA Y EN LA PARTE INFERIOR RETORNA UN TRE
    } catch (Exception E) {
        return Boolean.FALSE;// SI NO RETORNA FALSE
    }
    return Boolean.TRUE;

}




}
