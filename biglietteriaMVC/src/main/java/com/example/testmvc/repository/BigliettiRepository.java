package com.example.testmvc.repository;

import com.example.testmvc.model.Biglietto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BigliettiRepository extends JpaRepository<Biglietto, Long> {
}
