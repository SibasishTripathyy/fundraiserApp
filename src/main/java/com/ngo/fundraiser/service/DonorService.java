package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.DonorDTO;
import com.ngo.fundraiser.entity.Donor;


public interface DonorService {
    public Donor saveDonor(DonorDTO donorDTO);
}
