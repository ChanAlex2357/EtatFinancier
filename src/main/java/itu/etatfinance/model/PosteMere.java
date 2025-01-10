package com.example.etatfinancier.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PosteMere")
public class PosteMere {

    @Id
    private String idPosteMere;
    private String nom;
    private String idTypePoste;

    // Getters and Setters
    public String getIdPosteMere() {
        return idPosteMere;
    }

    public void setIdPosteMere(String idPosteMere) {
        this.idPosteMere = idPosteMere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIdTypePoste() {
        return idTypePoste;
    }

    public void setIdTypePoste(String idTypePoste) {
        this.idTypePoste = idTypePoste;
    }
}
