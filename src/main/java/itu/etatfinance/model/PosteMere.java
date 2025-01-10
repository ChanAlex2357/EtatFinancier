package itu.etatfinance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PosteMere")
@Data
public class PosteMere {

    @Id
    private String idPosteMere;
    private String nom;
    private String idTypePoste;
}
