package com.ngo.fundraiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.fundraiser.dto.CampaignDonationDTO;
import com.ngo.fundraiser.entity.CampaignDonation;
import com.ngo.fundraiser.entity.Campaigns;
import com.ngo.fundraiser.entity.Donor;
import com.ngo.fundraiser.repository.CampaignDonationRepository;
import com.ngo.fundraiser.repository.CampaignsRepository;
import com.ngo.fundraiser.repository.DonorRepository;
import com.ngo.fundraiser.utils.CampaignDonationUtils;

@Service
public class CampaignDonationServiceImpl implements CampaignDonationService{

	@Autowired
	CampaignsRepository campaignRepository;
	@Autowired
	CampaignDonationRepository campaignDonationRepository;
	@Autowired
	DonorRepository donorRepository;
	@Override
	public CampaignDonationDTO createCampaignDonation(CampaignDonationDTO dto) {
		if(dto!=null)
		{
			Campaigns campaigns=this.campaignRepository.findById(dto.getCampaignID()).get();
			Donor donor=this.donorRepository.findById(dto.getDonorId()).get();
			CampaignDonation campaignDonation=CampaignDonationUtils.convertCampaignDonationDtoztoCampaignDonation(dto);
			campaignDonation.setCampaignID(campaigns);
			campaignDonation.setDonorID(donor);
			CampaignDonation createdCampaignDonation=this.campaignDonationRepository.save(campaignDonation);
			
			return CampaignDonationUtils.convertCampaignDonationstoCamapignBeneficiariesDTO(createdCampaignDonation);
		}
		return null;
	}

}

/*

	@Override
	public CampaignDonationDTO updateCampaignDonation(CampaignDonationDTO dto) {
		if(dto!=null)
		{
			CampaignDonation campaignDonation=this.campaignDonationRepository.findById(dto.getRecieptID()).get();
			if(dto.getDate()!=null)
				campaignDonation.setDate(dto.getDate());
			if(dto.getDonationValue()!=null)
				campaignDonation.setDonationValue(dto.getDonationValue());
			if(dto.getPaymentDetails()!=null)
				campaignDonation.setPaymentDetails(dto.getPaymentDetails());

			CampaignDonation createdCampaignDonation=this.campaignDonationRepository.save(campaignDonation);
			return CampaignDonationUtils.convertCampaignDonationstoCamapignBeneficiariesDTO(createdCampaignDonation);
		}
		return null;
	}

	@Override
	public CampaignDonationDTO deleteCampaignDonation(CampaignDonationDTO dto) {
		if(dto!=null)
		{
			CampaignDonation campaignDonation=this.campaignDonationRepository.findById(dto.getRecieptID()).get();
			this.campaignDonationRepository.delete(campaignDonation);
			return CampaignDonationUtils.convertCampaignDonationstoCamapignBeneficiariesDTO(campaignDonation);
		}
		return null;
	}

	 */
