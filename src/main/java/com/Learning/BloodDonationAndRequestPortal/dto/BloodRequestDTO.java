package com.Learning.BloodDonationAndRequestPortal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BloodRequestDTO {

    private String bloodType;
    private String city;
    private int quantity;
    private boolean urgent;
}
