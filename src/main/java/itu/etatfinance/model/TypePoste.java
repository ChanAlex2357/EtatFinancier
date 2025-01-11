package itu.etatfinance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.List;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "TypePoste")
@Table(name = "type_poste")
@Data
@JsonIgnoreProperties({"posteMeres"})
public class TypePoste {

    @Id
    @Column(name = "id_type_poste")
    private String idTypePoste;
    private String val;

    @OneToMany(mappedBy = "typePoste", fetch = FetchType.LAZY)
    private List<PosteMere> posteMeres;
}
