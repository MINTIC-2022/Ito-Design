package ItoDesign.proyectoEmpresa.services;

import ItoDesign.proyectoEmpresa.Repository.EntityEmpresa;
import ItoDesign.proyectoEmpresa.Repository.RepositoryEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicesEmpresa {
    @Autowired
    RepositoryEmpresa repositoryEmpresa;


   public  List<EntityEmpresa>  visualizarTodosJPA(){
       List <EntityEmpresa> list = repositoryEmpresa.findAll();
    return list;
   }

   public Object visualizarIdJPA(Long id){
      return  repositoryEmpresa.findById(id);
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
        repositoryEmpresa.save(empresa); // SI SE EJECUTA BIEN GUARDA Y EN LA PARTE INFERIOR RETORNA UN TRUE
        } catch (Exception E) {
           return Boolean.FALSE;// SI NO RETORNA FALSE
        }
       return Boolean.TRUE;
   }

   public  Object actualizarParcialJPA(EntityEmpresa empresa){

    EntityEmpresa empresaTemp = repositoryEmpresa.findById(empresa.getId()).orElse(null);
    if (empresa.getNombreEmpresa() != null) {
        empresaTemp.setNombreEmpresa(empresa.getNombreEmpresa());

    } else if (empresa.getDireccion() != null) {
        empresaTemp.setDireccion(empresa.getDireccion());

    } else if (empresa.getTelefono() != null) {
        empresaTemp.setTelefono(empresa.getTelefono());

    } else if (empresa.getSector() != null) {
        empresaTemp.setSector(empresa.getSector());

    } else if (empresa.getNit() != null) {
        empresaTemp.setNit(empresa.getNit());
    }
    return  repositoryEmpresa.save(empresaTemp);
    }

   public  Boolean eliminarEmpresa(Long id){
        repositoryEmpresa.deleteById(id);
    return Boolean.TRUE;
    }

   }
