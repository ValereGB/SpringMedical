package com.example.medical.controllers;

import com.example.medical.models.Adresse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("adresses")
public class AdresseController {

    private AdresseService adresseService;

    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    @GetMapping("")
    public List<Adresse> findAll() {
        return adresseService.findAll();
    }

    @PostMapping("")
    public Adresse save(@RequestBody Adresse adresse) {
        return adresseService.save(adresse);
    }

    @PutMapping("")
    public Adresse putAdresse(@RequestBody Adresse adresse) {
        return adresseService.putAdresse(adresse);
    }

    @GetMapping("{id}")
    public Optional<Adresse> findById(@PathVariable Long id) {
        return adresseService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        adresseService.deleteById(id);
    }
}
