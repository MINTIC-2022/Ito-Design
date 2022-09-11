package ItoDesign.proyectoEmpresa.Repository;

import lombok.Data;

import javax.persistence.*;

@Data   // PARA PODER INGRESAR A LOS DATOS LOS DEBE ENCAPSULAR Y PARA ELLOR NECESITO LOS SETT Y GETTER
@Entity // ESTA DEPENDIENDIA NO ES DE LOMBOK SI NO DE LAS NUEVAS QUE SE AGREGARON PARA BD
@Table(name="persona")
public class EntityUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "ed" +
            "ad")
    private Long edad;
    @Column(name = "doc")
    private String doc;
    @Column(name = "Password")
    private String password;

    //@JoinColumn(name = "rol_ID")
    //@Column(name = "rol")
    //@Enumerated (EnumType.STRING)
    //private EnumPersona rol;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    //private Collection<EntityEmpresa> empresas;
}
