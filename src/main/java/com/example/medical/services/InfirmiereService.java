package com.example.medical.services;

import com.example.medical.models.Infirmiere;

import java.util.List;
import java.util.Optional;

public interface InfirmiereService {
    List<Infirmiere> findAll();

    Infirmiere save(Infirmiere infirmiere);

    Infirmiere putInfirmiere(Infirmiere infirmiere);

    Optional<Infirmiere> findById(Long id);

    void deleteById(Long id);

    List<Infirmiere> findDeplacementInfirmiere();
}
