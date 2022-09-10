package ItoDesign.proyectoEmpresa.services;

import ItoDesign.proyectoEmpresa.Repository.EntityPersona;
import ItoDesign.proyectoEmpresa.Repository.RepositoryEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainPersona;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ItoDesign.proyectoEmpresa.Repository.RepositoryPersona;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServicePersona {
    //@Autowired
    //DomainPersona empleado;


    @Getter
    @Setter
    private String nombrePrograma;
    static ArrayList<DomainPersona> listaP;

    @Autowired
    RepositoryPersona repositoryPersona;


    public List<EntityPersona> listarTodosPersona(){

        List<EntityPersona> list = repositoryPersona.findAll();

        return  list;
    }

    public Boolean insertaPersona(EntityPersona persona){
        try {
            repositoryPersona.save(persona);
        }catch (Exception e){
            return Boolean.FALSE;
        }
        return  Boolean.TRUE;
    }

    public Object actualizarTodoPersona(EntityPersona persona){

        EntityPersona perTemp = repositoryPersona.findById(persona.getId()).orElse(null);

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

        return repositoryPersona.save(perTemp);

    }

    public  Boolean borrarPersona(Long id){

        repositoryPersona.deleteById(id);
        return  Boolean.TRUE;
    }


}
