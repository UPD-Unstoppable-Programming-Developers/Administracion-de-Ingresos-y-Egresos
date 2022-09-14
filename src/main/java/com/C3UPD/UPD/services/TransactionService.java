package com.C3UPD.UPD.services;

// Import Models
import com.C3UPD.UPD.Models.Transaction;
import com.C3UPD.UPD.Repository.TransactionRepository;

// Import Special Applications
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction create(Transaction transaction){

        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransaction(){
        return transactionRepository.findAll();
    }

    public void delete (Transaction transaction){
        transactionRepository.delete(transaction);
    }

    public Optional<Transaction> findById (Long id){
        return transactionRepository.findById(id);
    }
}
