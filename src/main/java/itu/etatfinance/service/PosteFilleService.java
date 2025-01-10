package itu.etatfinance.service;

import itu.etatfinance.model.PosteFille;
import itu.etatfinance.repository.PosteFilleRepository;

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

    public PosteFille updatePosteFille(String id, PosteFille posteFille) {
        posteFille.setIdPosteFille(id);
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
