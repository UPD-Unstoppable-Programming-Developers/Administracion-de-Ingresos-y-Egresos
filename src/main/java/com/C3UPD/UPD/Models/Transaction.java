package com.C3UPD.UPD.Models;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    private Long id;
    @Column(name = "Amount")
    private float amount;
    @Column(name = "TypeAmount")
    private boolean typeAmount;
    @Column(name = "Concept")
    private String concept;


    @ManyToOne
    @JoinColumn(name = "employee_id")
    //@Transient
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;

    public Transaction() {

    }

    public Transaction(Long id, float amount, boolean typeAmount, String concept, Employee employee, Enterprise enterprise) {
        this.id = id;
        this.amount = amount;
        this.typeAmount = typeAmount;
        this.concept = concept;
        this.employee = employee;
        this.enterprise = enterprise;
    }

    // Method
    /*
    public int typeAmount(int amount, boolean typeAmount) {
        if (typeAmount == true) {
            return amount;
        } else {
            return -amount;
        }
    }
*/
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