package com.example.etatfinancier.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TypePoste")
public class TypePoste {

    @Id
    private String idTypePoste;
    private String val;

    // Getters and Setters
    public String getIdTypePoste() {
        return idTypePoste;
    }

    public void setIdTypePoste(String idTypePoste) {
        this.idTypePoste = idTypePoste;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
