package com.C3UPD.UPD.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Enterprise")
public class Enterprise {
    @Id
<<<<<<< HEAD
    //@GeneratedValue(strategy = GenerationType.AUTO)
=======
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;
    @Column(name = "NIT")
    private String NIT;

    // Constructor
    @OneToMany(mappedBy = "enterprise")
    private List<Transaction> transactionList;

<<<<<<< HEAD
    public Enterprise() {
    }

    public Enterprise(Long id, String name, String address, String phone, String NIT) {
        this.id= id; //Se agrega para funcionar con listas
=======
    public Enterprise(){

    }

    public Enterprise(Long id, String name, String address, String phone, String NIT) {
        this.id = id;
>>>>>>> b7a05de47489727360327c8b67e0448d9d4df034
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.NIT = NIT;
  

    }


    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(Long id) {
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

    /*@Override
    public String toString() {
        
    }*/
}
