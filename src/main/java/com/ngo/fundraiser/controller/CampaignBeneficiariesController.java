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
import com.ngo.fundraiser.dto.CampaignBeneficiariesDTO;
import com.ngo.fundraiser.service.CampaignBeneficiariesService;


@RestController
@RequestMapping("/campaignbeneficiaries")
public class CampaignBeneficiariesController {


    @Autowired
    private CampaignBeneficiariesService CampaignBeneficiariesService;
    
    @PostMapping(value="/create", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody CampaignBeneficiariesDTO createCampaignBeneficiary(@RequestBody CampaignBeneficiariesDTO CampaignBeneficiariesDTO)
    {
    	return this.CampaignBeneficiariesService.createCampaignBeneficiary(CampaignBeneficiariesDTO);
    }
    
    @PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public CampaignBeneficiariesDTO updateCampaignBeneficiary(@RequestBody CampaignBeneficiariesDTO CampaignBeneficiariesDTO)
    {
    	return this.CampaignBeneficiariesService.updateCampaignBeneficiary(CampaignBeneficiariesDTO);
    }
    
    @DeleteMapping(value="/remove", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public CampaignBeneficiariesDTO deleteCampaignBeneficiary(@RequestBody CampaignBeneficiariesDTO CampaignBeneficiariesDTO)
    {
    	return this.CampaignBeneficiariesService.deleteCampaignBeneficiary(CampaignBeneficiariesDTO);
    }
}
