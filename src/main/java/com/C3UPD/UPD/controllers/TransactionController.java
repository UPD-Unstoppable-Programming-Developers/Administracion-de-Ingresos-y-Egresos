package com.C3UPD.UPD.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.services.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.C3UPD.UPD.Models.Transaction;
import com.C3UPD.UPD.services.TransactionService;

@RestController

public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping("/enterprises/movements")
    private ResponseEntity<List<Transaction>> listAllTransaction (){
        return ResponseEntity.ok(transactionService.getAllTransaction());

    }

    @PostMapping("/enterprises/movements")
    private ResponseEntity<Transaction> save (@RequestBody Transaction transaction){
        Transaction temporal = transactionService.create(transaction);

        try {
            return ResponseEntity.created(new URI("/transaction"+temporal.getId())).body(temporal);

        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("/enterprises/{id}/movements")
    private ResponseEntity<Transaction> save (@RequestBody Transaction transaction, @PathVariable Long id){

        Transaction temporal = transaction;
        Enterprise enterprise = enterpriseService.findById(id).get();
        temporal.setEnterprise(enterprise);
        transactionService.create(transaction);

        try {
            return ResponseEntity.created(new URI("/transaction"+temporal.getId())).body(temporal);

        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @DeleteMapping("/enterprises/movements")
    private ResponseEntity<Void> deleteTransaction (@RequestBody Transaction transaction){
        transactionService.delete(transaction);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/enterprises/{id}/movements")
    private ResponseEntity<Void> deleteTransactionByEnterpriseID (@PathVariable ("id") Long id){
        List<Transaction> transactionList;
        transactionList= transactionService.findTransactionByEnterpriseId(id);
        for(Transaction transaction : transactionList){
            Long transactionsID = transaction.getId();
            Transaction transaction1 = transactionService.findById(transactionsID).get();
            transactionService.delete(transaction1);
        }

        return ResponseEntity.ok().build();
    }

    @GetMapping ("/enterprises/{id}/movements")
    private ResponseEntity<List<Transaction>> listTransactionByID (@PathVariable ("id") Long id){

        return ResponseEntity.ok(transactionService.findTransactionByEnterpriseId(id));
    }

    @PatchMapping("/enterprises/{id}/movements")
    private ResponseEntity<Transaction> patchEnterprise(@RequestBody Transaction transactionParam,@PathVariable Long id) {
        try {
            Transaction temporal = transactionParam;
            Enterprise enterprise = enterpriseService.findById(id).get();
            temporal.setEnterprise(enterprise);
            transactionService.create(temporal);


            return new ResponseEntity<Transaction>(transactionService.create(transactionParam), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
}