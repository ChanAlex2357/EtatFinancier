package itu.etatfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import lombok.Data;

@Entity
@Table(name = "poste_etat")
@Data
public class PosteEtat {

    @Id
    @Column(name = "id_poste_etat")
    private String idPosteEtat;
    private String nom;
    private String desce;

    @ManyToOne
    @JoinColumn(name = "id_categorie_etat_finance")
    private CategorieEtatFinance categorieEtatFinance;
}
