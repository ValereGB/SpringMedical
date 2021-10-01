package com.example.medical.repositories;

import com.example.medical.models.Infirmiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InfirmiereRepository extends JpaRepository<Infirmiere, Long> {

    @Query(value = "select d.cout , d.date , i.nom, i.prenom from Deplacement d inner join Infirmiere i on Deplacement.id = Infirmiere.id", nativeQuery=true)
    List<Infirmiere> findDeplacementInfirmiere();
}
