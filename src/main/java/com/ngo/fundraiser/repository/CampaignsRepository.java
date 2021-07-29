package com.ngo.fundraiser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngo.fundraiser.entity.Campaigns;

@Repository
public interface CampaignsRepository extends JpaRepository<Campaigns, Long>{
	
	

}
