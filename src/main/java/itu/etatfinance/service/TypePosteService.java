package itu.etatfinance.service;

import itu.etatfinance.constant.TypePosteConstante;
import itu.etatfinance.model.TypePoste;
import itu.etatfinance.repository.TypePosteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePosteService {

    @Autowired
    private TypePosteRepository typePosteRepository;
    public TypePoste createTypePoste(TypePoste typePoste) {
        return typePosteRepository.save(typePoste);
    }

    public TypePoste updateTypePoste(String id, TypePoste typePoste) {
        typePoste.setIdTypePoste(id);
        return typePosteRepository.save(typePoste);
    }

    public void deleteTypePoste(String id) {
        typePosteRepository.deleteById(id);
    }

    public TypePoste getTypePosteById(String id) {
        System.out.println("ID TYPE POSTE : "+id);
        return typePosteRepository.findById(id).orElse(null);
    }

    public List<TypePoste> getAllTypePostes() {
        return typePosteRepository.findAll();
    }

    public TypePoste getTypePosteActif(){
        return getTypePosteById( TypePosteConstante.ID_TYPE_POSTE_ACTIF);
    }

    public TypePoste getTypePostePassifCapitaux(){
        return getTypePosteById(TypePosteConstante.ID_TYPE_POSTE_PASSIF_ET_CAPITAUX);
    }

    public TypePoste getTypePosteResultat(){
        return getTypePosteById(TypePosteConstante.ID_TYPE_POSTE_RESULTAT);
    }
}
