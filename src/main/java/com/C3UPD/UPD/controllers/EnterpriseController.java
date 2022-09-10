package com.C3UPD.UPD.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
// Import Functions
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Import Models and Services
import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.services.EnterpriseService;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

=======
// Import Special Applications
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034
import java.util.List;

@RestController
@RequestMapping ("/enterprises/")
public class EnterpriseController {
<<<<<<< HEAD

    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping
    private ResponseEntity<List<Enterprise>> listAllEnterprise (){
        return ResponseEntity.ok(enterpriseService.getAllEnterprise());
    }


    /*
    Enterprise enterprise;
    //List<Enterprise> enterprises;
    //enterprises = new List<Enterprise>();

    public EnterpriseController() {
        this.service = new EnterpriseService();
=======
    @Autowired
    private EnterpriseService enterpriseService;
    @GetMapping
    private ResponseEntity<List<Enterprise>> listAllEnterprise (){
        return ResponseEntity.ok(enterpriseService.getAllEnterprise());
}
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034


    /* 
    EnterpriseService Service;
    Enterprise Enterprise;

    public EnterpriseController() {
        this.Service = new EnterpriseService();
    }

    // Orden 1 = Get (Enviar datos publicos)
    @GetMapping("/enterprise")
    public List<Enterprise> GetEnterprises() {
        return Service.GetEnterprises();
    }

    // Orden 2 = Post (Enviar datos ocultos)
    @PostMapping(value = "PostEmployee")
    public List<Enterprise> PostEnterprises() {

<<<<<<< HEAD
   */
}
=======
        return Service.PostEnterprises();
    }
    */

}
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034
