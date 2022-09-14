package com.example.testmvc.dao;

import com.example.testmvc.model.Biglietto;
import com.example.testmvc.repository.BigliettiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Servizi {
    @Autowired
    private BigliettiRepository repo;

    public List<Biglietto> listAll() {
        return repo.findAll();
    }

}