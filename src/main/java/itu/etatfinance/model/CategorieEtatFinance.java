package itu.etatfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "categorie_etat_finance")
@Data
public class CategorieEtatFinance {

    @Id
    @Column(name = "id_categorie_etat_finance")
    private String idCategorieEtatFinance;
    private String titre;
    private String desce;

    @OneToMany(mappedBy = "categorieEtatFinance")
    private List<PosteEtat> posteEtats;
}
