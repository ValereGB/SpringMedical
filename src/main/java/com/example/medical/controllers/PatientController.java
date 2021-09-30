package com.example.medical.controllers;


import com.example.medical.models.Deplacement;
import com.example.medical.models.Patient;
import com.example.medical.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("patients")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("")
    public List<Patient> findAll() {
        return patientService.findAll();
    }

    @PostMapping("")
    public Patient save(@RequestBody Patient patient) {
        return patientService.save(patient);
    }

    @PutMapping("")
    public Patient putPatient(@RequestBody Patient patient) {
        return patientService.putPatient(patient);
    }

    @GetMapping("{id}")
    public Optional<Patient> findById(@PathVariable Long id) {
        return patientService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        patientService.deleteById(id);
    }
}
