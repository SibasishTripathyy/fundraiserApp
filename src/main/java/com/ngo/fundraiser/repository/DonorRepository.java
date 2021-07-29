package com.ngo.fundraiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ngo.fundraiser.entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long>{

}
