package com.grouped.gmacrest.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity /*correspond au nom de la table*/
/* @table facultatif si la table a le même nom */
@Table(name = "voiture")
public class Voiture_old {

    @Id /* indique que c'est une PK*/
    /* @column facultatif si la colonne dans la bdd a le meme nom, mais on les a tous mis quand même */
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name="agence_id") /*plusieurs voitures pour 1 agence, indique la FK)
    /* permet de faire en sorte qu'on ne retourne que l'id de l'agence, pas l'objet complet : */
    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    @JsonIdentityReference(alwaysAsId = true)
    private Agence agence;

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


    /* Getters et setters, ce qu'on a pas avec Lombok */
    public Long getId() {
        return id;
    }

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
