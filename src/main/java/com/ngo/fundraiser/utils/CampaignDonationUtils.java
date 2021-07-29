package com.ngo.fundraiser.utils;


import com.ngo.fundraiser.dto.CampaignDonationDTO;

import com.ngo.fundraiser.entity.CampaignDonation;

public class CampaignDonationUtils {

	public static CampaignDonation convertCampaignDonationDtoztoCampaignDonation(CampaignDonationDTO CampaignDonationDto)
	{
		CampaignDonation campaignDonation=new CampaignDonation();
		campaignDonation.setRecieptID(CampaignDonationDto.getRecieptID());
		campaignDonation.setDate(CampaignDonationDto.getDate());
		campaignDonation.setDonationValue(CampaignDonationDto.getDonationValue());
		campaignDonation.setPaymentDetails(CampaignDonationDto.getPaymentDetails());
		
		return campaignDonation;
	}
	public static CampaignDonationDTO convertCampaignDonationstoCamapignBeneficiariesDTO(CampaignDonation campaignDonations)
	{
		CampaignDonationDTO campaignDonationsDto=new CampaignDonationDTO();
		campaignDonationsDto.setRecieptID(campaignDonations.getRecieptID());
		campaignDonationsDto.setCampaignID(campaignDonations.getCampaignID().getCampaignID());
		campaignDonationsDto.setDonorId(campaignDonations.getDonorID().getDonorId());
		campaignDonationsDto.setDate(campaignDonations.getDate());
		campaignDonationsDto.setDonationValue(campaignDonations.getDonationValue());
		campaignDonationsDto.setPaymentDetails(campaignDonations.getPaymentDetails());
		
		return campaignDonationsDto;
	}
}
