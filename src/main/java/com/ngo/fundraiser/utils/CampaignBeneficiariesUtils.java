package com.ngo.fundraiser.utils;

import com.ngo.fundraiser.dto.CampaignBeneficiariesDTO;
import com.ngo.fundraiser.entity.CampaignBeneficiaries;


public class CampaignBeneficiariesUtils {

	public static CampaignBeneficiaries convertCampaignBeneficieriesDtoztoCampaignBeneficiaries(CampaignBeneficiariesDTO campaignBeneficiariesDto)
	{
		CampaignBeneficiaries campaignBeneficiaries=new CampaignBeneficiaries();
		campaignBeneficiaries.setcBeneID(campaignBeneficiariesDto.getcBeneID());
		campaignBeneficiaries.setDonationValue(campaignBeneficiariesDto.getDonationValue());
		return campaignBeneficiaries;
	}
	public static CampaignBeneficiariesDTO convertCampaignBeneficiariestoCamapignBeneficiariesDTO(CampaignBeneficiaries campaignBeneficiaries)
	{
		CampaignBeneficiariesDTO campaignBeneficiariesDto=new CampaignBeneficiariesDTO();
		campaignBeneficiariesDto.setCampaignID(campaignBeneficiaries.getCampaignID().getCampaignID());
		campaignBeneficiariesDto.setcBeneID(campaignBeneficiaries.getcBeneID());
		campaignBeneficiariesDto.setDonationValue(campaignBeneficiaries.getDonationValue());
		campaignBeneficiariesDto.setBeneficiaryID(campaignBeneficiaries.getBeneficiaryID().getBeneficiaryID());
		
		return campaignBeneficiariesDto;
	}
}
