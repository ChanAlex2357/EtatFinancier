package itu.etatfinance.repository;

import itu.etatfinance.model.TypePoste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePosteRepository extends JpaRepository<TypePoste, String> {
}
