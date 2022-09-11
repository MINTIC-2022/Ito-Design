package ItoDesign.proyectoEmpresa.services;

import ItoDesign.proyectoEmpresa.Repository.EntityUsuario;
import ItoDesign.proyectoEmpresa.domain.DomainPersona;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ItoDesign.proyectoEmpresa.Repository.RepositoryUsuario;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiceUsuario {
    //@Autowired
    //DomainPersona empleado;


    @Getter
    @Setter
    private String nombrePrograma;
    static ArrayList<DomainPersona> listaP;

    @Autowired
    RepositoryUsuario repositoryUsuario;


    public List<EntityUsuario> listarTodosUsuario(){

        List<EntityUsuario> list = repositoryUsuario.findAll();

        return  list;
    }

    public Boolean insertaUsuario(EntityUsuario persona){
        try {
            repositoryUsuario.save(persona);
        }catch (Exception e){
            return Boolean.FALSE;
        }
        return  Boolean.TRUE;
    }

    public Object actualizarTodoUsuario(EntityUsuario persona){

        EntityUsuario perTemp = repositoryUsuario.findById(persona.getId()).orElse(null);

        if(persona.getNombre() != null){
            perTemp.setNombre(persona.getNombre());
        } else if (persona.getApellido() != null) {
            perTemp.setApellido(persona.getApellido());
        }else if (persona.getEdad() != null) {
            perTemp.setEdad(persona.getEdad());
        }else if (persona.getDoc() != null) {
            perTemp.setDoc(persona.getDoc());
        }else if (persona.getPassword() != null) {
            perTemp.setPassword(persona.getPassword());
        }

        return repositoryUsuario.save(perTemp);

    }


    public  Object actualizarParcialUsuarioJPA(EntityUsuario persona){

        EntityUsuario personaTemp = repositoryUsuario.findById(persona.getId()).orElse(null);
        if (persona.getNombre() != null) {
            personaTemp.setNombre(persona.getNombre());

        } else if (persona.getApellido() != null) {
            personaTemp.setApellido(persona.getApellido());

        } else if (persona.getEdad() != null) {
            personaTemp.setEdad(persona.getEdad());

        } else if (persona.getDoc() != null) {
            personaTemp.setDoc(persona.getDoc());

        } else if (persona.getPassword() != null) {
            personaTemp.setPassword(persona.getPassword());
        }
        return  repositoryUsuario.save(personaTemp);
    }



    public  Boolean borrarPersona(Long id){

        repositoryUsuario.deleteById(id);
        return  Boolean.TRUE;
    }



    public Object  visualizarIdPersonaJPA(Long id){


            return  repositoryUsuario.findById(id);
        }



}
