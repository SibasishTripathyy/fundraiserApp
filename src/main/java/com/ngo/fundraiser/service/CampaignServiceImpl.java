package com.ngo.fundraiser.service;

import com.ngo.fundraiser.exception.RestrictedAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.fundraiser.dto.CampaignsDTO;
import com.ngo.fundraiser.entity.Campaigns;
import com.ngo.fundraiser.entity.User;
import com.ngo.fundraiser.repository.CampaignsRepository;
import com.ngo.fundraiser.repository.UserRepository;
import com.ngo.fundraiser.utils.CampaignUtils;

@Service
public class CampaignServiceImpl implements CampaignService {

	@Autowired
	CampaignsRepository campaignRepository;
	@Autowired
	UserRepository userRepository;
	@Override
	public CampaignsDTO createCampaign(CampaignsDTO dto) {
		if(dto!=null)
		{
			User user=this.userRepository.findById(Integer.valueOf(dto.getCreatedBy())).get();
			Campaigns campaign= CampaignUtils.convertCampaignDtoztoCamapigns(dto);
			campaign.setCreatedBy(user);
			Campaigns createdCampaign= this.campaignRepository.save(campaign);
			
			return CampaignUtils.convertCampaignstoCamapignsDTO(createdCampaign);
		}
		return null;
	}

	@Override
	public CampaignsDTO updateCampaign(CampaignsDTO dto) throws RestrictedAccessException{
		if(dto==null) {
			throw new IllegalArgumentException("DTO is null");
		}

		Campaigns campaign=this.campaignRepository.findById(dto.getCampaignID()).get();
		if (!dto.getUserID().equals(campaign.getCreatedBy().getUserID())) {
			throw new RestrictedAccessException("User is not the owner of the campaign");
		}

		// For delete mapping exception
		//campaign.getCreatedBy().getRole().getName();

		if(dto.getEnd_Date()!=null)
		campaign.setEnd_Date(dto.getEnd_Date());
		if(dto.getStart_Date()!=null)
		campaign.setStart_Date(dto.getStart_Date());
		if(dto.getName()!=null)
		campaign.setName(dto.getName());
		if(dto.getMessage()!=null)
		campaign.setMessage(dto.getMessage());
		if(dto.getImageURL()!=null)
		campaign.setImageURL(dto.getImageURL());
		if(dto.getTarget_Donation()!=null)
		campaign.setTarget_Donation(dto.getTarget_Donation());
		if(dto.getStatus()!=null)
		campaign.setStatus(dto.getStatus());
		Campaigns createdCampaign= this.campaignRepository.save(campaign);
		return CampaignUtils.convertCampaignstoCamapignsDTO(createdCampaign);

	}

	@Override
	public CampaignsDTO deleteCampaign(CampaignsDTO dto) {
		if(dto!=null)
		{
			Campaigns campaign=this.campaignRepository.findById(dto.getCampaignID()).get();
			this.campaignRepository.delete(campaign);
			return dto;
		}
		
		return null;
	}

}
