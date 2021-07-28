package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.CampaignsDTO;

public interface CampaignService {

	public CampaignsDTO createCampaign(CampaignsDTO dto);
	public CampaignsDTO updateCampaign(CampaignsDTO dto);
	public CampaignsDTO deleteCampaign(CampaignsDTO dto);
}
