package com.Learning.BloodDonationAndRequestPortal.repository;

import com.Learning.BloodDonationAndRequestPortal.entity.BloodRequest;
import com.Learning.BloodDonationAndRequestPortal.entity.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BloodRequestRepository
        extends JpaRepository<BloodRequest, Long> {

    List<BloodRequest> findByStatus(RequestStatus status);
}

