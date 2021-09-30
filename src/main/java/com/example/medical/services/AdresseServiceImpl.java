package com.example.medical.services;

import com.example.medical.models.Adresse;
import com.example.medical.repositories.AdresseRepository;

import java.util.List;
import java.util.Optional;

public class AdresseServiceImpl implements AdresseService {

    private AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    @Override
    public List<Adresse> findAll() {
        return this.adresseRepository.findAll();
    }

    @Override
    public Adresse save(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    @Override
    public Adresse putAdresse(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    @Override
    public Optional<Adresse> findById(Long id) {
        return this.adresseRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.adresseRepository.deleteById(id);

    }
}
