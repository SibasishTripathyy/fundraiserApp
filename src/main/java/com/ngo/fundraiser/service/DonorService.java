package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.DonorDTO;
import com.ngo.fundraiser.entity.Donor;

import java.util.List;

public interface DonorService {
    public Donor saveDonor(DonorDTO donorDTO);

    public List<Donor> getAllDonors();
}
