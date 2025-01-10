package itu.etatfinance.model;

import java.util.List;

public class PosteBilan {

    private TypePoste typePoste;
    private List<PosteMere> posteMeres;
    private List<PosteFille> posteFilles;

    // Getters and Setters
    public TypePoste getTypePoste() {
        return typePoste;
    }

    public void setTypePoste(TypePoste typePoste) {
        this.typePoste = typePoste;
    }

    public List<PosteMere> getPosteMeres() {
        return posteMeres;
    }

    public void setPosteMeres(List<PosteMere> posteMeres) {
        this.posteMeres = posteMeres;
    }

    public List<PosteFille> getPosteFilles() {
        return posteFilles;
    }

    public void setPosteFilles(List<PosteFille> posteFilles) {
        this.posteFilles = posteFilles;
    }
}
