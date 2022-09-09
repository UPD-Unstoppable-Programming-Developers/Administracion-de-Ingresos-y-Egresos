package com.C3UPD.UPD.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Enterprise")
    private String Enterprise;
    @Column(name = "Role")
    private String Role;

    // Constructor
    @OneToMany(mappedBy = "employee")
    private List<Transaction> transactionList;

    public Employee(String email, String name, String enterprise, String role) {
        Email = email;
        Name = name;
        Enterprise = enterprise;
        Role = role;
    }

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEnterprise() {
        return Enterprise;
    }

    public void setEnterprise(String enterprise) {
        Enterprise = enterprise;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public static void add(Employee response) {
    }
}
