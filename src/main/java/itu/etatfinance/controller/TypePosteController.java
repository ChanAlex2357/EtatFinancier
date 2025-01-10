package itu.etatfinance.controllers;

import itu.etatfinance.models.TypePoste;
import itu.etatfinance.services.TypePosteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/typePoste")
public class TypePosteController {

    @Autowired
    private TypePosteService typePosteService;

    @GetMapping
    public List<TypePoste> getAllTypePostes() {
        return typePosteService.getAllTypePostes();
    }

    @PostMapping
    public TypePoste createTypePoste(@RequestBody TypePoste typePoste) {
        return typePosteService.createTypePoste(typePoste);
    }

    @GetMapping("/{id}")
    public TypePoste getTypePosteById(@PathVariable String id) {
        return typePosteService.getTypePosteById(id);
    }

    @PutMapping("/{id}")
    public TypePoste updateTypePoste(@PathVariable String id, @RequestBody TypePoste typePoste) {
        return typePosteService.updateTypePoste(id, typePoste);
    }

    @DeleteMapping("/{id}")
    public void deleteTypePoste(@PathVariable String id) {
        typePosteService.deleteTypePoste(id);
    }
}
