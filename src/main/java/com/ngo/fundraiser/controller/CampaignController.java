package com.ngo.fundraiser.controller;

import com.ngo.fundraiser.dto.CampaignsDTO;
import com.ngo.fundraiser.dto.UserDTO;
import com.ngo.fundraiser.entity.User;
import com.ngo.fundraiser.service.CampaignService;
import com.ngo.fundraiser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;
    
    @PostMapping(value="/create", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody CampaignsDTO createCampaign(@RequestBody CampaignsDTO campaignsDTO)
    {
    	
    	System.out.println(campaignsDTO);
    	return this.campaignService.createCampaign(campaignsDTO);
    }
    
    @PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public CampaignsDTO updateCampaign(@RequestBody CampaignsDTO campaignsDTO)
    {
    	return this.campaignService.updateCampaign(campaignsDTO);
    }
    
    @DeleteMapping(value="/remove", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
    public CampaignsDTO deleteCampaign(@RequestBody CampaignsDTO campaignsDTO)
    {
    	return this.campaignService.deleteCampaign(campaignsDTO);
    }
}
