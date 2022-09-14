package com.example.testmvc.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "biglietto")
public class Biglietto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BigliettoID")
    private Long bigliettoId;
    @Column(name = "VenditoreID")
    private Long venditoreId;
    @Column(name = "Citta")
    private String citta;
    @Column(name = "Luogo")
    private String luogo;
    @Column(name = "Gruppo")
    private String gruppo;
    @Column(name = "Prezzo")
    private Float prezzo;
    @Column(name = "QuantitaB")
    private int quantitaB;
    @Column(name = "Replica")
    private Date replica;
    @Column(name = "codicereplica")
    private String codiceReplica;
    @Column(name = "Pagamento")
    private String pagamento;

    public Long getBigliettoId() {
        return bigliettoId;
    }

    public void setBigliettoId(Long bigliettoId) {
        this.bigliettoId = bigliettoId;
    }

    public Long getVenditoreId() {
        return venditoreId;
    }

    public void setVenditoreId(Long venditoreId) {
        this.venditoreId = venditoreId;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getGruppo() {
        return gruppo;
    }

    public void setGruppo(String gruppo) {
        this.gruppo = gruppo;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantitaB() {
        return quantitaB;
    }

    public void setQuantitaB(int quantitaB) {
        this.quantitaB = quantitaB;
    }

    public Date getReplica() {
        return replica;
    }

    public void setReplica(Date replica) {
        this.replica = replica;
    }

    public String getCodiceReplica() {
        return codiceReplica;
    }

    public void setCodiceReplica(String codiceReplica) {
        this.codiceReplica = codiceReplica;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
}
