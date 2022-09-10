package com.C3UPD.UPD.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
// Import Functions
import org.springframework.web.bind.annotation.*;
// Import Models and Services
import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.services.EnterpriseService;
// Import Special Applications
import java.util.List;

@RestController
@RequestMapping ("/enterprises/")
public class EnterpriseController {
    @Autowired
    private EnterpriseService enterpriseService;
    @GetMapping
    private ResponseEntity<List<Enterprise>> listAllEnterprise (){
        return ResponseEntity.ok(enterpriseService.getAllEnterprise());
}
    @DeleteMapping
    private ResponseEntity<Void> deleteEnterprise (@RequestBody Enterprise enterprise){
        enterpriseService.delete(enterprise);
        return ResponseEntity.ok().build();
    }

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

        return Service.PostEnterprises();
    }
    */

}