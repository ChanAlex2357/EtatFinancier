package itu.etatfinance.controller;

import itu.etatfinance.model.PosteMere;
import itu.etatfinance.service.PosteMereService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteMere")
public class PosteMereController {

    @Autowired
    private PosteMereService posteMereService;

    @GetMapping
    public List<PosteMere> getAllPosteMeres() {
        return posteMereService.getAllPosteMeres();
    }

    @PostMapping
    public PosteMere createPosteMere(@RequestBody PosteMere posteMere) {
        return posteMereService.createPosteMere(posteMere);
    }

    @GetMapping("/{id}")
    public PosteMere getPosteMereById(@PathVariable String id) {
        return posteMereService.getPosteMereById(id);
    }

    @PutMapping("/{id}")
    public PosteMere updatePosteMere(@PathVariable String id, @RequestBody PosteMere posteMere) {
        return posteMereService.updatePosteMere(id, posteMere);
    }

    @DeleteMapping("/{id}")
    public void deletePosteMere(@PathVariable String id) {
        posteMereService.deletePosteMere(id);
    }
}
