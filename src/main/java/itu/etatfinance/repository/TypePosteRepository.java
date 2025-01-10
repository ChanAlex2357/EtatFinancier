package itu.etatfinance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itu.etatfinance.models.TypePoste;

@Repository
public interface TypePosteRepository extends JpaRepository<TypePoste, String> {
}
