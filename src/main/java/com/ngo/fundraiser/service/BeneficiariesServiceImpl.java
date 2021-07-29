package com.ngo.fundraiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.fundraiser.dto.BeneficiariesDTO;
import com.ngo.fundraiser.entity.Beneficiaries;
import com.ngo.fundraiser.entity.Campaigns;
import com.ngo.fundraiser.repository.BeneficiariesRepository;
import com.ngo.fundraiser.utils.BeneficiariesUtils;
import com.ngo.fundraiser.utils.CampaignUtils;

@Service
public class BeneficiariesServiceImpl implements BeneficiariesService {

	@Autowired
	BeneficiariesRepository beneficiariesRepository;
	@Override
	public BeneficiariesDTO createBeneficiary(BeneficiariesDTO dto) {
		if(dto!=null)
		{
			Beneficiaries beneficiaries=BeneficiariesUtils.convertBeneficieriesDtoztoBeneficiaries(dto);
			Beneficiaries createdBeneficiaries= this.beneficiariesRepository.save(beneficiaries);
			
			return BeneficiariesUtils.convertBeneficiariestoBeneficiariesDTO(createdBeneficiaries);
		}
		return null;
	}

	@Override
	public BeneficiariesDTO updateBeneficiary(BeneficiariesDTO dto) {

		if(dto!=null)
		{
			Beneficiaries beneficiaries=this.beneficiariesRepository.findById(dto.getBeneficiaryID()).get();
			if(dto.getName()!=null)
				beneficiaries.setName(dto.getName());
			if(dto.getAddress()!=null)
				beneficiaries.setAddress(dto.getAddress());
			Beneficiaries createdBeneficiaries= this.beneficiariesRepository.save(beneficiaries);
			return BeneficiariesUtils.convertBeneficiariestoBeneficiariesDTO(createdBeneficiaries);
		}
		return null;
	}

	@Override
	public BeneficiariesDTO deleteBeneficiary(BeneficiariesDTO dto) {
		if(dto!=null)
		{
			Beneficiaries beneficiaries=this.beneficiariesRepository.findById(dto.getBeneficiaryID()).get();
			this.beneficiariesRepository.delete(beneficiaries);
			return BeneficiariesUtils.convertBeneficiariestoBeneficiariesDTO(beneficiaries);
		}
		return null;
	}
 
}
