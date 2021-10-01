package com.example.medical.services;

import com.example.medical.models.Deplacement;
import com.example.medical.models.Infirmiere;
import com.example.medical.repositories.DeplacementRepository;
import com.example.medical.repositories.InfirmiereRepository;

import java.util.List;
import java.util.Optional;

public class InfirmiereServiceImpl implements  InfirmiereService{

    private InfirmiereRepository infirmiereRepository;

    public InfirmiereServiceImpl(InfirmiereRepository infirmiereRepository) {
        this.infirmiereRepository = infirmiereRepository;
    }

    @Override
    public List<Infirmiere> findAll() {
        return this.infirmiereRepository.findAll();
    }

    @Override
    public Infirmiere save(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public Infirmiere putInfirmiere(Infirmiere infirmiere) {
        return this.infirmiereRepository.save(infirmiere);
    }

    @Override
    public Optional<Infirmiere> findById(Long id) {
        return this.infirmiereRepository.findById(id);
    }

    @Override
    public List<Infirmiere> findDeplacementInfirmiere() { return this.infirmiereRepository.findDeplacementInfirmiere(); }


    @Override
    public void deleteById(Long id) {
        this.infirmiereRepository.deleteById(id);

    }
}
