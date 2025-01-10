package itu.etatfinance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TypePoste")
@Data
public class TypePoste {

    @Id
    private String idTypePoste;
    private String val;
}
