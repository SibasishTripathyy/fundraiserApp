package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.CampaignsDTO;
import com.ngo.fundraiser.exception.RestrictedAccessException;

public interface CampaignService{

	public CampaignsDTO createCampaign(CampaignsDTO dto);
	public CampaignsDTO updateCampaign(CampaignsDTO dto) throws RestrictedAccessException;
	public CampaignsDTO deleteCampaign(CampaignsDTO dto);
}
