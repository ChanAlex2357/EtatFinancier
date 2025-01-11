package itu.etatfinance.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Table(name = "PosteFille")
@Data
@JsonIgnoreProperties({"posteMere"})
public class PosteFille {

    @Id
    private String idPosteFille;
    private String nom;
    private int compte;
    private int classe;
    private String idPosteMere;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPosteMere" , insertable = false , updatable = false)
    private PosteMere posteMere;
}
