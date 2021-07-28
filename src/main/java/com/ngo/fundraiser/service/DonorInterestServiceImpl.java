package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.DonorInterestDTO;
import com.ngo.fundraiser.entity.Donor;
import com.ngo.fundraiser.entity.DonorInterest;
import com.ngo.fundraiser.entity.Theme;
import com.ngo.fundraiser.repository.DonorInterestRepository;
import com.ngo.fundraiser.repository.DonorRepository;
import com.ngo.fundraiser.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorInterestServiceImpl implements DonorInterestService{

    @Autowired
    private DonorInterestRepository donorInterestRepository;

    @Autowired
    private ThemeRepository themeRepository;

    @Autowired
    private DonorRepository donorRepository;


    @Override
    public DonorInterest saveDonorInterest(DonorInterestDTO donorInterestDTO) {
        DonorInterest donorInterest = new DonorInterest();
        donorInterest.setBudgetedValue(donorInterestDTO.getBudgetedValue());

        Theme theme = themeRepository.getById(donorInterestDTO.getThemeID());
        donorInterest.setThemeID(theme);

        Donor donor = donorRepository.getById(donorInterestDTO.getDonorId());
        donorInterest.setDonorID(donor);

        return donorInterestRepository.save(donorInterest);

    }

    @Override
    public List<DonorInterest> getAllDonorInterests() {
        return donorInterestRepository.findAll();
    }
}
