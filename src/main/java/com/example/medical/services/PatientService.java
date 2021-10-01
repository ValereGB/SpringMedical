package com.example.medical.services;

import com.example.medical.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> findAll();

    Patient save(Patient patient);

    Patient putPatient(Patient patient);

    Optional<Patient> findById(Long id);

    void deleteById(Long id);

    List<Patient> findDeplacementPatient();
}
