package com.C3UPD.UPD.repository;

import com.C3UPD.UPD.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRespository extends JpaRepository<Transaction,Long> {
}
