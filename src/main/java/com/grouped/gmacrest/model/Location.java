package com.grouped.gmacrest.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date_debut")
    private String dateDebut;

    @Column(name="fin_estimee")
    private String finEstimee;

    @Column(name="fin_reelle")
    private String finReelle;

    @ManyToOne @JoinColumn(name="client_id")
    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    @JsonIdentityReference(alwaysAsId = true)
    private Client client;

    @ManyToOne @JoinColumn(name="voiture_id")
    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    @JsonIdentityReference(alwaysAsId = true)
    private Voiture voiture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getFinEstimee() {
        return finEstimee;
    }

    public void setFinEstimee(String finEstimee) {
        this.finEstimee = finEstimee;
    }

    public String getFinReelle() {
        return finReelle;
    }

    public void setFinReelle(String finReelle) {
        this.finReelle = finReelle;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

}
