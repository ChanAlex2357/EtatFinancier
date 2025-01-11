package itu.etatfinance.service;

import itu.etatfinance.model.PosteFille;
import itu.etatfinance.model.PosteMere;
import itu.etatfinance.repository.PosteMereRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteMereService {

    @Autowired
    private PosteMereRepository posteMereRepository;
    public PosteMere createPosteMere(PosteMere posteMere) {
        return posteMereRepository.save(posteMere);
    }

    public PosteMere updatePosteMere(String id, PosteMere posteMere) {
        posteMere.setIdPosteMere(id);
        return posteMereRepository.save(posteMere);
    }

    public void deletePosteMere(String id) {
        posteMereRepository.deleteById(id);
    }

    public PosteMere getPosteMereById(String id) {
        return posteMereRepository.findById(id).orElse(null);
    }

    public List<PosteMere> getAllPosteMeres() {
        return posteMereRepository.findAll();
    }
}
