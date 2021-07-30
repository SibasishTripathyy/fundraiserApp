package com.ngo.fundraiser.controller;

import com.ngo.fundraiser.dto.CampaignDonationDTO;
import com.ngo.fundraiser.dto.DonorDTO;
import com.ngo.fundraiser.entity.Donor;
import com.ngo.fundraiser.service.DonorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/donor")
public class DonorController {

    @Autowired
    private DonorService donorService;

    @PostMapping("/create")
    public Donor saveDonor(@RequestBody DonorDTO donorDTO) {
        return donorService.saveDonor(donorDTO);
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CampaignDonationDTO> getAllDonationOfADonor(@PathVariable(name = "id") String id)
    {
    	return this.donorService.getAllDonationOfADonor(id);
    }
    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DonorDTO> getAllDonationOfADonor(){
    	return this.donorService.getAllDonor();
    }
}
