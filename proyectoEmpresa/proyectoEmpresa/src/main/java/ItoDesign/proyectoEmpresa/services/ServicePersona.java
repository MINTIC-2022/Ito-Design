package ItoDesign.proyectoEmpresa.services;

import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainPersona;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ServicePersona {
    //@Autowired
    //DomainPersona empleado;
    @Getter
    @Setter
    private String nombrePrograma;
    static ArrayList<DomainPersona> listaP;

    public ServicePersona(ArrayList<DomainPersona> listaP) {
        this.listaP = listaP;
    }



    public String crearEmpleado(DomainPersona empleado){

        String confCrearEmpleado = "El empleado con nombre: "+ empleado.getNombre()+"y apellido: "+empleado.getApellido()+"con edad de :"+ empleado.getEdad();


        return confCrearEmpleado;
    }

    public Boolean addEmpleado(DomainPersona empleado ){
        DomainPersona objPersona = new DomainPersona();

        objPersona.setNombre(empleado.getNombre());
        objPersona.setApellido(empleado.getApellido());
        objPersona.setEdad(empleado.getEdad());
        objPersona.setId(empleado.getId());
        listaP.add(objPersona);

        return Boolean.TRUE;
    }

    public ArrayList<DomainPersona> listar(){
        return listaP;
    }

    public static DomainPersona buscarEmpleado(int id){
        DomainPersona persona = null;
        for(DomainPersona p : listaP){
            if(p.getId() == id){
                return  p;
            }
        }
        return persona;
    }

    public Boolean addAdministrador(DomainPersona administrador, String tipo ){
        DomainPersona objPersona = new DomainPersona();
        objPersona.setNombre(administrador.getNombre());
        objPersona.setApellido(administrador.getApellido());
        objPersona.setEdad(administrador.getEdad());
        objPersona.setId(administrador.getId());
        objPersona.setTipo(administrador.getTipo());


        System.out.println("Crear persona con tarjeta de identidad");
        listaP.add(objPersona);
        return Boolean.TRUE;
    }
}
