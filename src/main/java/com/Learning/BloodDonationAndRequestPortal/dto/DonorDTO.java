package com.Learning.BloodDonationAndRequestPortal.dto;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonorDTO {
    private String name;
    private String email;
    private String bloodType;
    private String city;
    private String phone;
}
