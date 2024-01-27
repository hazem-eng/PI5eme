package com.example.microfinancepi.repositories;

import com.example.microfinancepi.entities.Ordre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdreRepository extends JpaRepository<Ordre,Integer> {
}
