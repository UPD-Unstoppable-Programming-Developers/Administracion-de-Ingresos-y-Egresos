package com.C3UPD.UPD.controllers;

import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.services.EnterpriseService;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnterpriseController {
    EnterpriseService service;
    Enterprise enterprise;

    public EnterpriseController() {
        this.service = new EnterpriseService();

    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("hello %s!", name);
    }
    @GetMapping("/enterprise")
    public Enterprise EnterpriseGet(){
        return service.getEnterprise();
    }

    @PostMapping("/enterprise")
    public Enterprise EnterprisePost(@RequestBody Enterprise enterprise){
        //this.enterprise1 = new Enterprise();
        //'enterprise1.setName("Empresa 123");
        //service.setEnterprise(enterprise1);
        return enterprise;
    }
}
