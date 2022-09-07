package ItoDesign.proyectoEmpresa.Repository;

import ItoDesign.proyectoEmpresa.util.EnumPersona;

import javax.persistence.*;

public class EntityPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "edad")
    private Long edad;
    @Column(name = "doc")
    private String doc;
    @Column(name = "Password")
    private String password;

    @JoinColumn(name = "rol_ID")
    @Column(name = "rol")
    @Enumerated (EnumType.STRING)
    private EnumPersona rol;
}
