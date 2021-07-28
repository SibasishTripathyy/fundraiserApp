package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.DonorInterestDTO;
import com.ngo.fundraiser.entity.DonorInterest;

import java.util.List;

public interface DonorInterestService {
    public DonorInterest saveDonorInterest(DonorInterestDTO donorInterestDTO);

    public List<DonorInterest> getAllDonorInterests();
}
