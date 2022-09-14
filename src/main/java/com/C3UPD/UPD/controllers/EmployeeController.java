package com.C3UPD.UPD.controllers;

// Import Functions
import com.C3UPD.UPD.Models.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
// Import Models and Services
import com.C3UPD.UPD.Models.Employee;
import com.C3UPD.UPD.services.EmployeeService;
// Import Special Applications
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/users")
    private ResponseEntity<List<Employee>> listAllEmployee (){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @PostMapping("/users")
    private ResponseEntity<Employee> save (@RequestBody Employee employee){
        Employee temporal = employeeService.create(employee);

        try {
            return ResponseEntity.created(new URI("/employees"+temporal.getId())).body(temporal);

        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/user/{id}")
    private ResponseEntity<Void> deleteEmployee (@PathVariable ("id") Long id){
        Employee employee = employeeService.findById(id).get();
        employeeService.delete(employee);
        return ResponseEntity.ok().build();
    }

    @GetMapping ("/user/{id}")
    private ResponseEntity<Optional<Employee>> listEmployeeByID (@PathVariable ("id") Long id){
        return ResponseEntity.ok(employeeService.findById(id));
    }

    @PatchMapping("/user/{id}")
    private ResponseEntity<Employee> patchEmployee(@RequestBody Employee employeeParam, @PathVariable Long id) {
        try {
            Employee employee = employeeService.findById(id).get();
            return new ResponseEntity<Employee>(employeeService.create(employeeParam), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}