package ItoDesign.proyectoEmpresa.domain;

import lombok.Getter;
import lombok.Setter;

public class DomainEmpresa {


    @Getter @Setter
    private String nombreEmpresa;

    @Getter @Setter
    private String sector;

    @Getter @Setter
    private String nit;

    @Getter @Setter
    private int id;
}
