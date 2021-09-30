package com.example.medical.services;

import com.example.medical.models.Deplacement;
import com.example.medical.repositories.DeplacementRepository;

import java.util.List;
import java.util.Optional;

public class DeplacementServiceImpl implements DeplacementService{

    private DeplacementRepository deplacementRepository;

    public DeplacementServiceImpl(DeplacementRepository deplacementRepository) {
        this.deplacementRepository = deplacementRepository;
    }

    @Override
    public List<Deplacement> findAll() {
        return this.deplacementRepository.findAll();
    }

    @Override
    public Deplacement save(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }

    @Override
    public Deplacement putDeplacement(Deplacement deplacement) {
        return this.deplacementRepository.save(deplacement);
    }

    @Override
    public Optional<Deplacement> findById(Long id) {
        return this.deplacementRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.deplacementRepository.deleteById(id);

    }
}
