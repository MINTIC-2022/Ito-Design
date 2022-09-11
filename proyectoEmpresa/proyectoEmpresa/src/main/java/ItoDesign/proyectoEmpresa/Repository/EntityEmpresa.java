package ItoDesign.proyectoEmpresa.Repository;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.lang.annotation.Repeatable;


@Data   // PARA PODER INGRESAR A LOS DATOS LOS DEBE ENCAPSULAR Y PARA ELLOR NECESITO LOS SETT Y GETTER
@Entity // ESTA DEPENDIENDIA NO ES DE LOMBOK SI NO DE LAS NUEVAS QUE SE AGREGARON PARA BD
@Table(name="Empresa")  //la clase se va a mapear contra la tabla persona
public class EntityEmpresa {


    @Id // ESTA ANOTACION CONVIETE LA COLUNA COMO PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.AUTO) // ESTA NOTACION SE VA A  AUTOGENERAR DINAMICAMENTE  SEGUN EL VALOR DEL Id
    private Long id; // PARA EL Id JPA NO RECONOCE LOS DATOS PRIMITIVOS  POR ESO SE CAMBIA A LONG

    @Column(name="nombre")
    private String nombreEmpresa;

    @Column(name="direccion")
    private String direccion;

    @Column(name="telefono")
    private Long telefono;

    @Column(name="sector")
    private String sector;

    @Column(name="nit")
    private String nit;

   // @JoinColumn (name = "id_persona", referencedColumnName = "id")
    //@ManyToOne(optional = false)
    //private EntityPersona idPersona;

}
