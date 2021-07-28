package com.ngo.fundraiser.controller;

import com.ngo.fundraiser.dto.DonorInterestDTO;
import com.ngo.fundraiser.entity.DonorInterest;
import com.ngo.fundraiser.service.DonorInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/donorInterest")
public class DonorInterestController {

    @Autowired
    private DonorInterestService donorInterestService;

    @PostMapping("/create")
    public DonorInterest saveDonorInterest(@RequestBody DonorInterestDTO donorInterestDTO) {

        System.out.println(donorInterestDTO);
        return donorInterestService.saveDonorInterest(donorInterestDTO);
    }

    public List<DonorInterest> getAllDonorInterests() {
        return donorInterestService.getAllDonorInterests();
    }
}
