package itu.etatfinance.services;

import itu.etatfinance.models.PosteFille;
import itu.etatfinance.repositories.PosteFilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteFilleService {

    @Autowired
    private PosteFilleRepository posteFilleRepository;

    public List<PosteFille> getPosteFilleByPosteMere(String idPosteMere) {
        return posteFilleRepository.findByIdPosteMere(idPosteMere);
    }

    public PosteFille createPosteFille(PosteFille posteFille) {
        return posteFilleRepository.save(posteFille);
    }

    public void deletePosteFille(String id) {
        posteFilleRepository.deleteById(id);
    }

    public PosteFille getPosteFilleById(String id) {
        return posteFilleRepository.findById(id).orElse(null);
    }

    public List<PosteFille> getAllPosteFilles() {
        return posteFilleRepository.findAll();
    }
}
