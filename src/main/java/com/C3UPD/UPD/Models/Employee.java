package com.C3UPD.UPD.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    private Long id;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "Name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "employee")
    private List<Transaction> transactionList;
    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    private List<Role> role;

    public Employee() {

    }

    public Employee(Long id, String email, String password, String name, List<Transaction> transactionList, Enterprise enterprise, List<Role> role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.transactionList = transactionList;
        this.enterprise = enterprise;
        this.role = role;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", transactionList=" + transactionList +
                ", enterprise=" + enterprise +
                ", role=" + role +
                '}';
    }
}
