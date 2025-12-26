package com.Learning.BloodDonationAndRequestPortal.service;

import com.Learning.BloodDonationAndRequestPortal.dto.BloodRequestDTO;
import com.Learning.BloodDonationAndRequestPortal.entity.BloodRequest;

import java.util.List;

public interface BloodRequestService {

    BloodRequest createRequest(BloodRequestDTO dto);
    List<BloodRequest> getPendingRequests();
}

