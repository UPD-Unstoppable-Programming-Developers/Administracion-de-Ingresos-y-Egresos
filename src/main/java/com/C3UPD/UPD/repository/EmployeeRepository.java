package com.C3UPD.UPD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.C3UPD.UPD.Models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

