package com.C3UPD.UPD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.C3UPD.UPD.Models.Employee;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public void deleteById(Long id);

    public Employee findByEmail(String email);
}
