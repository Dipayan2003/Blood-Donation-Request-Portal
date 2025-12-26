package com.Learning.BloodDonationAndRequestPortal.service.impl;

import com.Learning.BloodDonationAndRequestPortal.dto.BloodRequestDTO;
import com.Learning.BloodDonationAndRequestPortal.entity.BloodRequest;
import com.Learning.BloodDonationAndRequestPortal.entity.RequestStatus;
import com.Learning.BloodDonationAndRequestPortal.repository.BloodRequestRepository;
import com.Learning.BloodDonationAndRequestPortal.service.BloodRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BloodRequestServiceImpl
        implements BloodRequestService {

    private final BloodRequestRepository repository;

    @Override
    public BloodRequest createRequest(BloodRequestDTO dto) {
        BloodRequest request = BloodRequest.builder()
                .bloodType(dto.getBloodType())
                .city(dto.getCity())
                .quantity(dto.getQuantity())
                .urgent(dto.isUrgent())
                .status(RequestStatus.PENDING)
                .requestTime(LocalDateTime.now())
                .build();
        return repository.save(request);
    }

    @Override
    public List<BloodRequest> getPendingRequests() {
        return repository.findByStatus(RequestStatus.PENDING);
    }
}
