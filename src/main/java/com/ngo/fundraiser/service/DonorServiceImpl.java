package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.CampaignDonationDTO;
import com.ngo.fundraiser.dto.CampaignsDTO;
import com.ngo.fundraiser.dto.DonorDTO;
import com.ngo.fundraiser.entity.Donor;
import com.ngo.fundraiser.repository.DonorRepository;
import com.ngo.fundraiser.utils.CampaignDonationUtils;
import com.ngo.fundraiser.utils.DonorUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonorServiceImpl implements DonorService {

    @Autowired
    private DonorRepository donorRepository;

    @Override
    public Donor saveDonor(DonorDTO donorDTO) {
        Donor donor = new Donor();
        donor.setName(donorDTO.getName());
        donor.setAddress(donorDTO.getAddress());
        donor.setContactDetails(donorDTO.getContactDetails());
        donor.setKeepAnonymous(donorDTO.isKeepAnonymous());
        donor.setEmail(donorDTO.getEmail());
        donor.setLoginPassword(donorDTO.getLoginPassword());

        return donorRepository.save(donor);
    }
    
    public List<CampaignDonationDTO> getAllDonationOfADonor(String donorId)
    {
    	if(donorId!=null)
    	{
    		Optional<Donor> donor=this.donorRepository.findById(Long.valueOf(donorId));
    		
    		if(donor.isPresent())
    		{
    			return donor.get().getCampaignDonations().stream().map((cd)->CampaignDonationUtils.convertCampaignDonationstoCamapignBeneficiariesDTO(cd)).collect(Collectors.toList());
    		}
    		else
    		{
    			List<CampaignDonationDTO> invalidUser=new ArrayList<>();
    			CampaignDonationDTO invalidUserCampaign=new CampaignDonationDTO();
    			invalidUserCampaign.setMessage("Donor doesnot exist for the following id");
    			invalidUser.add(invalidUserCampaign);
    			return invalidUser;
    		}
    	}
    	return null;
    }

	@Override
	public List<DonorDTO> getAllDonor() {
		// TODO Auto-generated method stub
		return this.donorRepository.findAll().stream().map(donor->DonorUtils.convertDonortoDonorDTO(donor)).collect(Collectors.toList());
	}

}
