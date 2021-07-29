package com.ngo.fundraiser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ngo.fundraiser.dto.CampaignDonationDTO;
import com.ngo.fundraiser.service.CampaignDonationService;


@RestController
@RequestMapping("/campaigndonation")
public class CampaignDonationController {

	@Autowired
    private CampaignDonationService CampaignDonationService;
    
    @PostMapping(value="/create", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody CampaignDonationDTO createCampaignBeneficiary(@RequestBody CampaignDonationDTO campaignDonationDTO)
    {
    	return this.CampaignDonationService.createCampaignDonation(campaignDonationDTO);
    }
    
    @PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public CampaignDonationDTO updateCampaignBeneficiary(@RequestBody CampaignDonationDTO campaignDonationDTO)
    {
    	return this.CampaignDonationService.updateCampaignDonation(campaignDonationDTO);
    }
    
    @DeleteMapping(value="/remove", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public CampaignDonationDTO deleteCampaignBeneficiary(@RequestBody CampaignDonationDTO campaignDonationDTO)
    {
    	return this.CampaignDonationService.deleteCampaignDonation(campaignDonationDTO);
    }
}
