package com.example.etatfinancier.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PosteFille")
public class PosteFille {

    @Id
    private String idPosteFille;
    private String nom;
    private int compte;
    private int classe;
    private String idPosteMere;

    // Getters and Setters
    public String getIdPosteFille() {
        return idPosteFille;
    }

    public void setIdPosteFille(String idPosteFille) {
        this.idPosteFille = idPosteFille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCompte() {
        return compte;
    }

    public void setCompte(int compte) {
        this.compte = compte;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public String getIdPosteMere() {
        return idPosteMere;
    }

    public void setIdPosteMere(String idPosteMere) {
        this.idPosteMere = idPosteMere;
    }
}
