package itu.etatfinance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PosteFille")
@Data
public class PosteFille {

    @Id
    private String idPosteFille;
    private String nom;
    private int compte;
    private int classe;
    private String idPosteMere;
}
