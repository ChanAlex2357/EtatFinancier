package itu.etatfinance.model;

import java.util.List;

import lombok.Data;

@Data
public class PosteBilan {
    private TypePoste typePoste;
    private List<PosteMere> posteMeres;
    private List<PosteFille> posteFilles;

    public PosteBilan(TypePoste typePoste){
        setTypePoste(typePoste);
    }
}
