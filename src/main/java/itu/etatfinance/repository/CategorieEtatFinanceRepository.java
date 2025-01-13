package itu.etatfinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import itu.etatfinance.model.CategorieEtatFinance;

public interface CategorieEtatFinanceRepository extends JpaRepository<CategorieEtatFinance, String> {
}
