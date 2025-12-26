package com.Learning.BloodDonationAndRequestPortal.service.impl;

import com.Learning.BloodDonationAndRequestPortal.dto.DonorDTO;
import com.Learning.BloodDonationAndRequestPortal.entity.Donor;
import com.Learning.BloodDonationAndRequestPortal.repository.DonorRepository;
import com.Learning.BloodDonationAndRequestPortal.service.DonorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonorServiceImpl implements DonorService {

    private final DonorRepository donorRepository;

    @Override
    public Donor registerDonor(DonorDTO donorDTO) {
        Donor donor = Donor.builder()
                .name(donorDTO.getName())
                .email(donorDTO.getEmail())
                .bloodType(donorDTO.getBloodType())
                .city(donorDTO.getCity())
                .phone(donorDTO.getPhone())
                .build();
        return donorRepository.save(donor);
    }

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @Override
    public List<Donor> searchDonors(String bloodType, String city) {
        return donorRepository
                .findByBloodTypeIgnoreCaseAndCityIgnoreCase(
                        bloodType.trim(),
                        city.trim()
                );
    }

}
