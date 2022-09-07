package com.C3UPD.UPD.controllers;

import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.services.EnterpriseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {
    EnterpriseService service;
    Enterprise enterprise;
    //List<Enterprise> enterprises;
    //enterprises = new List<Enterprise>();

    public EnterpriseController() {
        this.service = new EnterpriseService();

    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("hello %s!", name);
    }
    @GetMapping("/enterprise")
    public List<Enterprise> getEnterprises(){
        return service.getEnterprises();
    }

    @PostMapping("/enterprise")
    public ResponseEntity<Enterprise> create(@RequestBody Enterprise newEnterprise){
        Enterprise enterprise = service.addEnterprise(newEnterprise);

        //this.enterprise1 = new Enterprise();
        //'enterprise1.setName("Empresa 123");
        //service.setEnterprise(enterprise1);
        return new ResponseEntity<>(enterprise, HttpStatus.CREATED);
    }

    @GetMapping("/enterprise/{id}")
    public Enterprise enterpriseGetId(@PathVariable("id") String id){
        return service.getEnterpriseID(Integer.parseInt(id));
    }



}
