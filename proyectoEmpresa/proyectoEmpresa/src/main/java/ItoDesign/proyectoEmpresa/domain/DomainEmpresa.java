package ItoDesign.proyectoEmpresa.domain;

import lombok.Getter;
import lombok.Setter;

public class DomainEmpresa {


    @Getter @Setter
    private String nombreEmpresa;

    @Getter @Setter
    private String direccion;

    @Getter @Setter
    private int telefono;

    @Getter @Setter
    private String sector;

    @Getter @Setter
    private int nit;

    @Getter @Setter
    private int id;

}
