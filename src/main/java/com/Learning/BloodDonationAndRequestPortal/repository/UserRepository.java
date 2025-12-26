package com.Learning.BloodDonationAndRequestPortal.repository;

import com.Learning.BloodDonationAndRequestPortal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User, Long> {
}

