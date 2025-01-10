package itu.etatfinance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itu.etatfinance.model.TypePoste;

@Repository
public interface TypePosteRepository extends JpaRepository<TypePoste, String> {
}
