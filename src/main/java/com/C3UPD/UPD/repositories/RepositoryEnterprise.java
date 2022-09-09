package com.C3UPD.UPD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.C3UPD.UPD.Models.Enterprise;

@Repository
public interface RepositoryEnterprise extends JpaRepository<Enterprise, Long> {

}