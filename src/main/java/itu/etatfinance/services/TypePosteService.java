package itu.etatfinance.services;

import itu.etatfinance.models.TypePoste;
import itu.etatfinance.repositories.TypePosteRepository;
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
        return typePosteRepository.findById(id).orElse(null);
    }

    public List<TypePoste> getAllTypePostes() {
        return typePosteRepository.findAll();
    }
}
