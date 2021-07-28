package com.ngo.fundraiser.utils;

import com.ngo.fundraiser.dto.CampaignsDTO;
import com.ngo.fundraiser.entity.Campaigns;

public class CampaignUtils {
	
	public static Campaigns convertCampaignDtoztoCamapigns(CampaignsDTO campaignDto)
	{
		Campaigns campaign=new Campaigns();
		campaign.setCampaignID(campaignDto.getCampaignID());
		campaign.setEnd_Date(campaignDto.getEnd_Date());
		campaign.setStart_Date(campaignDto.getStart_Date());
		campaign.setName(campaignDto.getName());
		campaign.setMessage(campaignDto.getMessage());
		campaign.setImageURL(campaignDto.getImageURL());
		campaign.setTarget_Donation(campaignDto.getTarget_Donation());
		campaign.setStatus(campaignDto.getStatus());
		
		return campaign;
		
	}
	
	public static CampaignsDTO convertCampaignstoCamapignsDTO(Campaigns campaign)
	{
		CampaignsDTO campaignDto=new CampaignsDTO();
		campaignDto.setCampaignID(campaign.getCampaignID());
		campaignDto.setEnd_Date(campaign.getEnd_Date());
		campaignDto.setStart_Date(campaign.getStart_Date());
		campaignDto.setName(campaign.getName());
		campaignDto.setMessage(campaign.getMessage());
		campaignDto.setImageURL(campaign.getImageURL());
		campaignDto.setTarget_Donation(campaign.getTarget_Donation());
		campaignDto.setStatus(campaign.getStatus());
		campaignDto.setCreatedBy(String.valueOf(campaign.getCreatedBy().getUserID()));
		return campaignDto;
		
	}


}
