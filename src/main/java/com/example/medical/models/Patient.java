package com.example.medical.models;

import com.example.medical.SexeStatut;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Patient")
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "nom",columnDefinition = "varchar(45)")
    private String nom;

    @Column(name = "prenom",columnDefinition = "varchar(45)")
    private String prenom;

    @Column(name="dateDeNaissance")
    @Temporal(TemporalType.DATE)
    private Date dateDeNaissance;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="PATIENT_ID")
    private Set<Adresse> adresses;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="PATIENT_ID")
    private Set<Infirmiere> infirmieres;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexe" ,length = 3)
    private SexeStatut status;

    @Column(name = "numeroSecuriteSocial")
    private Long numeroSecuriteSocial;
}

