package com.example.medical.controllers;

import com.example.medical.models.Infirmiere;
import com.example.medical.services.InfirmiereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("infirmieres")
public class InfirmiereController {

    private InfirmiereService infirmiereService;

    public InfirmiereController(InfirmiereService infirmiereService) {
        this.infirmiereService = infirmiereService;
    }

    @GetMapping("")
    public List<Infirmiere> findAll() {
        return infirmiereService.findAll();
    }

    @PostMapping("")
    public Infirmiere save(@RequestBody Infirmiere infirmiere) {
        return infirmiereService.save(infirmiere);
    }

    @GetMapping("depla")
    public List<Infirmiere> findDeplacementInfirmiere() {
        return infirmiereService.findDeplacementInfirmiere();
    }


    @PutMapping("")
    public Infirmiere putInfirmiere(@RequestBody Infirmiere infirmiere) {
        return infirmiereService.putInfirmiere(infirmiere);
    }

    @GetMapping("{id}")
    public Optional<Infirmiere> findById(@PathVariable Long id) {
        return infirmiereService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        infirmiereService.deleteById(id);
    }
}
