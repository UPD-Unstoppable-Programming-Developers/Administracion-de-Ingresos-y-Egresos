package com.C3UPD.UPD.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Enterprise")
public class Enterprise {
    @Id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "NIT")
    private String NIT;

    @Transient
    Employee EmployeeOne;

    // Constructor
    @OneToMany(mappedBy = "enterprise")
    private List<Transaction> transactionList;

    public Enterprise() {
        
    }

    public Enterprise(int id, String name, String address, String phone, String NIT, Employee employeeOne) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.NIT = NIT;
        EmployeeOne = employeeOne;

    }

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public Employee getEmployeeOne() {
        return this.EmployeeOne;
    }

    public void setEmployeeOne(Employee EmployeeOne) {
        this.EmployeeOne = EmployeeOne;
    }

}

