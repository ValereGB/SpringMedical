package com.example.medical.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Deplacement")
@Data
public class Deplacement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @CreationTimestamp
    @Column(name = "date",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ",shape = JsonFormat.Shape.STRING)
    private Date date;

    @Column(name = "cout")
    private double cout;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="DEPLACEMENT_ID")
    private Set<Patient> patients;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="DEPLACEMENT_ID")
    private Set<Infirmiere> infirmieres;

}