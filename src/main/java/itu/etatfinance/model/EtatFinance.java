package itu.etatfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import lombok.Data;

@Entity
@Table(name = "etat_finance")
@Data
public class EtatFinance {

    @Id
    @Column(name = "id_etat_finance")
    private String idEtatFinance;
    private double taux;

    @ManyToOne
    @JoinColumn(name = "id_bilan")
    private Bilan bilan;

    @ManyToOne
    @JoinColumn(name = "id_categorie_etat_finance")
    private CategorieEtatFinance categorieEtatFinance;

    @ManyToOne
    @JoinColumn(name = "id_poste_etat")
    private PosteEtat posteEtat;
}
