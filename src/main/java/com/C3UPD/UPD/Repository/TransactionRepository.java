package com.C3UPD.UPD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.C3UPD.UPD.Models.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByEnterpriseId(Long id);
    Transaction deleteByEnterpriseId(Long id);

}
