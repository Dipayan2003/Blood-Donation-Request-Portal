package com.Learning.BloodDonationAndRequestPortal.repository;

import com.Learning.BloodDonationAndRequestPortal.entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonorRepository extends JpaRepository<Donor, Long> {
    List<Donor> findByBloodTypeAndCity(String bloodType, String city);
    List<Donor> findByBloodTypeIgnoreCaseAndCityIgnoreCase(
            String bloodType,
            String city
    );


}
