package com.ngo.fundraiser.service;

import java.util.List;

import com.ngo.fundraiser.dto.CampaignDonationDTO;
import com.ngo.fundraiser.dto.DonorDTO;
import com.ngo.fundraiser.entity.Donor;


public interface DonorService {
    public Donor saveDonor(DonorDTO donorDTO);
    public List<CampaignDonationDTO> getAllDonationOfADonor(String donorId);
    public List<DonorDTO> getAllDonor();
}
