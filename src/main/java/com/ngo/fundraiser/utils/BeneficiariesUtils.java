package com.ngo.fundraiser.utils;

import com.ngo.fundraiser.dto.BeneficiariesDTO;
import com.ngo.fundraiser.entity.Beneficiaries;

public class BeneficiariesUtils {

	public static Beneficiaries convertBeneficieriesDtoztoBeneficiaries(BeneficiariesDTO beneficiariesDto)
	{
		Beneficiaries beneficiaries=new Beneficiaries();
		beneficiaries.setBeneficiaryID(beneficiariesDto.getBeneficiaryID());
		beneficiaries.setName(beneficiariesDto.getName());
		beneficiaries.setAddress(beneficiariesDto.getAddress());
		
		return beneficiaries;
	}
	
	public static BeneficiariesDTO convertBeneficiariestoBeneficiariesDTO(Beneficiaries beneficiaries)
	{
		BeneficiariesDTO beneficiariesDto=new BeneficiariesDTO();
		beneficiariesDto.setBeneficiaryID(beneficiaries.getBeneficiaryID());
		beneficiariesDto.setName(beneficiaries.getName());
		beneficiariesDto.setAddress(beneficiaries.getAddress());
		
		return beneficiariesDto;
	}
}
