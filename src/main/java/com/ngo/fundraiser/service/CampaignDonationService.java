package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.CampaignDonationDTO;

public interface CampaignDonationService {
	public CampaignDonationDTO createCampaignDonation(CampaignDonationDTO dto);
	public CampaignDonationDTO updateCampaignDonation(CampaignDonationDTO dto);
	public CampaignDonationDTO deleteCampaignDonation(CampaignDonationDTO dto);

}
