package com.example.medical.repositories;

import com.example.medical.models.Infirmiere;
import com.example.medical.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query(value = "select d.cout , d.date , p.nom, p.prenom from Deplacement d inner join Patient p on Deplacement.id = Patient.id", nativeQuery=true)
    List<Patient> findDeplacementPatient();
}
