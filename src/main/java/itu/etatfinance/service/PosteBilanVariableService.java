package itu.etatfinance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itu.etatfinance.model.AdminBilanVariable;
import itu.etatfinance.model.PosteBilanVariable;
import itu.etatfinance.model.PosteFille;
import itu.etatfinance.model.PosteMere;
import itu.etatfinance.model.TypePoste;

@Service
public class PosteBilanVariableService {

    @Autowired
    TypePosteService typePosteService;

    @Autowired
    PosteMereService posteMereService;

    @Autowired
    PosteFilleService posteFilleService;

    public PosteBilanVariable buildPosteBilanVariable(TypePoste typePoste){
        PosteBilanVariable posteBilan = new PosteBilanVariable(typePoste);
        try {
            posteBilan.setPosteFilles(null);
            setPosteMeres(posteBilan);
            setPosteFilles(posteBilan);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return posteBilan;
    }
    
    private void setPosteMeres(PosteBilanVariable posteBilan){
        List<PosteMere> posteMeres = posteBilan.getTypePoste().getPosteMeres();
        posteBilan.setPosteMeres(posteMeres);
    }
    private void setPosteFilles(PosteBilanVariable posteBilan) {
        List<PosteFille> posteFilles = new ArrayList<>();
        for(PosteMere posteMere : posteBilan.getPosteMeres()){
            posteFilles.addAll( posteMere.getPosteFilles());
        }
        posteBilan.setPosteFilles(posteFilles);
    }
    
    public PosteBilanVariable getPosteBilanVariableActif(){
        return buildPosteBilanVariable(typePosteService.getTypePosteActif());
    }
    
    public PosteBilanVariable getPosteBilanVariablePassifCapitaux(){
        return buildPosteBilanVariable(typePosteService.getTypePostePassifCapitaux());
    }
    
    public PosteBilanVariable getPosteBilanVariableResultat(){
        return buildPosteBilanVariable(typePosteService.getTypePosteResultat());
    }

    public AdminBilanVariable loAdminBilanVariable(){
        AdminBilanVariable adminBilanVariable = new AdminBilanVariable();
        adminBilanVariable.setBilanActif(getPosteBilanVariableActif());
        adminBilanVariable.getBilanActif().getPosteMeres();
        adminBilanVariable.setBilanPassif(getPosteBilanVariablePassifCapitaux());
        adminBilanVariable.setBilanResultat(getPosteBilanVariableResultat());
        return adminBilanVariable;
    }
}
