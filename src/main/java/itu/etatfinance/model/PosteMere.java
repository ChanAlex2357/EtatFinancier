package itu.etatfinance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "PosteMere")
@Data
public class PosteMere {

    @Id
    private String idPosteMere;
    private String nom;
    private String idTypePoste;

    @ManyToOne
    private TypePoste typePoste;

    @OneToMany(mappedBy = "posteMere")
    private List<PosteFille> posteFilles;
}
