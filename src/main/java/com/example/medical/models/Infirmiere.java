package com.example.medical.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Infirmiere")
@Data
public class Infirmiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "numeroProfessionnel")
    private int numeroProfessionnel;

    @Column(name = "nom",columnDefinition = "varchar(45)")
    private String nom;

    @Column(name = "prenom",columnDefinition = "varchar(45)")
    private String prenom;

    @Column(name = "telPro")
    private int telPro;

    @Column(name = "telPerso")
    private int telPerso;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="INFIRMIERE_ID")
    private Set<Adresse> adresses;
}
