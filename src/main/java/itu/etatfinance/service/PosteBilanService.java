package itu.etatfinance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itu.etatfinance.model.PosteBilan;
import itu.etatfinance.model.PosteFille;
import itu.etatfinance.model.PosteMere;
import itu.etatfinance.model.TypePoste;

@Service
public class PosteBilanService {

    @Autowired
    TypePosteService typePosteService;

    @Autowired
    PosteMereService posteMereService;

    @Autowired
    PosteFilleService posteFilleService;

    public PosteBilan buildPosteBilan(TypePoste typePoste){
        PosteBilan posteBilan = new PosteBilan(typePoste);
        posteBilan.setPosteFilles(null);
        setPosteMeres(posteBilan);
        setPosteFilles(posteBilan);
        return posteBilan;
    }
    
    private void setPosteMeres(PosteBilan posteBilan){
        List<PosteMere> posteMeres = typePosteService.getPosteMeres(posteBilan.getTypePoste());
        posteBilan.setPosteMeres(posteMeres);
    }
    private void setPosteFilles(PosteBilan posteBilan) {
        List<PosteFille> posteFilles = new ArrayList<>();
        for(PosteMere posteMere : posteBilan.getPosteMeres()){
            posteFilles.addAll( posteMereService.getPosteFilles(posteMere));
        }
        posteBilan.setPosteFilles(posteFilles);
    }
    
    public PosteBilan getPosteBilanActif(){
        return buildPosteBilan(typePosteService.getTypePosteActif());
    }
    
    public PosteBilan getPosteBilanPassifCapitaux(){
        return buildPosteBilan(typePosteService.getTypePostePassifCapitaux());
    }
    
    public PosteBilan getPosteBilanResultat(){
        return buildPosteBilan(typePosteService.getTypePosteResultat());
    }
}
