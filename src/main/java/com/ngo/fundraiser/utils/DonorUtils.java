package com.ngo.fundraiser.utils;

import com.ngo.fundraiser.dto.DonorDTO;

import com.ngo.fundraiser.entity.Donor;


public class DonorUtils {
	
	public static Donor convertCampaignDtoztoCamapigns(DonorDTO donorDto)
	{
		Donor donor=new Donor();
		donor.setDonorId(donorDto.getDonorId());
		donor.setName(donorDto.getName());
		donor.setAddress(donorDto.getAddress());
		donor.setContactDetails(donorDto.getContactDetails());
		donor.setEmail(donorDto.getEmail());
		donor.setLoginPassword(donorDto.getLoginPassword());
		donor.setKeepAnonymous(donorDto.isKeepAnonymous());
		
		return donor;
	}
	public static DonorDTO convertDonortoDonorDTO(Donor donor)
	{
		DonorDTO donorDto=new DonorDTO();
		donorDto.setDonorId(donor.getDonorId());
		donorDto.setName(donor.getName());
		donorDto.setAddress(donor.getAddress());
		donorDto.setEmail(donor.getEmail());
		donorDto.setLoginPassword(donor.getLoginPassword());
		donorDto.setKeepAnonymous(donor.isKeepAnonymous());
		
		return donorDto;
	}
}
