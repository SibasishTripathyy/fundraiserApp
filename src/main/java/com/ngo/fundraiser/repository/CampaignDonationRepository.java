package com.ngo.fundraiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ngo.fundraiser.entity.CampaignDonation;

public interface CampaignDonationRepository extends JpaRepository<CampaignDonation, Long>{

}
