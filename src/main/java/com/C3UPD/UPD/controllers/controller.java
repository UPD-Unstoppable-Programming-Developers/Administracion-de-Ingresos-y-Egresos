package com.C3UPD.UPD.controllers;

import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.services.service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    service service;
    Enterprise enterprise1;

    public controller() {
        this.service = new service();

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
    public Enterprise EnterprisePost(){
        this.enterprise1 = new Enterprise();
        enterprise1.setName("Empresa 123");
        service.setEnterprise(enterprise1);
        return enterprise1;
    }
}
