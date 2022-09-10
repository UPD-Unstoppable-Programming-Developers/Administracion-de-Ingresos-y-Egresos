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
    private String concept;
    @Column(name = "Users")
    private String users;

    // Constructor
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    public Transaction(){

    }

    public Transaction(Long id,float amount, boolean typeAmount, String concept, String users) {
        this.id=id;
        this.amount = amount;
        this.typeAmount = typeAmount;
        this.concept = concept;
        this.users = users;

    }

    // Getters and setters
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
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

}
