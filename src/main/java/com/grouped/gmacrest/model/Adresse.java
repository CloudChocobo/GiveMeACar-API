package com.grouped.gmacrest.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "adresse")
public class Adresse {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="rue")
    private String rue;

    @Column(name="ville")
    private String ville;

    @Column(name="code_postal")
    private String codePostal;

//    @OneToOne(mappedBy = "adresse")
//    private Agence agence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

}
