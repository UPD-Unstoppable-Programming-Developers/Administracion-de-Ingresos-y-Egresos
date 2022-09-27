package com.C3UPD.UPD.services;

import com.C3UPD.UPD.Models.Employee;
import com.C3UPD.UPD.Repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee create(Employee employee) {

        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();
    }

    public void delete(Employee employee) {

        employeeRepository.delete(employee);
    }

    public void deleteByID(Long id) {

        employeeRepository.deleteById(id);
    }

    public Optional<Employee> findById(Long id) {

        return employeeRepository.findById(id);
    }

    @Transactional(propagation= Propagation.REQUIRED, readOnly=true, noRollbackFor=Exception.class)
    public Employee findbyEmail(String email){
        return employeeRepository.findByEmail(email);
    }

}
