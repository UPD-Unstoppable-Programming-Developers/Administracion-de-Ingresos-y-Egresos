package com.C3UPD.UPD.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Email")
    private String email;
    @Column(name = "Name")
    private String name;
    @Column(name = "Enterprise")
    private String enterprise;
    @Column(name = "Role")
    private String role;

    // Constructor
    @OneToMany(mappedBy = "employee")
    private List<Transaction> transactionList;

    public Employee(){

    }

    public Employee(Long id,String email, String name, String enterprise, String role) {
        this.id =id;
        this.email = email;
        this.name = name;
        this.enterprise = enterprise;
        this.role = role;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static void add(Employee response) {
    }
}
