package com.C3UPD.UPD.Models;

import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private float Amount;
    private boolean TypeAmount;
    private String Concept;
    private String User;

// Constructor
    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name="enterprise_id")
    private Enterprise enterprise;

    public Transaction() {
    }

    public Transaction(float amount, boolean typeAmount, String concept, String user) {
        Amount = amount;
        TypeAmount = typeAmount;
        Concept = concept;
        User = user;
    }

// Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }
}
