package com.example.medical.repositories;

import com.example.medical.models.Deplacement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeplacementRepository extends JpaRepository<Deplacement, Long> {
}
