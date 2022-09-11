package ItoDesign.proyectoEmpresa.Repository;

import lombok.Data;

import javax.persistence.*;


@Data   // PARA PODER INGRESAR A LOS DATOS LOS DEBE ENCAPSULAR Y PARA ELLOR NECESITO LOS SETT Y GETTER
@Entity // ESTA DEPENDIENDIA NO ES DE LOMBOK SI NO DE LAS NUEVAS QUE SE AGREGARON PARA BD
@Table(name="MovimientoDinero")  //la clase se va a mapear contra la tabla persona
public class EntityMovimientoDinero {


    @Id // ESTA ANOTACION CONVIETE LA COLUNA COMO PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.AUTO) // ESTA NOTACION SE VA A  AUTOGENERAR DINAMICAMENTE  SEGUN EL VALOR DEL Id
    private Long id; // PARA EL Id JPA NO RECONOCE LOS DATOS PRIMITIVOS  POR ESO SE CAMBIA A LONG


    @Column(name="ingreso")
    double ingreso;

    @Column(name="egresos")
    double egresos;

    @Column(name="totalIngresos")
    double totalIngresos;


}