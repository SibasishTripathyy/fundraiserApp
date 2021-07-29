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


import com.ngo.fundraiser.dto.CampaignThemesDTO;
import com.ngo.fundraiser.service.CampaignThemesService;

@RestController
@RequestMapping("/campaigntheme")
public class CampaignThemesController {

	 @Autowired
	  private CampaignThemesService CampaignThemesService;
	    
	    @PostMapping(value="/create", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody CampaignThemesDTO createCampaignThemes(@RequestBody CampaignThemesDTO campaignThemesDTO)
	    {
	    	return this.CampaignThemesService.createCampaignThemes(campaignThemesDTO);
	    }
	       
	    @DeleteMapping(value="/remove", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	    public CampaignThemesDTO deleteCampaignThemes(@RequestBody CampaignThemesDTO campaignThemesDTO)
	    {
	    	return this.CampaignThemesService.deleteCampaignThemes(campaignThemesDTO);
	    }
	}


