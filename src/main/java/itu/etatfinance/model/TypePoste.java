package itu.etatfinance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "TypePoste")
@Data
public class TypePoste {

    @Id
    private String idTypePoste;
    private String val;

    @OneToMany(mappedBy = "typePoste")
    private List<PosteMere> posteMeres;
}
