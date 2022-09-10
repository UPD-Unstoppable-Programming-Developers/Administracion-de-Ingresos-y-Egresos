package com.C3UPD.UPD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.C3UPD.UPD.Models.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
