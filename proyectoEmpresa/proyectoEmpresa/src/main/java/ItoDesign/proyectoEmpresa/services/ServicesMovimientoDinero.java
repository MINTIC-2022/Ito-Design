package ItoDesign.proyectoEmpresa.services;


import ItoDesign.proyectoEmpresa.Repository.EntityMovimientoDinero;
import ItoDesign.proyectoEmpresa.Repository.RepositoryEmpresa;
import ItoDesign.proyectoEmpresa.Repository.RepositoryMovimientoDinero;
import ItoDesign.proyectoEmpresa.domain.DomainMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesMovimientoDinero {

    @Autowired
    RepositoryMovimientoDinero RepositoryMovimientoDinero;

    public String ingresoDinero(DomainMovimientoDinero movimiento){

        String confIngresarDinero = "se recibe pago por valor de: "+ movimiento.getIngreso();


        return confIngresarDinero;
    }

    public String egresoDinero(DomainMovimientoDinero movimiento){

        String confegresoDinero = "se realiza debito por valor de: "+ movimiento.getEgresos();


        return confegresoDinero;
    }


    public List<EntityMovimientoDinero> visualizarTotalCompras(){

        List<EntityMovimientoDinero> list = RepositoryMovimientoDinero.findAll();
        return list;
    }
}
