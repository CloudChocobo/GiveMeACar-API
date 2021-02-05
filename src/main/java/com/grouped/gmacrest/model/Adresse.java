package com.grouped.gmacrest.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data

public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rue;
    private String ville;
    @Column(name="code_postal")
    private String codePostal;
}
