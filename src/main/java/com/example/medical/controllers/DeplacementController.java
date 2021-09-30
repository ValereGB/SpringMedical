package com.example.medical.controllers;


import com.example.medical.models.Adresse;
import com.example.medical.models.Deplacement;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("deplacements")
public class DeplacementController {

    private DeplacementService deplacementService;

    public DeplacementController(DeplacementService deplacementService) {
        this.deplacementService = deplacementService;
    }

    @GetMapping("")
    public List<Deplacement> findAll() {
        return deplacementService.findAll();
    }

    @PostMapping("")
    public Deplacement save(@RequestBody Deplacement deplacement) {
        return deplacementService.save(deplacement);
    }

    @PutMapping("")
    public Deplacement putDeplacement(@RequestBody Deplacement deplacement) {
        return deplacementService.putDeplacement(deplacement);
    }

    @GetMapping("{id}")
    public Optional<Deplacement> findById(@PathVariable Long id) {
        return deplacementService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        deplacementService.deleteById(id);
    }
}

