package com.C3UPD.UPD.services;

// Import Models
import com.C3UPD.UPD.Models.Employee;
import com.C3UPD.UPD.Repository.EmployeeRepository;
// Import Special Applications
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee create(Employee employee){

        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEnterprise(){

        return employeeRepository.findAll();
    }

    public void delete (Employee employee){
        employeeRepository.delete(employee);
    }

    public Optional<Employee> findById (Long id){
        return employeeRepository.findById(id);
    }

}
