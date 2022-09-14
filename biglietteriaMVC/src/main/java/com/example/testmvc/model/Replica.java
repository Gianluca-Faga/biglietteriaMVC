package com.example.testmvc.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Replica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ReplicaID")
    private String replicaId;
    @Column(name = "DataReplica")
    private Date dataReplica;

    public String getReplicaId() {
        return replicaId;
    }

    public void setReplicaId(String replicaId) {
        this.replicaId = replicaId;
    }

    public Date getDataReplica() {
        return dataReplica;
    }

    public void setDataReplica(Date dataReplica) {
        this.dataReplica = dataReplica;
    }
}
