package com.C3UPD.UPD.Models;

import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Amount")
    private float Amount;
    @Column(name = "TypeAmount")
    private boolean TypeAmount;
    @Column(name = "Concept")
    private String Concept;
    @Column(name = "Users")
    private String Users;

    // Constructor
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    public Transaction() {
    }

    public Transaction(Long id, float amount, boolean typeAmount, String concept, String users, Employee employee, Enterprise enterprise) {
        this.id = id;
        Amount = amount;
        TypeAmount = typeAmount;
        Concept = concept;
        Users = users;
        this.employee = employee;
        this.enterprise = enterprise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float amount) {
        Amount = amount;
    }

    public boolean isTypeAmount() {
        return TypeAmount;
    }

    public void setTypeAmount(boolean typeAmount) {
        TypeAmount = typeAmount;
    }

    public String getConcept() {
        return Concept;
    }

    public void setConcept(String concept) {
        Concept = concept;
    }

    public String getUsers() {
        return Users;
    }

    public void setUsers(String users) {
        Users = users;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
