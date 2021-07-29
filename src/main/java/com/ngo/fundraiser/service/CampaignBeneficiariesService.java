package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.CampaignBeneficiariesDTO;

public interface CampaignBeneficiariesService {
	
	public CampaignBeneficiariesDTO createCampaignBeneficiary(CampaignBeneficiariesDTO dto);
	public CampaignBeneficiariesDTO updateCampaignBeneficiary(CampaignBeneficiariesDTO dto);
	public CampaignBeneficiariesDTO deleteCampaignBeneficiary(CampaignBeneficiariesDTO dto);
}
