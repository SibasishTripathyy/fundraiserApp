package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.DonorDTO;
import com.ngo.fundraiser.entity.Donor;
import com.ngo.fundraiser.repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonorServiceImpl implements DonorService{

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

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }
}
