package com.C3UPD.UPD.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import com.C3UPD.UPD.Models.Enterprise;
import com.C3UPD.UPD.services.EnterpriseService;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enterprises/")

public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping()
    private ResponseEntity<List<Enterprise>> listAllEnterprise() {
        return ResponseEntity.ok(enterpriseService.getAllEnterprise());
    }

    @PostMapping()
    private ResponseEntity<Enterprise> save(@RequestBody Enterprise enterprise) {
        Enterprise temporal = enterpriseService.create(enterprise);

        try {
            return ResponseEntity.created(new URI("/enterprises" + temporal.getId())).body(temporal);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @DeleteMapping(value = "{id}")
    private ResponseEntity<Void> deleteEnterprise(@PathVariable("id") Long id) {
        Enterprise enterprise = enterpriseService.findById(id).get();
        enterpriseService.delete(enterprise);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "{id}")
    private ResponseEntity<Optional<Enterprise>> listEnterpriseByID(@PathVariable("id") Long id) {
        return ResponseEntity.ok(enterpriseService.findById(id));
    }

    @PatchMapping(value = "{id}")
    private ResponseEntity<Enterprise> patchEnterprise(@RequestBody Enterprise enterpriseParam,@PathVariable Long id) {
        try {
            Enterprise enterprise = enterpriseService.findById(id).get();
            return new ResponseEntity<Enterprise>(enterpriseService.create(enterpriseParam), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
