package com.example.apartmentrentalservice.repository;

import com.example.apartmentrentalservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
