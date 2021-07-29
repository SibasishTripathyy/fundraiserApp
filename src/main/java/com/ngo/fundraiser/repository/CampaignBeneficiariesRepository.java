package com.ngo.fundraiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngo.fundraiser.entity.CampaignBeneficiaries;



@Repository
public interface CampaignBeneficiariesRepository extends JpaRepository<CampaignBeneficiaries, Long>{

}
