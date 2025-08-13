package com.Learning.BloodDonationAndRequestPortal.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "donors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String bloodType;

    private String city;

    private String phone;
}

