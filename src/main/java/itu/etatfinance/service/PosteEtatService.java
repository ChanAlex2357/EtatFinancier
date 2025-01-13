package itu.etatfinance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import itu.etatfinance.model.PosteEtat;
import itu.etatfinance.repository.PosteEtatRepository;

import java.util.List;

@Service
public class PosteEtatService {

    @Autowired
    private PosteEtatRepository posteEtatRepository;

    public List<PosteEtat> getAllPosteEtats() {
        return posteEtatRepository.findAll();
    }

    public PosteEtat getPosteEtatById(String id) {
        return posteEtatRepository.findById(id).orElse(null);
    }

    public PosteEtat savePosteEtat(PosteEtat posteEtat) {
        return posteEtatRepository.save(posteEtat);
    }

    public void deletePosteEtat(String id) {
        posteEtatRepository.deleteById(id);
    }
}
