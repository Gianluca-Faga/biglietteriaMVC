package com.example.testmvc.model;

import javax.persistence.*;

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PrenotazioneID")
    private Long prenotazioneId;
    @Column(name = "ClienteID")
    private Long clienteId;
    @Column(name = "BigliettoID")
    private Long bigliettoId;
    @Column(name = "Quantita")
    private Long quantita;

    public Long getPrenotazioneId() {
        return prenotazioneId;
    }

    public void setPrenotazioneId(Long prenotazioneId) {
        this.prenotazioneId = prenotazioneId;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public Long getBigliettoId() {
        return bigliettoId;
    }

    public void setBigliettoId(Long bigliettoId) {
        this.bigliettoId = bigliettoId;
    }

    public Long getQuantita() {
        return quantita;
    }

    public void setQuantita(Long quantita) {
        this.quantita = quantita;
    }
}
