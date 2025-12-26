package com.Learning.BloodDonationAndRequestPortal.service;

import com.Learning.BloodDonationAndRequestPortal.entity.Donor;

import java.util.List;

public interface MatchingService {
    List<Donor> findMatchingDonors(Long requestId);
}
