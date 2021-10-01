package com.example.medical.services;

import com.example.medical.models.Patient;
import com.example.medical.repositories.PatientRepository;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }

    @Override
    public Patient save(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Patient putPatient(Patient patient) {
        return this.patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> findById(Long id) {
        return this.patientRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.patientRepository.deleteById(id);

    }

    @Override
    public List<Patient> findDeplacementPatient() { return this.patientRepository.findDeplacementPatient(); }
}
