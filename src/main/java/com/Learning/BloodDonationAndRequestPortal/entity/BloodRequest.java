package com.Learning.BloodDonationAndRequestPortal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "blood_requests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BloodRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bloodType;
    private String city;
    private int quantity;

    private boolean urgent;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    private LocalDateTime requestTime;
}

