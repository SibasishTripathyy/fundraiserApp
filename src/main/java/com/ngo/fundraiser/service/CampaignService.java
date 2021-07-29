package com.ngo.fundraiser.service;

import java.util.List;

import com.ngo.fundraiser.dto.CampaignsDTO;

public interface CampaignService {

	public CampaignsDTO createCampaign(CampaignsDTO dto);
	public CampaignsDTO updateCampaign(CampaignsDTO dto);
	public CampaignsDTO deleteCampaign(CampaignsDTO dto);
	public List<CampaignsDTO> getAllCampaigns();
	public List<CampaignsDTO> getCampaignById(String id);
}
