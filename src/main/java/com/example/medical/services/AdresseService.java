package com.example.medical.services;

import com.example.medical.models.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseService {
    public List<Adresse> findAll();
    public Adresse save(Adresse adresse) ;

    public Adresse putAdresse(Adresse adresse) ;

    public Optional<Adresse> findById(Long id) ;

    public void deleteById(Long id) ;
}
