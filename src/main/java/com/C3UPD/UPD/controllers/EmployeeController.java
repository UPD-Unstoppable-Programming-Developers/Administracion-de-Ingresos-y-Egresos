package com.C3UPD.UPD.controllers;

// Import Functions
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
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    private ResponseEntity<List<Employee>> listAllEmployee (){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @PostMapping()
    private ResponseEntity<Employee> save (@RequestBody Employee employee){
        Employee temporal = employeeService.create(employee);

        try {
            return ResponseEntity.created(new URI("/employees"+temporal.getId())).body(temporal);

        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping()
    private ResponseEntity<Void> deleteEmployee (@RequestBody Employee employee){
        employeeService.delete(employee);
        return ResponseEntity.ok().build();
    }

    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Employee>> listEmployeeByID (@PathVariable ("id") Long id){
        return ResponseEntity.ok(employeeService.findById(id));
    }

}