package com.Learning.BloodDonationAndRequestPortal.controller;

import com.Learning.BloodDonationAndRequestPortal.dto.BloodRequestDTO;
import com.Learning.BloodDonationAndRequestPortal.entity.BloodRequest;
import com.Learning.BloodDonationAndRequestPortal.service.BloodRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
@RequiredArgsConstructor
public class BloodRequestController {

    private final BloodRequestService service;

    @PostMapping
    public BloodRequest createRequest(
            @RequestBody BloodRequestDTO dto) {
        return service.createRequest(dto);
    }

    @GetMapping("/pending")
    public List<BloodRequest> getPendingRequests() {
        return service.getPendingRequests();
    }
}

