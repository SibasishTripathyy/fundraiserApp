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

import com.ngo.fundraiser.dto.BeneficiariesDTO;
import com.ngo.fundraiser.service.BeneficiariesService;


@RestController
@RequestMapping("/beneficiaries")
public class BeneficiariesController {

    @Autowired
    private BeneficiariesService beneficiaryService;
    
    @PostMapping(value="/create", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody BeneficiariesDTO createCampaign(@RequestBody BeneficiariesDTO BeneficiariesDTO)
    {
    	return this.beneficiaryService.createBeneficiary(BeneficiariesDTO);
    }
    
    @PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public BeneficiariesDTO updateCampaign(@RequestBody BeneficiariesDTO BeneficiariesDTO)
    {
    	return this.beneficiaryService.updateBeneficiary(BeneficiariesDTO);
    }
    
    @DeleteMapping(value="/remove", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public BeneficiariesDTO deleteCampaign(@RequestBody BeneficiariesDTO BeneficiariesDTO)
    {
    	return this.beneficiaryService.deleteBeneficiary(BeneficiariesDTO);
    }

}
