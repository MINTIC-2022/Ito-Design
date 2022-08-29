package ItoDesign.proyectoEmpresa.services;


import ItoDesign.proyectoEmpresa.domain.DomainEmpresa;
import ItoDesign.proyectoEmpresa.domain.DomainMovimientoDinero;
import org.springframework.stereotype.Service;

@Service
public class ServicesMovimientoDinero {


    public String ingresoDinero(DomainMovimientoDinero movimiento){

        String confIngresarDinero = "se recibe pago por valor de: "+ movimiento.getIngreso();


        return confIngresarDinero;
    }

    public String egresoDinero(DomainMovimientoDinero movimiento){

        String confegresoDinero = "se realiza debito por valor de: "+ movimiento.getEgresos();


        return confegresoDinero;
    }
}
