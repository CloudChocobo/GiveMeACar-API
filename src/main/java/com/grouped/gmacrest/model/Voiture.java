package com.grouped.gmacrest.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "voiture")
public class Voiture{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name="agence_id")
    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    @JsonIdentityReference(alwaysAsId = true)
    private Agence agence;

    public Long getId() {
        return id;
    }

    @Column(name="image")
    private String image;

    @Column(name="marque")
    private String marque;

    @Column(name="modele")
    private String modele;

    @Column(name="puissance_fiscale")
    private String puissanceFiscale;

    @Column(name="boite_vitesse")
    private Boolean boiteVitesse;

    @Column(name="nombre_places")
    private int nombrePlaces;

    @Column(name="carburant")
    private String carburant;

    @Column(name="immatriculation")
    private String immatriculation;

    @Column(name="statut")
    private String statut;

    public void setId(Long id) {
        this.id = id;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getPuissanceFiscale() {
        return puissanceFiscale;
    }

    public void setPuissanceFiscale(String puissanceFiscale) {
        this.puissanceFiscale = puissanceFiscale;
    }

    public Boolean getBoiteVitesse() {
        return boiteVitesse;
    }

    public void setBoiteVitesse(Boolean boiteVitesse) {
        this.boiteVitesse = boiteVitesse;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
