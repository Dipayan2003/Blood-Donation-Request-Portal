package com.Learning.BloodDonationAndRequestPortal.service;

import com.Learning.BloodDonationAndRequestPortal.dto.DonorDTO;
import com.Learning.BloodDonationAndRequestPortal.entity.Donor;

import java.util.List;

public interface DonorService {
    Donor registerDonor(DonorDTO donorDTO);
    List<Donor> getAllDonors();
    List<Donor> searchDonors(String bloodType, String city);
}
