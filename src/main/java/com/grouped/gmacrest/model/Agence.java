package com.grouped.gmacrest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "agence") /*cherche dans voiture la clé étrangère, indique le lien entre les 2*/
    @JsonBackReference
    private List<Voiture> voitures;

    @OneToOne(cascade = CascadeType.ALL) /*synchronise les MAJ des données*/
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;
}
