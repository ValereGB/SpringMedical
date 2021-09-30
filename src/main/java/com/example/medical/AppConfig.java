package com.example.medical;

import com.example.medical.repositories.AdresseRepository;
import com.example.medical.repositories.DeplacementRepository;
import com.example.medical.repositories.InfirmiereRepository;
import com.example.medical.repositories.PatientRepository;
import com.example.medical.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AdresseService adresseService(AdresseRepository adresseRepository){
        return new AdresseServiceImpl(adresseRepository);
    }

    @Bean
    public DeplacementService deplacementService(DeplacementRepository deplacementRepository){
        return new DeplacementServiceImpl(deplacementRepository);
    }

    @Bean
    public InfirmiereService infirmiereService(InfirmiereRepository infirmiereRepository){
        return new InfirmiereServiceImpl(infirmiereRepository);
    }

    @Bean
    public PatientService patientService(PatientRepository patientRepository){
        return new PatientServiceImpl(patientRepository);
    }
}
