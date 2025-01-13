package itu.etatfinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import itu.etatfinance.model.EtatFinance;

public interface EtatFinanceRepository extends JpaRepository<EtatFinance, String> {
}
