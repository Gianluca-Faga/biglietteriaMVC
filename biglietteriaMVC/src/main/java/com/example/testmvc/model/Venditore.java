package com.example.testmvc.model;

import javax.persistence.*;

@Entity
public class Venditore {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VenditoreID")
    private Long venditoreId;
    @Column(name = "nomeazienda")
    private String nomeAzienda;
    @Column(name = "codice")
    private String codice;


    public Long getVenditoreId() {
        return venditoreId;
    }

    public void setVenditoreId(Long venditoreId) {
        this.venditoreId = venditoreId;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
}
