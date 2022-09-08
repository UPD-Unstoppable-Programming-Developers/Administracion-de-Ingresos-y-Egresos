package com.C3UPD.UPD.services;

// Import Models
import com.C3UPD.UPD.Models.Employee;
// Import Special Applications
import java.util.List;

public class EmployeeService {
    Employee Employee;
    static List<Employee> Employees;
    static {
        // Aqui podemos añadir datos manualmente con el .add
    }

    // Servicios para la clase Empleado =
    public List<Employee> GetEmployees() {
        return Employees;
    }

    public List<Employee> PostEmployees() {
        return Employees;
    }

    // Servicios para EmpleadoID =
    public Employee GetEmployeeID(int id) {
        Employee = null;
        for (Employee e : Employees) {
            if (e.getId() == id) {
                Employee = e;
                break;
            }
        }
        return Employee;
    }

    public void SetEmployee(Employee Employee) {
        this.Employee = Employee;
    }

    public Employee AddEmployee(Employee NewEmployee) {
        Employees.add(NewEmployee);
        return Employees.get(Employees.size() - 1);
    }
}
