package com.C3UPD.UPD.Models;

import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Amount")
    private float amount;
    @Column(name = "TypeAmount")
    private boolean typeAmount;
    @Column(name = "Concept")
<<<<<<< HEAD
    private String Concept;
    @Column(name = "Users")
    private String Users;
=======
    private String concept;
    @Column(name = "Users")
    private String users;
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034

    // Constructor
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    public Transaction(){

    }

<<<<<<< HEAD
    public Transaction(Long id, float amount, boolean typeAmount, String concept, String users, Employee employee, Enterprise enterprise) {
        this.id = id;
        Amount = amount;
        TypeAmount = typeAmount;
        Concept = concept;
        Users = users;
        this.employee = employee;
        this.enterprise = enterprise;
    }

=======
    public Transaction(Long id,float amount, boolean typeAmount, String concept, String users) {
        this.id=id;
        this.amount = amount;
        this.typeAmount = typeAmount;
        this.concept = concept;
        this.users = users;

    }

    // Getters and setters
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public boolean isTypeAmount() {
        return typeAmount;
    }

    public void setTypeAmount(boolean typeAmount) {
        this.typeAmount = typeAmount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getUsers() {
<<<<<<< HEAD
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
=======
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034
    }

}
