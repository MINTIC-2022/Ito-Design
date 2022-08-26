package itoDesign.proyectoEmpresa.Domain;

import lombok.Getter;
import lombok.Setter;

public class DomainEmpresa {

    @Getter
    @Setter
    private String nombre;

    @Getter@Setter
    private String sector;

    @Getter@Setter
    private String nit;

    @Getter@Setter
    private int id;
}
