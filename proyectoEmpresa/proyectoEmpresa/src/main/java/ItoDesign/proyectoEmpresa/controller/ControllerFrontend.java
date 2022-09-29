package ItoDesign.proyectoEmpresa.controller;



import ItoDesign.proyectoEmpresa.Repository.EntityEmpresa;
import ItoDesign.proyectoEmpresa.services.ServicesEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ControllerFrontend {

    @Autowired                                                                           // Sirve para simplificar el new la instanciacion
    ServicesEmpresa servicesEmpresa;

// PG PRINCIPAL
    @GetMapping(path = "/index")

    public String home(Model model) {
        return "index";
    }

    @GetMapping(path = "/index2")

    public String home2(Model model) {
        return "index2";
    }



// PG VILUALIZAR PRINCIPAL EMPRESA

    @GetMapping(path = "/PrincipalEmpresas")

    public String PrincipalEmpresas(Model model) {
        return "PrincipalEmpresas";
    }

// PG  AGREGAR EMPRESA

    @GetMapping (path = "/crearEmpresa")
    public String crearEmpresa(Model modelo){

        modelo.addAttribute("Nempresa",new EntityEmpresa());
        return "crearEmpresa";
    }

    // PG VILUALIZAR  EMPRESA_PUT

    @GetMapping(path = "/visualizarEmpresas")
    public String visualizarEmpresas(Model modelo){

            List<EntityEmpresa> listEmpresa = servicesEmpresa.visualizarTodosJPA();

            modelo.addAttribute("empresa", listEmpresa);
            return "visualizarEmpresas";

    }



}


