package itu.etatfinance.model;

import java.util.List;

import lombok.Data;

@Data
public class PosteBilanVariable {
    private TypePoste typePoste;
    private List<PosteMere> posteMeres;
    private List<PosteFille> posteFilles;

    public PosteBilanVariable(TypePoste typePoste){
        setTypePoste(typePoste);
    }
}
