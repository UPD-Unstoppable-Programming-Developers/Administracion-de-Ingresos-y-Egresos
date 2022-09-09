package com.C3UPD.UPD.repository;

import com.C3UPD.UPD.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
