package com.Learning.BloodDonationAndRequestPortal.service.impl;

import com.Learning.BloodDonationAndRequestPortal.entity.BloodRequest;
import com.Learning.BloodDonationAndRequestPortal.entity.Donor;
import com.Learning.BloodDonationAndRequestPortal.repository.BloodRequestRepository;
import com.Learning.BloodDonationAndRequestPortal.repository.DonorRepository;
import com.Learning.BloodDonationAndRequestPortal.service.MatchingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchingServiceImpl implements MatchingService {

    private final BloodRequestRepository requestRepo;
    private final DonorRepository donorRepo;

    @Override
    public List<Donor> findMatchingDonors(Long requestId) {
        BloodRequest request =
                requestRepo.findById(requestId).orElseThrow();

        return donorRepo.findByBloodTypeAndCity(
                request.getBloodType(),
                request.getCity()
        );
    }
}

