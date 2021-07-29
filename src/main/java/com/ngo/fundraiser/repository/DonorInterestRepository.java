package com.ngo.fundraiser.repository;

import com.ngo.fundraiser.entity.DonorInterest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorInterestRepository extends JpaRepository<DonorInterest, Integer> {
}
