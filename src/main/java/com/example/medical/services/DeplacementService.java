package com.example.medical.services;

import com.example.medical.models.Deplacement;

import java.util.List;
import java.util.Optional;

public interface DeplacementService {
    List<Deplacement> findAll();

    Deplacement save(Deplacement deplacement);

    Deplacement putDeplacement(Deplacement deplacement);

    Optional<Deplacement> findById(Long id);

    void deleteById(Long id);
}
