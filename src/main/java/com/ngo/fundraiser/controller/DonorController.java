package com.ngo.fundraiser.controller;

import com.ngo.fundraiser.dto.DonorDTO;
import com.ngo.fundraiser.entity.Donor;
import com.ngo.fundraiser.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donor")
public class DonorController {

    @Autowired
    private DonorService donorService;

    @PostMapping("/create")
    public Donor saveDonor(@RequestBody DonorDTO donorDTO) {
        return donorService.saveDonor(donorDTO);
    }

    @GetMapping("/getAll")
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }
}
