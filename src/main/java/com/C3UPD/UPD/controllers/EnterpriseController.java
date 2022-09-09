package com.C3UPD.UPD.controllers;

// Import Functions
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
// Import Models and Services
import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.services.EnterpriseService;
// Import Special Applications
import java.util.List;

@RestController
public class EnterpriseController {
    EnterpriseService Service;
    Enterprise Enterprise;

    public EnterpriseController(EnterpriseService Service) {
        this.Service = Service;
    }

    // Orden 1 = Get (Enviar datos publicos)
    @GetMapping("/Enterprise")
    public List<Enterprise> Enterprise() {
        return this.Service.GetRepository();
    }

    // Orden 2 = Post (Enviar datos ocultos)
    @PostMapping(value = "PostEmployee")
    public List<Enterprise> PostEnterprises() {

        return Service.PostEnterprises();
    }

}