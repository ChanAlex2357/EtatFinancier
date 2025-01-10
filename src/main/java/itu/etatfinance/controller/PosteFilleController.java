package itu.etatfinance.controller;

import itu.etatfinance.model.PosteFille;
import itu.etatfinance.service.PosteFilleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteFille")
public class PosteFilleController {

    @Autowired
    private PosteFilleService posteFilleService;

    @GetMapping
    public List<PosteFille> getAllPosteFilles() {
        return posteFilleService.getAllPosteFilles();
    }

    @PostMapping
    public PosteFille createPosteFille(@RequestBody PosteFille posteFille) {
        return posteFilleService.createPosteFille(posteFille);
    }

    @GetMapping("/{id}")
    public PosteFille getPosteFilleById(@PathVariable String id) {
        return posteFilleService.getPosteFilleById(id);
    }

    @PutMapping("/{id}")
    public PosteFille updatePosteFille(@PathVariable String id, @RequestBody PosteFille posteFille) {
        return posteFilleService.updatePosteFille(id, posteFille);
    }

    @DeleteMapping("/{id}")
    public void deletePosteFille(@PathVariable String id) {
        posteFilleService.deletePosteFille(id);
    }
}
