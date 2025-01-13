package itu.etatfinance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import itu.etatfinance.model.CategorieEtatFinance;
import itu.etatfinance.repository.CategorieEtatFinanceRepository;

import java.util.List;

@Service
public class CategorieEtatFinanceService {

    @Autowired
    private CategorieEtatFinanceRepository categorieEtatFinanceRepository;

    public List<CategorieEtatFinance> getAllCategorieEtatFinances() {
        return categorieEtatFinanceRepository.findAll();
    }

    public CategorieEtatFinance getCategorieEtatFinanceById(String id) {
        return categorieEtatFinanceRepository.findById(id).orElse(null);
    }

    public CategorieEtatFinance saveCategorieEtatFinance(CategorieEtatFinance categorieEtatFinance) {
        return categorieEtatFinanceRepository.save(categorieEtatFinance);
    }

    public void deleteCategorieEtatFinance(String id) {
        categorieEtatFinanceRepository.deleteById(id);
    }
}
