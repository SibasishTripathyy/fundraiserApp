package com.ngo.fundraiser.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	public CampaignsDTO updateCampaign(CampaignsDTO dto) {
		if(dto!=null)
		{  
			Optional<User> user=this.userRepository.findById(Integer.valueOf(dto.getCreatedBy()));
			if(user.isPresent())
			{
				
				Optional<Campaigns> optionalCampaign=this.campaignRepository.findById(dto.getCampaignID());
				
				if(optionalCampaign.isPresent())
				{
					if(user.get().getRole().getRoleID()==1 || optionalCampaign.get().getCreatedBy().getUserID().equals(user.get().getUserID()))
					{
						Campaigns campaign=optionalCampaign.get();
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
					else
					{
						CampaignsDTO invalidCampaign=new CampaignsDTO();
						invalidCampaign.setMessage("Invalid Action Performed by the user");
						return invalidCampaign;
					}
				}
				else
				{
					CampaignsDTO invalidCampaign=new CampaignsDTO();
					invalidCampaign.setMessage("Invalid Campaign Id");
					return invalidCampaign;
				}
			}
			else
			{
				CampaignsDTO invalidUserCampaign=new CampaignsDTO();
				invalidUserCampaign.setMessage("Invalid Created By User id");
				return invalidUserCampaign;
			}
		}
		return null;
	}

	@Override
	public CampaignsDTO deleteCampaign(CampaignsDTO dto) {
		if(dto!=null)
		{
			Optional<User> user=this.userRepository.findById(Integer.valueOf(dto.getCreatedBy()));
			if(user.isPresent())
			{
				
				Optional<Campaigns> optionalCampaign=this.campaignRepository.findById(dto.getCampaignID());
				
				if(optionalCampaign.isPresent())
				{
					if(user.get().getRole().getRoleID()==1)
					{
						Campaigns campaign=optionalCampaign.get();
						this.campaignRepository.delete(campaign);
						return CampaignUtils.convertCampaignstoCamapignsDTO(campaign);
					}
					else
					{
						CampaignsDTO invalidCampaign=new CampaignsDTO();
						invalidCampaign.setMessage("Unauthorized user to perform this task please contact admin");
						return invalidCampaign;
					}
				}
				else
				{
					CampaignsDTO invalidCampaign=new CampaignsDTO();
					invalidCampaign.setMessage("Invalid Campaign Id");
					return invalidCampaign;
				}
			}
			else
			{
				CampaignsDTO invalidUserCampaign=new CampaignsDTO();
				invalidUserCampaign.setMessage("Invalid CreatedBy User id");
				return invalidUserCampaign;
			}
		}
		
		return null;
	}

	@Override
	public List<CampaignsDTO> getAllCampaigns() {
		List<Campaigns> campaigns=this.campaignRepository.findAll();
		return campaigns.stream().map((campaign)->CampaignUtils.convertCampaignstoCamapignsDTO(campaign)).collect(Collectors.toList());
	}
	
	@Override
	public List<CampaignsDTO> getCampaignById(String id)
	{
		Optional<User> user=this.userRepository.findById(Integer.parseInt(id));
		if(user.isPresent())
		{
			List<Campaigns> userCampaigns=user.get().getCampaigns();
			
			return userCampaigns.stream().map((campaign)->CampaignUtils.convertCampaignstoCamapignsDTO(campaign)).collect(Collectors.toList());
		}
		else
		{
			List<CampaignsDTO> invalidUser=new ArrayList<>();
			CampaignsDTO invalidUserCampaign=new CampaignsDTO();
			invalidUserCampaign.setMessage("User doesnot exist for the following id");
			invalidUser.add(invalidUserCampaign);
			return invalidUser;
		}
	}

}
