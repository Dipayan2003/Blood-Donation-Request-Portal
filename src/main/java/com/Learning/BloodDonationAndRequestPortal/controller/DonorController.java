package com.Learning.BloodDonationAndRequestPortal.controller;

import com.Learning.BloodDonationAndRequestPortal.dto.DonorDTO;
import com.Learning.BloodDonationAndRequestPortal.entity.Donor;
import com.Learning.BloodDonationAndRequestPortal.service.DonorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
@RequiredArgsConstructor
public class DonorController {

    private final DonorService donorService;

    @PostMapping("/register")
    public ResponseEntity<Donor> registerDonor(
            @RequestBody DonorDTO donorDTO) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(donorService.registerDonor(donorDTO));
    }

    @GetMapping
    public List<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }

    @GetMapping("/search")
    public List<Donor> searchDonors(
            @RequestParam String bloodType,
            @RequestParam String city) {

        return donorService.searchDonors(bloodType, city);
    }

}
