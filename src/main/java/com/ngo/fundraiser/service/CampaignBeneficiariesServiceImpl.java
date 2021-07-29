package com.ngo.fundraiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.fundraiser.dto.CampaignBeneficiariesDTO;
import com.ngo.fundraiser.entity.Beneficiaries;
import com.ngo.fundraiser.entity.CampaignBeneficiaries;
import com.ngo.fundraiser.entity.Campaigns;
import com.ngo.fundraiser.repository.BeneficiariesRepository;
import com.ngo.fundraiser.repository.CampaignBeneficiariesRepository;
import com.ngo.fundraiser.repository.CampaignsRepository;
import com.ngo.fundraiser.utils.CampaignBeneficiariesUtils;
@Service
public class CampaignBeneficiariesServiceImpl implements CampaignBeneficiariesService {

	@Autowired
	CampaignBeneficiariesRepository campaignBeneficiariesRepository;
	@Autowired
	CampaignsRepository campaignRepository;
	@Autowired
	BeneficiariesRepository beneficiariesRepository;
	@Override
	public CampaignBeneficiariesDTO createCampaignBeneficiary(CampaignBeneficiariesDTO dto) {
		if(dto!=null)
		{
			Campaigns campaigns=this.campaignRepository.findById(dto.getCampaignID()).get();
			Beneficiaries beneficiaries=this.beneficiariesRepository.findById(dto.getBeneficiaryID()).get();
			CampaignBeneficiaries campaignBeneficiaries=CampaignBeneficiariesUtils.convertCampaignBeneficieriesDtoztoCampaignBeneficiaries(dto);
			campaignBeneficiaries.setCampaignID(campaigns);
			campaignBeneficiaries.setBeneficiaryID(beneficiaries);
			CampaignBeneficiaries createdCampaignBeneficiaries=this.campaignBeneficiariesRepository.save(campaignBeneficiaries);
			
			return CampaignBeneficiariesUtils.convertCampaignBeneficiariestoCamapignBeneficiariesDTO(createdCampaignBeneficiaries);
		}
		return null;
	}

	@Override
	public CampaignBeneficiariesDTO updateCampaignBeneficiary(CampaignBeneficiariesDTO dto) {
		
		if(dto!=null)
		{
			CampaignBeneficiaries campaignBeneficiaries=this.campaignBeneficiariesRepository.findById(dto.getcBeneID()).get();
			if(dto.getDonationValue()!=null)
				campaignBeneficiaries.setDonationValue(dto.getDonationValue());
			CampaignBeneficiaries createdCampaignBeneficiaries=this.campaignBeneficiariesRepository.save(campaignBeneficiaries);
			return CampaignBeneficiariesUtils.convertCampaignBeneficiariestoCamapignBeneficiariesDTO(createdCampaignBeneficiaries);
		}
		return null;
	}

	@Override
	public CampaignBeneficiariesDTO deleteCampaignBeneficiary(CampaignBeneficiariesDTO dto) {
		if(dto!=null)
		{
			CampaignBeneficiaries campaignBeneficiaries=this.campaignBeneficiariesRepository.findById(dto.getcBeneID()).get();
			this.campaignBeneficiariesRepository.delete(campaignBeneficiaries);
			return CampaignBeneficiariesUtils.convertCampaignBeneficiariestoCamapignBeneficiariesDTO(campaignBeneficiaries);
		}
		return null;
	}


}
