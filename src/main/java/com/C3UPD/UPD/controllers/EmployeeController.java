package com.C3UPD.UPD.controllers;

// Import Functions
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
// Import Models and Services
import com.C3UPD.UPD.Models.Employee;
import com.C3UPD.UPD.services.EmployeeService;
// Import Special Applications
import java.util.List;

@RestController
public class EmployeeController {
    EmployeeService Service;
    Employee Employee;

    public EmployeeController() {
        this.Service = new EmployeeService();
    }

    // Orden 1 = Get (Enviar datos publicos)
    @GetMapping(value = "GetEmployee")
    public List<Employee> GetEmployees() {
        return Service.GetEmployees();
    }

    // Orden 2 = Post (Enviar datos ocultos)
    @PostMapping(value = "PostEmployee")
    public List<Employee> PostEmployees() {
        return Service.PostEmployees();
    }
}