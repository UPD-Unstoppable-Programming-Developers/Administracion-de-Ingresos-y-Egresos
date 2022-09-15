package com.C3UPD.UPD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.C3UPD.UPD.Models.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Optional<List<Transaction>> findByEnterpriseId(Long id);
    Optional<List<Transaction>> deleteByEnterpriseId(Long id);

}
