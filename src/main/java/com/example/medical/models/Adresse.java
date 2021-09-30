package com.example.medical.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Adresse")
@Data
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @Column(name = "numero",columnDefinition = "varchar(45)")
    private String numero;

    @Column(name = "rue",columnDefinition = "varchar(45)")
    private String rue;

    @Column(name = "cp",columnDefinition = "varchar(10)")
    private String cp;

    @Column(name = "ville",columnDefinition = "varchar(45)")
    private String ville;
}
