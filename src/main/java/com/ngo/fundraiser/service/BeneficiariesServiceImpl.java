package com.ngo.fundraiser.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.fundraiser.dto.BeneficiariesDTO;
import com.ngo.fundraiser.dto.CampaignBeneficiariesDTO;
import com.ngo.fundraiser.entity.Beneficiaries;
import com.ngo.fundraiser.entity.Campaigns;
import com.ngo.fundraiser.entity.User;
import com.ngo.fundraiser.repository.BeneficiariesRepository;
import com.ngo.fundraiser.repository.UserRepository;
import com.ngo.fundraiser.utils.BeneficiariesUtils;
import com.ngo.fundraiser.utils.CampaignUtils;

@Service
public class BeneficiariesServiceImpl implements BeneficiariesService {

	@Autowired
	BeneficiariesRepository beneficiariesRepository;
	@Autowired
	UserRepository userRepository;
	@Override
	public BeneficiariesDTO createBeneficiary(BeneficiariesDTO dto) {
		if(dto!=null)
		{
			Optional<User> user=this.userRepository.findById(Integer.valueOf(dto.getCreatedBy()));
			if(user.isPresent())
			{
				if(user.get().getRole().getRoleID()==1)
				{
					Beneficiaries beneficiaries=BeneficiariesUtils.convertBeneficieriesDtoztoBeneficiaries(dto);
					Beneficiaries createdBeneficiaries= this.beneficiariesRepository.save(beneficiaries);
					
					return BeneficiariesUtils.convertBeneficiariestoBeneficiariesDTO(createdBeneficiaries);
				}
				else
				{
					BeneficiariesDTO invalidCampaign=new BeneficiariesDTO();
					invalidCampaign.setMessage("Invalid Action Performed by the user you need to be admin to perform this operation");
					return invalidCampaign;
				}
			}
			else
			{
				BeneficiariesDTO invalidCampaign=new BeneficiariesDTO();
				invalidCampaign.setMessage("Invalid createdby user");
				return invalidCampaign;
			}
		}
		return null;
	}

	@Override
	public BeneficiariesDTO updateBeneficiary(BeneficiariesDTO dto) {

		if(dto!=null)
		{	
			Optional<User> user=this.userRepository.findById(Integer.valueOf(dto.getCreatedBy()));
		
			if(user.isPresent())
			{
				if(user.get().getRole().getRoleID()==1)
				{
				
					Beneficiaries beneficiaries=this.beneficiariesRepository.findById(dto.getBeneficiaryID()).get();
					if(dto.getName()!=null)
						beneficiaries.setName(dto.getName());
					if(dto.getAddress()!=null)
						beneficiaries.setAddress(dto.getAddress());
					Beneficiaries createdBeneficiaries= this.beneficiariesRepository.save(beneficiaries);
					return BeneficiariesUtils.convertBeneficiariestoBeneficiariesDTO(createdBeneficiaries);
					
				}
				else
				{
					BeneficiariesDTO invalidCampaign=new BeneficiariesDTO();
					invalidCampaign.setMessage("Invalid Action Performed by the user you need to be admin to perform this operation");
					return invalidCampaign;
				}
			}
			else
			{
				BeneficiariesDTO invalidCampaign=new BeneficiariesDTO();
				invalidCampaign.setMessage("Invalid createdby user");
				return invalidCampaign;
			}
		}
		return null;
	}

	@Override
	public BeneficiariesDTO deleteBeneficiary(BeneficiariesDTO dto) {
		if(dto!=null)
		{
			Optional<User> user=this.userRepository.findById(Integer.valueOf(dto.getCreatedBy()));
			
			if(user.isPresent())
			{
				if(user.get().getRole().getRoleID()==1)
				{
					Beneficiaries beneficiaries=this.beneficiariesRepository.findById(dto.getBeneficiaryID()).get();
					this.beneficiariesRepository.delete(beneficiaries);
					return BeneficiariesUtils.convertBeneficiariestoBeneficiariesDTO(beneficiaries);
				}
				else
				{
					BeneficiariesDTO invalidCampaign=new BeneficiariesDTO();
					invalidCampaign.setMessage("Invalid Action Performed by the user you need to be admin to perform this operation");
					return invalidCampaign;
				}
			}
			else
			{
				BeneficiariesDTO invalidCampaign=new BeneficiariesDTO();
				invalidCampaign.setMessage("Invalid createdby user");
				return invalidCampaign;
			}
		}
		return null;
	}
 
}
