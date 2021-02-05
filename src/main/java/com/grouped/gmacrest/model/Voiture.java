package com.grouped.gmacrest.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Voiture{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name="agence_id")
    @JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
    @JsonIdentityReference(alwaysAsId = true)
    private Agence agence;

    private String image;
    private String marque;
    private String modele;

    @Column(name="puissance_fiscale")
    private String puissanceFiscale;

    @Column(name="boite_vitesse")
    private Boolean boiteVitesse;

    @Column(name="nombre_places")
    private int nombrePlaces;

    private String carburant;
    private String immatriculation;
    private String statut;
}
