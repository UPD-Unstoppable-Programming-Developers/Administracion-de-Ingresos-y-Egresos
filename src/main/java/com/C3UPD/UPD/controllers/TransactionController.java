package com.C3UPD.UPD.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.C3UPD.UPD.Models.Transaction;
import com.C3UPD.UPD.services.TransactionService;

@RestController
@RequestMapping("/transaction/")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping()
    private ResponseEntity<List<Transaction>> listAllTransaction (){
        return ResponseEntity.ok(transactionService.getAllTransaction());
    }

    @PostMapping()
    private ResponseEntity<Transaction> save (@RequestBody Transaction transaction){
        Transaction temporal = transactionService.create(transaction);

        try {
            return ResponseEntity.created(new URI("/transaction"+temporal.getId())).body(temporal);

        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping()
    private ResponseEntity<Void> deleteTransaction (@RequestBody Transaction transaction){
        transactionService.delete(transaction);
        return ResponseEntity.ok().build();
    }

    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Transaction>> listTransactionByID (@PathVariable ("id") Long id){
        return ResponseEntity.ok(transactionService.findById(id));
    }

    
}