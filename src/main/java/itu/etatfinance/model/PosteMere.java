package itu.etatfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "PosteMere")
@Data
@JsonIgnoreProperties({"typePoste"})
public class PosteMere {

    @Id
    @Column(name = "id_poste_mere")
    private String idPosteMere;
    private String nom;
    @Column(name = "id_type_poste")
    private String idTypePoste;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type_poste" , insertable = false , updatable = false)
    private TypePoste typePoste;

    @OneToMany(mappedBy = "posteMere", fetch = FetchType.LAZY)
    private List<PosteFille> posteFilles;
}
