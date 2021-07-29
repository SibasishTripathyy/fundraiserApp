package com.ngo.fundraiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngo.fundraiser.entity.Beneficiaries;

@Repository
public interface BeneficiariesRepository extends JpaRepository<Beneficiaries, Long> {

}
